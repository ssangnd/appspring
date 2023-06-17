package com.sangnd.api.appspring.service;

import com.sangnd.api.appspring.model.Contact;
import com.sangnd.api.appspring.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


// contact service class
@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    // fetching all contacts
    public List<Contact> getAllContacts(){
        List<Contact> cons = (List<Contact>)contactRepository.findAll();
        return cons;
    }

    // fetching contact by id
    public Optional<Contact> getContact(Long id){
        return contactRepository.findById(id);
    }

    // inserting contact
//    public void addContact(Contact e) {
//        contactRepository.save(e);
//    }

    public Contact addContact(Contact e) {
      return  contactRepository.save(e);
    }

    // updating contact by id
    public void updateContact(Contact con, Long id){
        if(id == con.getContactID()) {
            contactRepository.save(con);
        }
    }

    // deleting all contacts
    public void deleteAllContacts(){
        contactRepository.deleteAll();
    }

    // deleting contact by id
    public void deleteContactByID(Long id){
        contactRepository.deleteById(id);
    }

    //patching/updating contact by id
    public void patchContact(Contact con, Long id) {
        if(id == con.getContactID()) {
            contactRepository.save(con);
        }
    }
}