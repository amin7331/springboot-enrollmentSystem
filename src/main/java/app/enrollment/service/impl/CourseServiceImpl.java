package app.enrollment.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import app.enrollment.dao.CourseDao;
import app.enrollment.model.Course;
import app.enrollment.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	CourseDao dao;
	
	public CourseServiceImpl(CourseDao dao) {
		this.dao = dao;
	}


	@Override
	public void createCourse(Course course) {
		dao.save(course);
	}


	@Override
	public List<Course> loadCourseListByTeacherId(Long teacherId) {
		return dao.findByTeacherId(teacherId);
	}



}
