import java.util.Arrays;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.Date;

public class DateUtils {
	public static int compareDate(MyDate date1, MyDate date2) {
		int result = 0;
		if(date1.getYear()==date2.getYear()) {
			if(date1.getMonth()==date2.getMonth()) {
				if(date1.getDay()==date2.getDay()) {
					result=0;
				}else if(date1.getDay()<date2.getDay()) {
					result=-1;
				}else 
					result=1;
			}else if(date1.getMonth()<date2.getMonth()){
				result=-1;
			}else
				result=1;
		}else if(date1.getYear()<date2.getYear()) {
			result=-1;
		}else
			result =1;
		return result;
	}
	
	public static void printRes(int result) {
		 if (result == 0) {
	            System.out.println("Date1 is equal to Date2");
	        } else if (result > 0) {
	            System.out.println("Date1 is after Date2");
	        } else if (result < 0) { //-1
	            System.out.println("Date1 is before Date2");
	        } 
		// System.out.println("Res: "+ result);
	}
	
	public static void sort(MyDate[] myList, int length) {
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length; j++) {
				if(compareDate(myList[i], myList[j]) < 0) {
					MyDate temp = myList[i];
					myList[i] = myList[j];
					myList[j] = temp;
				}
			}
		}
		MyDate.print(myList, 4);
	}
}

