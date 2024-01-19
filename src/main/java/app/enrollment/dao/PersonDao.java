package app.enrollment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.enrollment.model.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Long> {

}
