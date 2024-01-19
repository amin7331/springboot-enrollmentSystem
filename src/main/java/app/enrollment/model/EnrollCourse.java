package app.enrollment.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "enroll_system_enrollcourse")
@SequenceGenerator(name = "enrollment_seq_generator", sequenceName = "enroll_system_enrollcourse_s", allocationSize = 1, initialValue = 50)
public class EnrollCourse extends BaseEntity {

	private Long courseId;
	private Long studentId;
	private Date registerDate;
	
}
