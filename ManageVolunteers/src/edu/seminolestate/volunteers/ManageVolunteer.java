//Name: Qazi Ulhaq Date: September 2, 2019

package edu.seminolestate.volunteers;
import java.time.LocalDate;

public class ManageVolunteer {
	
	public static void main(String[] args) {
		Volunteer volunteer = new Volunteer("John", "Doe", LocalDate.of(2019, 1, 1), 1);
		System.out.println(volunteer.toString());
		
		Volunteer volunteer2 = new Volunteer();
		System.out.println(volunteer2.toString());
		
		Volunteer volunteer3 = new Volunteer("Bill", "Jones");
		System.out.println(volunteer3.toString());
		
		volunteer.updateVolunteerHours(30);
		volunteer.setStartDate(2019, 2, 6);
		System.out.println(volunteer.toString());

	}

}
