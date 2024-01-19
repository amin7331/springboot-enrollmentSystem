package app.enrollment.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import app.enrollment.model.User;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class UserServiceImplTest {

	
	private UserService userService;
	
	
	@Autowired
	public UserServiceImplTest(UserService userService) {
		super();
		this.userService = userService;
	}



	@Test
	public void testListUserFromDao() {
		final List<User> expectedList = ServiceUtilTest.findAll();
		final List<User> userList = userService.findAll();
		assertThat(userList.stream()
				.filter(a -> a.getUsername().equals("admin")).collect(Collectors.toList()))
		.isEqualTo(expectedList.stream()
				.filter(a -> a.getUsername().equals("admin")).collect(Collectors.toList()));
	}
}
