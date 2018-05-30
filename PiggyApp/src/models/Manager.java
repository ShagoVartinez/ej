package models;

import java.util.ArrayList;

public class Manager {

	private ArrayList<User> usersList;
	private ArrayList<Activitie> activitiesList;

	public Manager() {
		usersList = new ArrayList<>();
		activitiesList = new ArrayList<>();
	}

	public static User createUser(String name, String password, String img) {
		return new User(name, password, img);
	}

	public void addUser(User user) {
		usersList.add(user);
	}

	public static Activitie createActivitie(User user, ArrayList<Item> itemsList) {
		return new Activitie(user, itemsList);
	}

	public void addActivitie(Activitie activitie) {
		activitiesList.add(activitie);
	}

	public boolean isUserInDataBase(String username, String password) {
		for (User user : usersList) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

	public User getUserInDataBase(String username, String password) throws Exception {
		for (User user : usersList) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return user;
			}
		}
		throw new Exception("The user was not obtained(null)");
	}
}