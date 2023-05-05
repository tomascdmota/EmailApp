package EmailApp;
import java.util.Scanner;

public class Email {
	
	//We make them private, adding encapsulation, so the user can't interact with them directly
	// With this we need to add getters and setters to access their values.
	private String firstName, lastName,password, department, alternateEmail,email, companySuffix= "aeycompany.com";
	private int  defaultPasswordLength=10, mailboxCapacity=500;
	

	// Constructor to receive the first name and last name.
	public Email(String firstName, String lastName) {
		// This keyword is referring to the class variable and we ar
		this.firstName = firstName;
		this.lastName = lastName;
		
		//Call a method asking for the department - return the department
		
		this.department = setDepartment();

		// Call a method that generates a random passwords
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is:  " + password);
		
		
		// Combine elements to generate email.
		email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department + "."+ companySuffix;
		
	}
	
	// Ask for the department
	
	private String setDepartment() {
		System.out.print("Department Codes: \n 1 for Sales \n 2 for development\n 3 for Accounting\n 0 for none\n Enter department code:  ");
		
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		
		if(depChoice == 1) {return "sales";}
		else if (depChoice ==2) {return "dev";}
		else if(depChoice ==3) {return "accounting";}
		else {return "";}
	}
	
	// Generate a random password.
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVXYZ!@#$%&*()";
		
		char[] password = new char[length];
		
		for(int i=0; i<length; i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		
		return new String(password);
	}
	
	//Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity=capacity;
	}
	
	
	//Set the alternate email
	
	public void setAltEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	
	// Change the password.
	public void changePassword(String password) {
		this.password = password;
	}
	
	
	public String showInfo() {
		return "DISPLAY NAME: "+firstName + " " + lastName+ "\n"+ 
				"COMPANY EMAIL: " + email  +"\nMAILBOX CAPACITY: " + mailboxCapacity ;
				}
	
	
	public int getMailboxCapacity() {return mailboxCapacity;}
	
	public String getAlternateEmail() {return alternateEmail;}
	
	public String getPassword() {return password;}
}
