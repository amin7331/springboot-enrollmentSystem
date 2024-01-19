package app.enrollment.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import app.enrollment.dao.EnrollCourseDao;
import app.enrollment.model.EnrollCourse;
import app.enrollment.service.EnrollCourseService;

@Service
public class EnrollCourseServiceImpl implements EnrollCourseService {

	EnrollCourseDao dao;
	
	
	public EnrollCourseServiceImpl(EnrollCourseDao dao) {
		this.dao = dao;
	}


	@Override
	public void createEnrollCourse(EnrollCourse enrollCourse) {
		dao.save(enrollCourse);
	}


	@Override
	public List<EnrollCourse> loadAllByStudentId(Long studentId) {
		return dao.findByStudentId(studentId);
	}

}
