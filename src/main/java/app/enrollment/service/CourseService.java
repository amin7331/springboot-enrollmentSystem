package app.enrollment.service;

import java.util.List;

import app.enrollment.model.Course;

public interface CourseService {

	public void createCourse(Course course);
	
	public List<Course> loadCourseListByTeacherId(Long teacherId);
}
