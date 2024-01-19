package app.enrollment.model;

public class EnrollmentSystemConsts {

	public enum RoleTypeEnum {
		ADMIN(1, "admin"),
		USER(2, "user"),
		STUDENT(3, "student"),
		TEACHER(4, "teacher");

		private RoleTypeEnum(int value, String name) {
			this.value = value;
			this.name = name;
		}

		private int value;
		private String name;

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}
}
