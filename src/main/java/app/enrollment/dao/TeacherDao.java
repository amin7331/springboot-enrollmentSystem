package app.enrollment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.enrollment.model.Teacher;

@Repository
public interface TeacherDao extends JpaRepository<Teacher, Long> {

}
