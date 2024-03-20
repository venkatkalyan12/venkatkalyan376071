package kalyan;

import java.util.Scanner;

public class ven {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner keyboard = new Scanner(System.in);

	      
	        System.out.println("1. REGISTER");
	        System.out.println("2. LOGIN");
	        System.out.println("3. HELP");
	        
	        int choice;
			do {
	        System.out.println("choose options between 1 and 3");
	        	  
	        choice = keyboard.nextInt();

	        }
	        while (!(choice >3 || choice <1 ));
	        if (choice ==1) {
				choice= REGISTERS;
	        } else if (choice ==2) {
	        	choice=Logins;
	        }else if (choice ==3) {
	        	choice= Helps;
	        }
		
Scanner in =new Scanner(System.in);
System.out.println("ENTER YOUR NAME:");
String name=in.nextLine();
System.out.println("age:");
String age=in.nextLine();
System.out.println("Gender:");
String Gender=in.nextLine();
System.out.println("MALE,FEMALE:");
String gen=in.next();
in.close();
 
while (true) {
	System.out.println("ENTER YOUR NAME:");
	System.out.println("age:");
	System.out.println("Gender:");
	System.out.println("MALE,FEMALE:");
	

break;
	
}

	}

}
