package app.enrollment.service;

import java.util.List;

import app.enrollment.model.Student;

public interface StudentService {

	public void createStudent(Student student);

	public List<Student> loadAllByCourseId(Long courseId);

	public Student loadById(Long studentId);
}
