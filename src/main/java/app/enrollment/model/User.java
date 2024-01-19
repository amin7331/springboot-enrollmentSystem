package app.enrollment.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import app.enrollment.service.RoleService;
import app.enrollment.service.UserRoleService;
import app.enrollment.service.factory.EnrollmentServiceFactory;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "enroll_system_user")
@SequenceGenerator(name = "enrollment_seq_generator", sequenceName = "enroll_system_user_s", allocationSize = 1, initialValue = 50)
public class User extends BaseEntity implements UserDetails {
	
	private String username;
	private String password;
	private Long personId;
	
	@Transient
	private List<Role> roles;
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for (Role role : getRoleList()) {
			GrantedAuthority authority = new SimpleGrantedAuthority(role.getCode().toString());
			authorities.add(authority);
		}
		return authorities;
	}
	
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	
	@Override
	public boolean isEnabled() {
		return true;
	}
	
	public List<Role> getRoleList() {
		
		List<Role> roles = new ArrayList<Role>();
		List<UserRole> userRoleList = EnrollmentServiceFactory.getUserRoleService().getRolesByUserId(getId());
		if(userRoleList != null && !userRoleList.isEmpty()) {
			List<Long> roleIds = userRoleList.stream().map(userRole -> userRole.getRoleId()).collect(Collectors.toList());
			if(roleIds != null && !roleIds.isEmpty()) {
				roles = EnrollmentServiceFactory.getRoleService().getRolesByIds(roleIds);
			}
		}
		return roles;
	}
	

}
