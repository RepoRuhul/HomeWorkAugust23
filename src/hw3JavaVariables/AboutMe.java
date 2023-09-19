package hw3JavaVariables;

public class AboutMe {
	public String myInfo; // variable declared here.
	public String myName = "Ruhul Kuddus Rana"; // variable initialized here.
	public byte myAge = 127;
	public short myApartmentRent = 32767;
	public int myYearlySalary = 2147483647;
	public long myBankBalance = 9223372036854775807l;
	public float myHeight = 1.65473f;
	public double myGrade = 3.4665636567;
	public char myGender = 'M';
	public boolean usCitizen = false;

	// Constructor declared here.
	public AboutMe() {
		System.out.println(":------------ This is all about Myself ------------:");
	}

	// method implemented here.
	public void aboutMe() {
		System.out.println("I am aboutMe method");
	}
}
