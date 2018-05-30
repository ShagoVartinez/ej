package models;

public enum State {
	COMPLETE("Complete"), INCOMPLETE("Incomplete");

	private String name;

	private State(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}