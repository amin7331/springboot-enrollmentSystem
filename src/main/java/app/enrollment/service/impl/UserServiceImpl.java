package app.enrollment.service.impl;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import app.enrollment.dao.UserDao;
import app.enrollment.model.User;
import app.enrollment.service.UserService;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {

	UserDao dao;
	public UserServiceImpl(UserDao dao) {	
		this.dao = dao;
	}
	
	@Override
	public List<User> findAll() {
		return dao.findAll();
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return dao.findByUsername(username).stream()
				.findFirst().orElseThrow(() -> new UsernameNotFoundException("username:"+username));
	}

}
