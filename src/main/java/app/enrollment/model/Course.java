package app.enrollment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "enroll_system_course")
@SequenceGenerator(name = "enrollment_seq_generator", sequenceName = "enroll_system_course_s",allocationSize = 1, initialValue = 50)
public class Course extends BaseEntity {

	private String name;
	private String code;
	private String description;
	private Long teacherId;
		
}
