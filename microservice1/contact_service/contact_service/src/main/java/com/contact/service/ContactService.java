package com.contact.service;

import com.contact.enitity.Contact;

import java.util.List;

public interface ContactService  {
    public List<Contact> getContactsOfUser(Long userId);



}
