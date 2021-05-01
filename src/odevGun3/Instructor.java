package odevGun3;

public class Instructor extends User {
	String ibanNumber;
	int[] givenCoursesId;
	
	public Instructor() {}

	public Instructor(String ibanNumber, int[] givenCoursesId) {
		super();
		this.ibanNumber = ibanNumber;
		this.givenCoursesId = givenCoursesId;
	}

	public String getIbanNumber() {
		return ibanNumber;
	}

	public void setIbanNumber(String ibanNumber) {
		this.ibanNumber = ibanNumber;
	}

	public int[] getGivenCoursesId() {
		return givenCoursesId;
	}

	public void setGivenCoursesId(int[] givenCoursesId) {
		this.givenCoursesId = givenCoursesId;
	}
}
