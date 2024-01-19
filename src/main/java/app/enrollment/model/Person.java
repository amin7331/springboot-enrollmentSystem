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
@Table(name = "enroll_system_person")
@SequenceGenerator(name = "enrollment_seq_generator", sequenceName = "enroll_system_person_s", allocationSize = 1, initialValue = 50)
public class Person extends BaseEntity {

	private String name;
	private String family;
	private Integer age;
	private String nationalCode;
}
