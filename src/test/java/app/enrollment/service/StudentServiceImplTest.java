package app.enrollment.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import app.enrollment.model.Student;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class StudentServiceImplTest {

	private StudentService studentService;

	@Autowired
	public StudentServiceImplTest(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@Test
	public void testCreateStudent() {
		Student student = ServiceUtilTest.createTestStudent();
		studentService.createStudent(student);
		assertThat(student).isEqualTo(student);
	}
	
	@Test
	public void testLoadAllByCourseId() {
		Student student = ServiceUtilTest.createTestStudent();
		Student loadedStudent = studentService.loadAllByCourseId(1L).stream().findFirst().orElseThrow();
		assertThat(student).isEqualTo(loadedStudent);
	}
	
	
}
