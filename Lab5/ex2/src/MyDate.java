import java.util.Scanner;
import java.time.LocalDate;

public class MyDate {
	private String date;
	private int day;
	private int month;
	private int year;
	
		
		public MyDate(int day, int month, int year) {
			this.day = day;
			this.month= month;
			this.year =year;
			this.date = StringDate();
		}
		
		//3rd constructor
		private String StringDate() {
			String[] strMonth = {" ", "January", "February", "March", "April", "May", "June",
					"July", "August", "September", "October", "November", "December"};
			String[] strOrder = {" ", "st", "nd", "rd", "th"};
			
			return strMonth[month] + " " + day + strOrder[Math.min(4, day)] + " " + year;
		}
		
		
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	 public String setDay(String day) {
		 return day;
	}
	

	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	public String setMonth(String month) {
		return month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public String setYear(String year) {
		return year;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	

	public void accept() {
		System.out.print("Please enter date (dd/mm/yyyy): ");
		Scanner scanDate = new Scanner(System.in);
		String str = scanDate.nextLine();
		String seperate[] = str.split("/");
		setDay(Integer.valueOf(seperate[0]));
		setMonth(Integer.valueOf(seperate[1]));
		setYear(Integer.valueOf(seperate[2]));
		setDate(StringDate());
		
	}
	
	public void print() {
		System.out.println(date);
	}
	public static void print(MyDate dateList[], int length) {
		for(int i=0 ;i<length;i++){
			dateList[i].print();
		}
	}
	
	public void print(int form) {
		String strForm;
		switch(form) {
			case 1:
				strForm = this.day + " / " + this.month + " / " + this.year;
				System.out.println("Format dd/mm/yyyy: " +strForm);
				break;
				
			// yy-mm-dd
			case 2:
				strForm= this.year%100 + " - " + this.month + " - " + this.day;
				System.out.println("Format yy-mm-dd: " + strForm);
				break;
				
			default:
				System.out.println("Error!");
				break;
		}
	}
	
}

	