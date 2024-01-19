package app.enrollment.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import app.enrollment.model.EnrollmentSystemConsts.RoleTypeEnum;

@Configuration
@EnableWebSecurity
public class EnrollmentSecurityConfig {	
	
	@Autowired
	private UserDetailsService userDetailsService;

	@Bean
 	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
 		http.csrf(csrf -> csrf.disable())
 			.authorizeHttpRequests((authorize) -> authorize
 					.requestMatchers("/users/**")
 					.hasAuthority(String.valueOf(RoleTypeEnum.ADMIN.getValue()))
 					.requestMatchers("/enrollCourses/**", "/students/save")
 					.hasAnyAuthority(String.valueOf(RoleTypeEnum.ADMIN.getValue()),String.valueOf(RoleTypeEnum.STUDENT.getValue()))
 					.requestMatchers("/students/courseId/*", "/courses/teacher/**")
 					.hasAnyAuthority(String.valueOf(RoleTypeEnum.ADMIN.getValue()),String.valueOf(RoleTypeEnum.TEACHER.getValue()))
 					.requestMatchers("/students/studentId/*")
 					.hasAnyAuthority(String.valueOf(RoleTypeEnum.ADMIN.getValue()),String.valueOf(RoleTypeEnum.TEACHER.getValue()),String.valueOf(RoleTypeEnum.STUDENT.getValue()))
 					.anyRequest().authenticated()
 					)
 			.httpBasic(Customizer.withDefaults());
 		return http.build();
 	}

	
	@Bean
	public DaoAuthenticationProvider daoAuthenticationProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setPasswordEncoder(passwordEncoder());
		provider.setUserDetailsService(userDetailsService);
		return provider;
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

	


}
