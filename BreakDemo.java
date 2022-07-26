package JavaPractice;

public class BreakDemo {

	public static void main(String[] args) {
	for(int i=1; i<=100; i=i+2) {
	if(i==10) {	
		 break;
	}
	System.out.println(i);
	
	for(int j=1; j<=100; j=j+3) {
		if(j==10) {	
			 continue;
		}
		System.out.println(j);
	}
	}
	
	}

}
