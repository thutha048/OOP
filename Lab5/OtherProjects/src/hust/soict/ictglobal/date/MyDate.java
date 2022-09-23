package hust.soict.ictglobal.date;
import java.util.Scanner;
import java.time.LocalDate;

public class MyDate {
	Scanner keyboard = new Scanner(System.in);
	
	private int day;
	private int month;
	private int year;
	
	//1st constructor
	public MyDate() {
		 LocalDate localDate = LocalDate.now();
	     year=  localDate.getYear(); 
	     month=  localDate.getMonth().getValue();
	     day = localDate.getDayOfMonth();     
	   //  System.out.println(year+ "-"+month+"-"+day);
	}
	
	//2nd constructor
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month= month;
		this.year =year;
	}
	
	//3rd constructor
	public MyDate(String dmy ) {
		  String[] mon = dmy.split("\\s");
	        switch (mon[0]) {
	            case "January": case "February": case "March":
	            case "April": case "May":case "June":
	            case "July": case "August": case "September":case "October":
	            case "November": case "December":
	                System.out.println("Valid date");
	                break;
	            default:
	                System.out.println("Invalid date");
	                break;
	        }
	}
	
	//getter and setter methods:
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	 public void accept() {
	    System.out.println("Enter a date (yyyy-mm-dd):");
        String date = keyboard.nextLine();
        String values[] = date.split("-");
	    year = Integer.parseInt(values[0]);
	    month = Integer.parseInt(values[1]);
	    day = Integer.parseInt(values[2]);
	    System.out.println("Year is "+ year);
	    System.out.println("Month is "+ month);
	    System.out.println("Day is "+day);
	}

    public void print() {
    	LocalDate localDate = LocalDate.now();
	    System.out.print("The current date is: ");
	    System.out.println(localDate);
	}
	    
	    
   public void check(MyDate date) {
        if (date.day < 1 || date.day > 31 || date.month < 1 || date.month > 12 || date.year < 1 || date.year > 2022) {
            System.out.println("Invalid date");
            return;
        }
        switch(date.month) {
        	case 2:
        		if ((date.day == 29 && (date.year % 400 != 0 && (date.year % 4 != 0 || date.year % 100 == 0))) || date.day >=30) {
        			System.out.println("Invalid date");
                return;
        		}
            case 4: case 6: case 9: case 11:
                if (date.day == 31) {
                    System.out.println("Invalid date");
                    return;
                }        
        }
        System.out.println("Valid date");
    }	
}
