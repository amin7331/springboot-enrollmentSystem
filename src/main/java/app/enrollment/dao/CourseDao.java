package app.enrollment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.enrollment.model.Course;

@Repository
public interface CourseDao extends JpaRepository<Course, Long> {

	public List<Course> findByTeacherId(Long teacherId);
}
