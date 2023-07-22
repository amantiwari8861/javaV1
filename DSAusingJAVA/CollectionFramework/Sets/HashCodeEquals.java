import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

class User {
	private int userId;
	private String userName;
	private String emailId;

	public User(int userId, String userName, String emailId) {
		this.userId = userId;
		this.userName = userName;
		this.emailId = emailId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public boolean equals(Object user) {
		User otherUser = (User) user;
		if (this.emailId.equals(otherUser.emailId))
			return true;
		return false;
	}

	@Override
	public int hashCode() {
		// System.out.println(emailId.hashCode());
		return emailId.hashCode();
	}
	
	@Override
	public String toString() {
		return "User Name: "+userName + ", Email Id: " + emailId;
	}
}

class HashCodeEquals {

	public static void main(String[] args) {
		List<User> userList = new ArrayList<User>();
		userList.add(new User(1001, "Mike", "Mike@example.com"));
		userList.add(new User(1002, "Ben", "User@example.com"));
		userList.add(new User(1003, "Henry", "Henry@example.com"));
		userList.add(new User(1004, "Hannah", "User@example.com"));
		userList.add(new User(1005, "Ellie", "Henry@example.com"));
		userList.add(new User(1006, "Ryan", "Ryan@example.com"));

		Set<User> userSet = new HashSet<User>();
		userSet.addAll(userList);
		for (User user : userSet)
			System.out.println(user);
	}
}
