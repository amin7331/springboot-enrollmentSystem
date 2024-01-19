package app.enrollment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.enrollment.dao.UserRoleDao;
import app.enrollment.model.UserRole;
import app.enrollment.service.UserRoleService;

@Service
public class UserRoleServiceImpl implements UserRoleService {

	UserRoleDao userRoleDao;

	@Autowired
	public UserRoleServiceImpl(UserRoleDao userRoleDao) {
		super();
		this.userRoleDao = userRoleDao;
	}

	@Override
	public List<UserRole> getRolesByUserId(Long userId) {
		return userRoleDao.findByUserId(userId);
	}
	
}
