package app.enrollment.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import app.enrollment.dao.EnrollCourseDao;
import app.enrollment.dao.StudentDao;
import app.enrollment.model.EnrollCourse;
import app.enrollment.model.Student;
import app.enrollment.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	StudentDao studentDao;
	EnrollCourseDao enrollCourseDao;
	
	public StudentServiceImpl(StudentDao studentDao, EnrollCourseDao enrollCourseDao) {
		this.studentDao = studentDao;
		this.enrollCourseDao = enrollCourseDao;
	}

	@Override
	public void createStudent(Student student) {
		studentDao.save(student);
	}

	@Override
	public List<Student> loadAllByCourseId(Long courseId) {
		List<EnrollCourse> enrollCourses = enrollCourseDao.findByCourseId(courseId);
		List<Long> studentIdList = enrollCourses.stream().map(EnrollCourse::getStudentId).collect(Collectors.toList());
		List<Student> students = null;
		if(studentIdList != null && !studentIdList.isEmpty()) {
			students = studentDao.findAllById(studentIdList);
		}
		return students;
	}

	@Override
	public Student loadById(Long studentId) {
		return studentDao.findById(studentId).orElseThrow();
	}

	
}
