package app.enrollment.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import app.enrollment.model.Course;
import app.enrollment.model.EnrollCourse;
import app.enrollment.model.Student;
import app.enrollment.model.Teacher;
import app.enrollment.model.User;

public class ServiceUtilTest {

	public static List<User> findAll() {
 		List<User> users = new ArrayList<User>();
		User user1 = new User();
		user1.setId(1);
		user1.setUsername("admin");
		user1.setPassword("1234");
		user1.setPersonId(1L);
		users.add(user1);
		User user2 = new User();
		user2.setId(2);
		user2.setUsername("test1");
		user2.setPassword("1111");
		user2.setPersonId(2L);
		users.add(user2);
		User user3 = new User();
		user3.setId(3);
		user3.setUsername("test2");
		user3.setPassword("2222");
		user3.setPersonId(3L);
		users.add(user3);
		User user4 = new User();
		user4.setId(4);
		user4.setUsername("test3");
		user4.setPassword("3333");
		user4.setPersonId(4L);
		users.add(user4);
		User user5 = new User();
		user5.setId(5);
		user5.setUsername("student5");
		user5.setPassword("5555");
		user5.setPersonId(5L);
		users.add(user5);
		User user6 = new User();
		user6.setId(6);
		user6.setUsername("student6");
		user6.setPassword("6666");
		user6.setPersonId(6L);
		users.add(user6);
		return users;
	}
	
	public static Course createTestCourse() {
		Course course = new Course("java", "315", "java course", 1L);
		course.setId(1L);
		return course;
	}
	
	public static Student createTestStudent() {
		Student student = new Student("00198765432", 4L);
		student.setId(1);
		return student;
	}
	
	public static Teacher createTestTeacher() {
		Teacher teacher = new Teacher("00212345678", 3L);
		return teacher;
	}
	
	public static EnrollCourse createTestEnrollCourse() {
		EnrollCourse enrollCourse = new EnrollCourse(1L, 3L, new Date(System.currentTimeMillis()));
		return enrollCourse;
	}
}
