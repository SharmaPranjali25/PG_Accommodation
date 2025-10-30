package com.codewithpranjali.Paying_Guest_Accomdation.controller;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.codewithpranjali.Paying_Guest_Accomdation.entites.User;
import com.codewithpranjali.Paying_Guest_Accomdation.repository.UserRepository;


@RestController
@RequestMapping("/api/users")
public class UserController {
private final UserRepository userRepo;
public UserController(UserRepository userRepo) {
this.userRepo = userRepo;
}
@GetMapping
public List<User> getAll() {
return userRepo.findAll();
}
@GetMapping("/{id}")
public User getById(@PathVariable Long id) {
return userRepo.findById(id).orElseThrow();
}
}
