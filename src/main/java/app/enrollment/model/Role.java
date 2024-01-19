package app.enrollment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "enroll_system_role")
@SequenceGenerator(name = "enrollment_seq_generator", sequenceName = "enroll_system_role_s", allocationSize = 1, initialValue = 50)
public class Role extends BaseEntity {

	private Integer code;
	private String name;
	private String description;
	
}
