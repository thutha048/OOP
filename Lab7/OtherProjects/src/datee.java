import java.util.Scanner;
import java.time.LocalDate;

public class datee {
    Scanner sc = new Scanner(System.in);

    int day;
    int month;
    int year;

    public datee() {
        String currentDate = LocalDate.now().toString();
        String values[] = currentDate.split("-");
        year = Integer.parseInt(values[0]);
        month = Integer.parseInt(values[1]);
        day = Integer.parseInt(values[2]);
    }

    public datee(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public datee(String date) {
        String values[] = date.split(" ");
        switch (values[0]) {
            case "January":
            case "February":
            case "March":
            case "April":
            case "May":
            case "June":
            case "July":
            case "August":
            case "September":
            case "October":
            case "November":
            case "December":
                System.out.println("Valid date");
                break;
            default:
                System.out.println("Invalid date");
                break;
        }
    }

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
        String date = sc.nextLine();
        String values[] = date.split("-");
        year = Integer.parseInt(values[0]);
        month = Integer.parseInt(values[1]);
        day = Integer.parseInt(values[2]);
    }

    public void print() {
        System.out.print("The current date is: ");
        System.out.println(java.time.LocalDate.now());
    }

    public void check(datee date) {
        if (date.day < 1 || date.day > 31 || date.month < 1 || date.month > 12 || date.year < 1 || date.year > 2022) {
            System.out.println("Invalid date");
            return;
        }
        switch (date.month) {
            case 4:
            case 6:
            case 9:
            case 11:
                if (date.day == 31) {
                    System.out.println("Invalid date");
                    return;
                }
            case 2:
                if ((date.day == 29 && (date.year % 400 != 0 && (date.year % 4 != 0 || date.year % 100 == 0))) || date.day >=30) {
                    System.out.println("Invalid date");
                    return;
                }
        }
        System.out.println("Valid date");
    }
}