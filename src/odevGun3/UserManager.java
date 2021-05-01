package odevGun3;

public class UserManager {

	public void addUser(User user) {
		System.out.println(user.getId() + " User Eklendi");
	}
	
	public void addMultiple(User[] users) {
		for (User user : users) {
			this.addUser(user);
		}
	}

}
