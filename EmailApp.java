package EmailApp;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Email em1 = new Email("John", "Smith");
		em1.setAltEmail("asjda@gmail.com");
		
		System.out.println(em1.showInfo());
	}

}
