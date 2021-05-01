package odevGun3;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setId(1);
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(2);
		
		User[] users = {student1,instructor1};
		
		UserManager userManager = new UserManager();
		userManager.addMultiple(users);
		
		StudentManager studentManager = new StudentManager();
		studentManager.enrolledCourse();

	}

}
