package app.enrollment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.enrollment.dao.RoleDao;
import app.enrollment.model.Role;
import app.enrollment.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	RoleDao roleDao;

	@Autowired
	public RoleServiceImpl(RoleDao roleDao) {
		this.roleDao = roleDao;
	}

	public List<Role> getRolesByIds(List<Long> ids) {
		return roleDao.findAllById(ids);
	}
	
	
}
