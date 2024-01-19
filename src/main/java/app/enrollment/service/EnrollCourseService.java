package app.enrollment.service;

import java.util.List;

import app.enrollment.model.EnrollCourse;

public interface EnrollCourseService {

	public void createEnrollCourse(EnrollCourse enrollCourse);
	
	public List<EnrollCourse> loadAllByStudentId(Long studentId);
}
