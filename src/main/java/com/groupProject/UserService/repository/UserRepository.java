package com.groupProject.UserService.repository;

import com.groupProject.UserService.dto.User;
import com.groupProject.UserService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {


}
