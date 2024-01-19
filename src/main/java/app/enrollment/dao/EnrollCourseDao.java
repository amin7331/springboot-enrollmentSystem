package app.enrollment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.enrollment.model.EnrollCourse;

@Repository
public interface EnrollCourseDao extends JpaRepository<EnrollCourse, Long> {

	public List<EnrollCourse> findByStudentId(Long studentId);
	
	public List<EnrollCourse> findByCourseId(Long courseId);
}
