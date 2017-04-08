package com.rusamaha.knittyband.services;

import com.rusamaha.knittyband.dao.UserRepository;
import com.rusamaha.knittyband.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by rusamaha on 4/7/17.
 */

@Service
@Transactional
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAll(){
        return (List<User>) userRepository.findAll();
    }
}
