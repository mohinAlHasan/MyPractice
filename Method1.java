package JavaPractice;

public class Method1 {

	public static void main(String[] args) {
		int x = 10, y = 20; 
        maxPrint(x, y); // calling method 
        int m = max(x, y); // calling method 
        System.out.println("Max Value: " + m); 
    } 
 
   
	 public static void maxPrint(int num1, int num2) { 
	        if (num1 > num2) 
	            System.out.println("Max: " + num1); 
	        else 
	            System.out.println("Max: " + num2); 
	 }
 
    // Method with return statement 
    public static int max(int num1, int num2) { 
        int result; 
        if (num1 > num2) 
            result = num1; 
        else 
            result = num2; 
        return result; 
    } 

	}


