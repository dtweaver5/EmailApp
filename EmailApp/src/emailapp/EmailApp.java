package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email  em1 = new Email("John", "Smith");
		
		em1.setAlternateEmail("jsmith@yahoo.com");
		
		em1.changePassword("GSADUI7896");
		
		em1.showInfo();
	}

}
