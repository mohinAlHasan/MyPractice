package JavaPractice;

public class Method3 {

	public static void main(String[] args) {
		String userOne = userInfo("Nazmul Alam Diptu", 
				"nazmul.diptu@northsouth.edu", "Bashundhara R/A, Dhaka"); 
				        System.out.println(userOne); 
				    } 
				 
				    public static String userInfo(String name, String email, String add) { 
				        String thanksMsg = "Hello, " 
				                + name + ". Thanks for trying.\n\n" 
				                + "Your information given below:\n"; 
				        String userInformation = "Name: " + name 
				                + "\nemail: " + email 
				                + "\nAddress: " + add; 
				        return thanksMsg.concat(userInformation); 
	}

}
