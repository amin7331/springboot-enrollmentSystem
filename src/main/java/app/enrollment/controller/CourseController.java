package app.enrollment.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.enrollment.model.Course;
import app.enrollment.service.CourseService;

@RestController
@RequestMapping(path = "/courses")
public class CourseController {

	CourseService service;

	public CourseController(CourseService service) {
		this.service = service;
	}
	
	@PostMapping(path = "/save")
	public void saveCourse(@RequestBody Course course) {
		service.createCourse(course);
	}
	
	@GetMapping(path = "/teacher/{teacherId}")
	public List<Course> getCourseListByTeacherId(@PathVariable Long teacherId) {
		return service.loadCourseListByTeacherId(teacherId);
	}
}
