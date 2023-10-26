package com.contact.service;

import com.contact.enitity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class ContactServiceImpl implements ContactService{

    List<Contact> list = List.of(
            new Contact(1L,"Shivam@gmail.com" ,"Shivam", 1311L),
            new Contact(2L,"Shubham@gmail.com" ,"Shubham", 1312L),
            new Contact(3L,"Vikash@gmail.com" ,"Vikash", 1313L),
            new Contact(4L,"rehan@gmail.com" ,"rehan", 1314L)
    );
    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
