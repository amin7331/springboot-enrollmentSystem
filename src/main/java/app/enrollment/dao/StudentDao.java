package app.enrollment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.enrollment.model.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Long> {

}
