package com.todo.ToDoApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.todo.ToDoApplication.jpa.UserProfileRepository;

@RestController
public class ToDoController {
	@Autowired
	private static UserProfileRepository repo;
	
}
