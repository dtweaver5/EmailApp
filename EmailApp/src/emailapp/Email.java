package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String company = "Business";
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private int defaultPasswordLength = 10;
	private String email;
	
	// Constructor to receive first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email Created: " + this.firstName + " " + this.lastName);
		
		// Call method asking for and returning department
		this.department = setDepartment();
		
		System.out.println("Email Created: " + this.firstName + " " + this.lastName + " @ " + this.department);
		
		// Generate email address
		this.email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@"
				+ this.department.toLowerCase() + "." + this.company.toLowerCase() + ".com";
		System.out.println("Your email is: " + this.email);
		
		// Method to generate and return password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		System.out.println("\n");
		
	}
	
	// Ask for department
	private String setDepartment() {
		System.out.println("Department Codes: \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
		System.out.println("Enter department code: ");
		Scanner in = new Scanner(System.in);
		int dpt = in.nextInt();
		switch(dpt) {
			case 1: return "sales";
			case 2: return "development";
			case 3: return "accounting";
			default: return "";
		}
	}
	
	// Generates random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
		char[] password = new char[length];
		for (int i=00; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	// Set mailboxCapacity
	public void setMailboxCapacity(int mailboxCapacity) {this.mailboxCapacity = mailboxCapacity;}

	// Set alternateEmail
	public void setAlternateEmail(String alternateEmail) {this.alternateEmail = alternateEmail;}
		
	// Change the password
	public void changePassword(String password) {this.password = password;}

	public int getMailboxCapacity() {return this.mailboxCapacity;}

	public String getAlternateEmail() {return this.alternateEmail;}

	public String getPassword() {return this.password;}

	public String getName() {return this.firstName + " " + this.lastName;}

	public String getEmail() {return this.email;}
	
	public void showInfo() {
		System.out.println("Name: " + getName() + "\nEmail: " + getEmail() + "\nPassword: " + getPassword());
		System.out.println("Alternate Email: " + getAlternateEmail() + "\nMailbox Capacity: " + getMailboxCapacity() + "mb");
	}

	
	
	
}
