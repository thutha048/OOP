

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student s = new Student();
		int choice;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter studentId: ");
			String id =  sc.nextLine();
			
			System.out.println("Enter name: ");
			String name= sc.nextLine();
			
			System.out.println("Enter birthday (dd/mm/yyyy): ");
			String birth = sc.nextLine();
			IllegalBirthDayException(birth);
			
		    System.out.println("Enter gpa (from 0 to 4): ");
		    float gpa= Float.parseFloat(sc.nextLine());
		    IllegalGPAException(gpa);
		    
		   Student s=  new Student(id,name,birth,gpa);
		   System.out.println("Do u want to continue? Yes(1), No(0) : ");
		   choice = sc.nextInt();
		}while(choice ==1);
	    
	}

	
	private static void IllegalGPAException(float gpa) {
		 if (gpa <0 || gpa >4) 
			 throw new InputMismatchException("Wrong. Must from 0 to 4");
	}
	
	private static void IllegalBirthDayException(String birth) {
		 
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		formatter.setLenient(false);
		try {
		    java.util.Date date= formatter.parse(birth);
		} catch (ParseException e) {
		    //If input date is in different format or invalid.
			System.out.println("Wrong format!Must be dd/mm/yyyy");
		}
	}
	

}