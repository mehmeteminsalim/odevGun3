package odevGun3;

public class Student extends User {
	
	private int[] enrolledCourseId;
	 
	public Student() {}

	public Student(int[] enrolledCourseId) {
		super();
		this.enrolledCourseId = enrolledCourseId;
	}

	public int[] getEnrolledCourseId() {
		return enrolledCourseId;
	}

	public void setEnrolledCourseId(int[] enrolledCourseId) {
		this.enrolledCourseId = enrolledCourseId;
	}
	
}
