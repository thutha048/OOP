
public class DateTest{
	public static void main(String[] args) {
		MyDate listDate[] = new MyDate[10];
		
		listDate[0] = new MyDate(4,8,2019);
		listDate[1] = new MyDate(1,1,2020);
		listDate[2] = new MyDate(24,1,2022);
		listDate[3] = new MyDate(9,5,2021);
		
		System.out.println("Print format: ");
		listDate[0].print(1);
		
		System.out.println("\nPrint list: ");
		MyDate.print(listDate, 1);
		
		System.out.println("\nShow compare date: ");
		showCompare(listDate, 0, 1);
		showCompare(listDate, 2, 3);
		
		
		System.out.println("\nShow sort date: ");
		DateUtils.sort(listDate, 4);
	}
	
	public static void showCompare(MyDate listDate[], int x, int y) {
		System.out.print("Date 1 ");
		listDate[x].print(1);
		System.out.print("Date 2 ");
		listDate[y].print(1);
		
		int ans= DateUtils.compareDate(listDate[x], listDate[y]);
		
		DateUtils.printRes(ans);
	}
}
