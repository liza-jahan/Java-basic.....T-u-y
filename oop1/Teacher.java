package oop1;

public class Teacher {

	String name;
	String gander;
	int phoneNumber;

	// This is a constructor. we know that constructor does not have any return type
	// constructor will be called when we create object of this class
	public Teacher(String name, String gender, int phoneNumber) {
		this.name = name;
		this.gander = gender; // there was a simple type
		this.phoneNumber = phoneNumber;
	}

	// but look at there . there are a return type 'void'. that's why it is a method
	void display() {
		System.out.println("NAME: " + name);//ami aita constu

		System.out.println("Gender: " + gander);

		System.out.println("Phone: " + phoneNumber);

	}

}