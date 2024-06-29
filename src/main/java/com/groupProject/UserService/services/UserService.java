package com.groupProject.UserService.services;

import com.groupProject.UserService.dto.User;
import com.groupProject.UserService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {


    //get all the users
    public List<User> getAllUsers();
    //get user by id
    //get user by email
    //create user
    //update user
    //delete user
    //converttoDTO
    //Convert to entity

}
