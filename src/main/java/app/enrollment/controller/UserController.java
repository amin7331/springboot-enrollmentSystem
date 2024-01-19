package app.enrollment.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.enrollment.model.User;
import app.enrollment.service.UserService;

@RestController
@RequestMapping(path = "/users")
public class UserController {

	UserService service;
	
	public UserController(UserService service) {
		this.service = service;
	}
	
	@GetMapping(path = "")
	public List<User> getAllUsers() {
		return service.findAll();
	}
	
}
