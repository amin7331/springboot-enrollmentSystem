package app.enrollment.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.enrollment.model.Teacher;
import app.enrollment.service.TeacherService;

@RestController
@RequestMapping(path = "/teachers")
public class TeacherController {

	TeacherService service;

	public TeacherController(TeacherService service) {
		this.service = service;
	}
	
	@PostMapping(path = "/save")
	public void createTeacher(@RequestBody Teacher teacher) {
		service.createTeacher(teacher);
	}
	
}
