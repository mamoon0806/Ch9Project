package edu.seminolestate.volunteers;
import java.time.LocalDate;

public class ManageVolunteer {
	
	public static void main(String[] args) {
		Volunteer volunteer = new Volunteer("John", "Doe", LocalDate.of(2019, 1, 1), 1);
		System.out.println(volunteer.toString());

	}

}
