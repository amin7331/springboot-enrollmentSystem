package app.enrollment.service;

import java.util.List;

import app.enrollment.model.Role;

public interface RoleService {

	public List<Role> getRolesByIds(List<Long> ids);
}
