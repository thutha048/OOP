
public class DataTest {
	 public static void main(String[] args) {
		 
	        MyDate date1 = new MyDate(); 
	        date1.print();
	        MyDate date2 = new MyDate(5,8,2019); 
	        date2.check(date2);
	        MyDate date3 = new MyDate("February 18th 2019");
	        date3.accept();
	        System.exit(0);
	 }
}
