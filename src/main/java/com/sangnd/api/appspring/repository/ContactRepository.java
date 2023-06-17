package com.sangnd.api.appspring.repository;

import com.sangnd.api.appspring.model.Contact;
import org.springframework.data.repository.CrudRepository;



// interface extending crud repository
public interface ContactRepository extends CrudRepository<Contact, Long>{

}