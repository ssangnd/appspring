package com.sangnd.api.appspring.api;

import com.sangnd.api.appspring.model.Contact;
import com.sangnd.api.appspring.service.ContactService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class ContactController {

    static final Logger logger  = LogManager.getLogger(ContactController.class.getName());

    @Autowired
    private ContactService contactService;

    // displaying list of all contacts
    @GetMapping("/contacts")
    public List<Contact> getAllContact(){
        return contactService.getAllContacts();
    }

    // displaying contact by id
    @GetMapping("/contacts/{id}")
    public Optional<Contact> getContact(@PathVariable Long id){
        return contactService.getContact(id);
    }

    // inserting contact
//    @PostMapping("/contacts")
//    public void addContacts(@RequestBody Contact contact){
//        contactService.addContact(contact);
//    }

    // inserting contact
    @PostMapping("/contacts")
    public Contact addContacts(@RequestBody Contact contact){
      return contactService.addContact(contact);
    }

    //updating contact by id
    @PutMapping("/contacts/{id}")
    public void updateContact(@RequestBody Contact e, @PathVariable Long id){
        contactService.updateContact(e, id);
    }

    // deleting all contacts
    @DeleteMapping("/contacts")
    public void deleteAllContacts(){
        contactService.deleteAllContacts();
    }

    // deleting contact by id
    @DeleteMapping("contacts/{id}")
    public void deleteContactByID(@RequestBody Contact e, @PathVariable Long id){
        contactService.deleteContactByID(id);
    }

    // updating/ patching contact by id
    @PatchMapping("contacts/{id}")
    public void patchContactByID(@RequestBody Contact e, @PathVariable Long id) {
        contactService.patchContact(e, id);
    }
}