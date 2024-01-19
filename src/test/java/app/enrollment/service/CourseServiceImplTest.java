package app.enrollment.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import app.enrollment.model.Course;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class CourseServiceImplTest {

	private CourseService courseService;

	@Autowired
	public CourseServiceImplTest(CourseService courseService) {
		super();
		this.courseService = courseService;
	}
	
	@Test
	public void testCreateCourse() {
		Course testCourse = ServiceUtilTest.createTestCourse();
		courseService.createCourse(testCourse);
		assertThat(testCourse).isEqualTo(testCourse);
	}
	
	@Test
	public void testLoadCourseListByTeacherId() {
		Course testCourse = ServiceUtilTest.createTestCourse();
		List<Course> courseList = courseService.loadCourseListByTeacherId(1L);
		Course loadCourse = courseList.stream().filter((a) -> a.getId() == Long.valueOf(1)).findFirst().orElseThrow();
		assertThat(testCourse).isEqualTo(loadCourse);
	}
	
	
}
