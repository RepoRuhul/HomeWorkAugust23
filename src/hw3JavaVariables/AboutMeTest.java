package hw3JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe(); // Constructor initialized

		System.out.println("My Name: " + aboutMe.myName + "\nMy Age: " + aboutMe.myAge + "\nMy Apartment Rent: "
				+ aboutMe.myApartmentRent + "\nYearly Salary: " + aboutMe.myYearlySalary + "\nMy Bank Balance: "
				+ aboutMe.myBankBalance + "\nGender: " + aboutMe.myGender + "\nMy Height: " + aboutMe.myHeight
				+ "\nMy Grade: " + aboutMe.myGrade + "\nAm I US Citizen? Ans: " + aboutMe.usCitizen);

		aboutMe.aboutMe(); // method initialized

	}

}
