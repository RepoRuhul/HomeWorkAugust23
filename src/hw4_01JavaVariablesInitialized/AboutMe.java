package hw4_01JavaVariablesInitialized;

public class AboutMe {
	public String myInfo; // variable declared
	public String myName = "Ruhul Kuddus Rana"; // variable initialized
	public byte myAge = 127;
	public short myApartmentRent = 32767;
	public int myYearlySalary = 2147483647;
	public long myBankBalance = 9223372036854775807l;
	public float myHeight = 1.65473f;
	public double myGrade = 3.4665636567;
	public char myGender = 'M';
	public boolean usCitizen = false;

	// Constructor declared
	public AboutMe() {
		System.out.println(":------------ This is all about Myself ------------:");
	}

	// method implemented
	public void aboutMe() {
		System.out.println("My Name: " + myName + "\nMy Age: " + myAge + "\nMy Apartment Rent: " + myApartmentRent
				+ "\nYearly Salary: " + myYearlySalary + "\nMy Bank Balance: " + myBankBalance + "\nGender: " + myGender
				+ "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade + "\nAm I US Citizen? Ans: " + usCitizen);

	}
}
