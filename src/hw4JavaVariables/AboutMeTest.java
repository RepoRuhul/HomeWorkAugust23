package hw4JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe rana = new AboutMe();// constructor initialized

		rana.myName = "Ruhul Kuddus Rana";// variable initialized
		rana.myAge = 126;
		rana.myApartmentRent = 383;
		rana.myYearlySalary = 999999;
		rana.myBankBalance = 56666666;
		rana.myHeight = 5.7f;
		rana.myGrade = 4.5;
		rana.myGender = 'M';
		rana.usCitizen = true;
		rana.aboutMe();// method initialized
		AboutMe alex = new AboutMe();
		alex.myName = "Alex";
		alex.myAge = 100;
		alex.myApartmentRent = 30000;
		alex.myYearlySalary = 600000;
		alex.myBankBalance = 500000000000000000l;
		alex.myHeight = 6.0f;
		alex.myGrade = 4.99999999999999999999999999999999999999999999999999;
		alex.myGender = 'M';
		alex.usCitizen = false;
		alex.aboutMe();

	}

}
