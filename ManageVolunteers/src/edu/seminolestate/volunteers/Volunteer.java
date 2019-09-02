//Name: Qazi Ulhaq Date: September 2, 2019


package edu.seminolestate.volunteers;
import java.time.LocalDate;

public class Volunteer {
	private String firstName;
	private String lastName;
	private LocalDate startDate;
	private double volunteerHours;
	
	static  String DEFAULT_FIRST_NAME = "no first name assigned";
	static String DEFAULT_LAST_NAME = "no last name assigned";
	static LocalDate DEFAULT_START_DATE = LocalDate.now();
	static double DEFUALT_HOURS = 0;
	
	public Volunteer(String firstname, String lastname, LocalDate start, double hours) {
		firstName = firstname;
		lastName = lastname;
		startDate = start;
		volunteerHours = hours;
	}
	
	public Volunteer() {
		this(DEFAULT_FIRST_NAME, DEFAULT_LAST_NAME, DEFAULT_START_DATE, DEFUALT_HOURS);
	}
	
	public Volunteer(String firstname, String lastname) {
		this(firstname, lastname, DEFAULT_START_DATE, DEFUALT_HOURS);
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String newFName) {
		if(newFName != null && newFName.length() != 0) {
			firstName = newFName;
		}
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String newLName) {
		if(newLName != null && newLName.length() != 0) {
			lastName = newLName; 
		}
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate start) {
		if(start != null) {
			startDate = start;
		}
	}
	
	public void setStartDate(int newYr, int newMonth, int newDay) {
		startDate = LocalDate.of(newYr, newMonth, newDay);
	}
	
	public double getVolunteerHours() {
		return volunteerHours;
	}
	
	public void setVolunteerHours(double newHours) {
		volunteerHours = newHours;
	}
	
	public void updateVolunteerHours(double hours) {
		volunteerHours += hours;
	}
	
	public String toString() {
		return firstName + ", " + lastName + ", " + 
				startDate + ", " + volunteerHours;
	}
		
}
