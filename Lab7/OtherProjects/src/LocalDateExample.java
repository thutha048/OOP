import java.time.LocalDate;
import java.time.Month;

class LocalDateExample {
    public static void main(String[] args) {

        // Current date
    	LocalDate localDate = LocalDate.now();
        System.out.println(localDate); // 2020-01-04

        //Specific date
        LocalDate localDate2 = LocalDate.of(2017, Month.MAY, 15);
        System.out.println(localDate2); // 2017-05-15
    }
}