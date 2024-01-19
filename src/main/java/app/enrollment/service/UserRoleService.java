package app.enrollment.service;

import java.util.List;

import app.enrollment.model.UserRole;

public interface UserRoleService {

	public List<UserRole> getRolesByUserId(Long userId);
}
