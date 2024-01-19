package app.enrollment.model;

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
@Table(name = "enroll_system_student")
@SequenceGenerator(name = "enrollment_seq_generator", sequenceName = "enroll_system_student_s", allocationSize = 1, initialValue = 50)
public class Student extends BaseEntity {

	private String studentCode;
	private Long personId;
}
