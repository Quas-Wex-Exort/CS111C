import java.util.Objects;

public class Student {
	
	private int id;
	private String firstName, lastName;
	private boolean paidFees;
	
	public Student(int id, String firstName, String lastName, boolean paidFees) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.paidFees = paidFees;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public boolean hasPaidFees() {
		return paidFees;
	}
	public String toString() {
		return firstName + " " + lastName + " (ID: " + id + ")" + ( paidFees ? "" : " (Fees Owed)");
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return id == student.id &&
				paidFees == student.paidFees &&
				Objects.equals(firstName, student.firstName) &&
				Objects.equals(lastName, student.lastName);
	}
	/*
	@Override
	public boolean equals(Object o) {
		if (o instanceof Student) {
			Student aStudent = (Student) o;
			return this.id == aStudent.id &&
					this.firstName.equals(aStudent.firstName) &&
					this.lastName.equals(aStudent.lastName) &&
					this.paidFees == aStudent.paidFees;
		} else {
			return false;
		}
	} */

	@Override
	public int hashCode() {
		return Objects.hash(id, firstName, lastName, paidFees);
	}

}
