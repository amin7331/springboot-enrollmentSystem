package app.enrollment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.enrollment.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

	public List<User> findByUsername(String username);
}
