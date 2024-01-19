package app.enrollment.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import app.enrollment.dao.EnrollCourseDao;
import app.enrollment.model.EnrollCourse;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class EnrollCourseServiceImplTest {

	private EnrollCourseService enrollCourseService;
	private EnrollCourseDao enrollCourseDao;
	
	@Autowired
	public EnrollCourseServiceImplTest(EnrollCourseService enrollCourseService, EnrollCourseDao enrollCourseDao) {
		super();
		this.enrollCourseService = enrollCourseService;
		this.enrollCourseDao = enrollCourseDao;
	}
	
	@Test
	public void testCreateEnrollCourse() {
		EnrollCourse enrollCourse = ServiceUtilTest.createTestEnrollCourse();
		enrollCourseService.createEnrollCourse(enrollCourse);
		EnrollCourse loadedEnrollCourse = enrollCourseDao.findById(enrollCourse.getId()).get();
		assertThat(enrollCourse.getId()).isEqualTo(loadedEnrollCourse.getId());
	}
		
	
}
