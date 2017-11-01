package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserRepositoryTests {

    @Autowired
    UserRepository accountRepository;

    @RequestMapping("/info")
    public String getAdminInfo(String currentAccount)
    {
        User account = accountRepository.findByUserName(currentAccount);
        System.out.println(account);
        return account.toString();
    }
    @RequestMapping("/save")
    public String saveUser(User user)
    {
        user.setRegTime("201500908");
        User account = accountRepository.save(user);
        System.out.println(account);
        return account.toString();
    }
    @RequestMapping("/list")
    public List getAll()
    {
        List<User> account = accountRepository.findAll();

        for (User u:account){
            System.out.println(u.toString());
        }
        return account;
    }


    @RequestMapping("/list")
    public List getUserByName()
    {
        List<User> account = accountRepository.findAll();

        for (User u:account){
            System.out.println(u.toString());
        }
        return account;
    }
}