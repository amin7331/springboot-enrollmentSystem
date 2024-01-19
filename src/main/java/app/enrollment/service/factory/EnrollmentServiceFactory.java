package app.enrollment.service.factory;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.enrollment.service.RoleService;
import app.enrollment.service.UserRoleService;
import jakarta.annotation.PostConstruct;

@Component
public class EnrollmentServiceFactory {

	private static HashMap<String, Object> mapService = new HashMap<String, Object>();
	
	@PostConstruct
	public void init() {
		mapService.put(UserRoleService.class.getSimpleName(), userRoleService);
		mapService.put(RoleService.class.getSimpleName(), roleService);
	}
	
	@Autowired
	private UserRoleService userRoleService;
	
	@Autowired
	private RoleService roleService;
	
	public static UserRoleService getUserRoleService() {
		return (UserRoleService) mapService.get(UserRoleService.class.getSimpleName());
	}
	
	public static RoleService getRoleService() {
		return (RoleService) mapService.get(RoleService.class.getSimpleName());
	}
	
}
