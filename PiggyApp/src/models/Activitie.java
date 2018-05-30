package models;

import java.util.ArrayList;

public class Activitie {

	private User user;
	private ArrayList<Item> itemsList;
	private State state;

	public Activitie(User user, ArrayList<Item> itemsList) {
		this.user = user;
		this.itemsList = itemsList;
		state = State.INCOMPLETE;
	}

	public User getUser() {
		return user;
	}

	public ArrayList<Item> getItemsList() {
		return itemsList;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
}