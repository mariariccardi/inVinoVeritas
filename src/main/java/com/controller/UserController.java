package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.LoginDTO;
import com.dto.UserDTO;
import com.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")

public class UserController extends AbstractController<UserDTO> {
	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/login")
	public UserDTO login(@RequestBody LoginDTO loginDTO) {
		return userService.findByUsernameAndPassword(loginDTO.getPassword(),loginDTO.getPassword());
	}

}
