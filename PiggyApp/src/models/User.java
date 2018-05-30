package models;

public class User {

	private String username, password, img;

	public User(String username, String password, String img) {
		this.username = username;
		this.password = password;
		this.img = img;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getImg() {
		return img;
	}
}