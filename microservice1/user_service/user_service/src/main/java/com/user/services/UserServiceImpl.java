package com.user.services;

import com.user.enitity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{


    List<User> list= List.of(
            new User( 1311L , "Shivam" ,"9598983589"),
            new User( 1312L , "Shubham" ,"9984036483"),
            new User( 1313L , "Vikash" ,"8439120933")
    );
    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
