package app.enrollment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.enrollment.model.UserRole;

@Repository
public interface UserRoleDao extends JpaRepository<UserRole, Long> {

	public List<UserRole> findByUserId(Long userId);
}
