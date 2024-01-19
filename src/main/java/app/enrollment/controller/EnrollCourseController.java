package app.enrollment.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.enrollment.model.EnrollCourse;
import app.enrollment.service.EnrollCourseService;

@RestController
@RequestMapping(path = "enrollCourses")
public class EnrollCourseController {

	EnrollCourseService service;

	public EnrollCourseController(EnrollCourseService service) {
		this.service = service;
	}
	
	@PostMapping(path = "/save")
	public void createEnrollCourse(@RequestBody EnrollCourse enrollCourse) {
		service.createEnrollCourse(enrollCourse);
	}
	
	@GetMapping("/student/{studentId}")
	public List<EnrollCourse> getCoursesByStudentId(@PathVariable("studentId") Long studentId) {
		return service.loadAllByStudentId(studentId);
	}
	
}
