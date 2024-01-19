package app.enrollment.service.impl;

import org.springframework.stereotype.Service;

import app.enrollment.dao.TeacherDao;
import app.enrollment.model.Teacher;
import app.enrollment.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {

	TeacherDao dao;

	public TeacherServiceImpl(TeacherDao dao) {
		this.dao = dao;
	}

	@Override
	public void createTeacher(Teacher teacher) {
		dao.save(teacher);
	}
	
	
	
}
