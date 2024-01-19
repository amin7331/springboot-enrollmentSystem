package app.enrollment.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.enrollment.model.Student;
import app.enrollment.service.StudentService;

@RestController
@RequestMapping(path = "/students")
public class StudentController {

	StudentService service;

	public StudentController(StudentService service) {		
		this.service = service;
	}
	
	@PostMapping(path = "/save")
	public void saveStudent(@RequestBody Student student) {
		service.createStudent(student);
	}
	
	@GetMapping(path = "/courseId/{courseId}")
	public List<Student> getStudentListByCourseId(@PathVariable("courseId") Long courseId) {
		return service.loadAllByCourseId(courseId);
	}
	
	@GetMapping(path = "/studentId/{studentId}")
	public Student getStudentById(@PathVariable("studentId") Long studentId) {
		return service.loadById(studentId);
	}
}
