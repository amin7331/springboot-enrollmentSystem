package app.enrollment.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.enrollment.model.UserRole;
import app.enrollment.service.UserRoleService;

@RestController
@RequestMapping(path = "/userRoles")
public class UserRoleController {

	UserRoleService userRoleService;

	public UserRoleController(UserRoleService userRoleService) {
		super();
		this.userRoleService = userRoleService;
	}
	
	@GetMapping("/{userId}")
	public List<UserRole> getRolesByUserId(@PathVariable(name = "userId") Long userId) {
		return userRoleService.getRolesByUserId(userId);
	}
	
}
