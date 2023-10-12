package com.example.Spring_MySQL.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.Spring_MySQL.entity.User;
import com.example.Spring_MySQL.repository.UserRepository;

@Controller
@RequestMapping(path="app")
public class AppController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping(path="/add")
	public @ResponseBody String addUser (@RequestParam String name, @RequestParam String email) {
		User newUser = new User();
		newUser.setName(name);
		newUser.setEmail(email);
		userRepository.save(newUser);
		return "New User Saved";
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers(){
		return userRepository.findAll();
	}
}
