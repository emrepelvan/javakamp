package entities;

import abstracts.Entity;

public class Gamer implements Entity {
	
	private int id;
	private String firstName;
	private String lastName;
	private int birtOfDay;
	private String nationalityId;
	
	public Gamer() {
		
	}
	
	public Gamer(int id, String firstName, String lastName, int birtOfDay, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birtOfDay = birtOfDay;
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirtOfDay() {
		return birtOfDay;
	}

	public void setBirtOfDay(int birtOfDay) {
		this.birtOfDay = birtOfDay;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	

	
}
