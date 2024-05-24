import datetime.CustomDate;

public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate date1 = new CustomDate(12, 29, 2013);
        CustomDate date2 = new CustomDate(3, 12, 2022);
        
        System.out.println("Date 1: ");
        date1.displayDate();
        date1.displayFormatted();

        System.out.println("Date 2: ");
        date2.displayDate();
        date2.displayFormatted();

        System.out.println("Date differences in days between date1 and date2 is " + date1.difference(date2));

        int comparison = CustomDate.compare(date1, date2);
        if(comparison == 1) {
            System.out.println("Date 1 is before Date 2");
        }
        else if(comparison == -1) {
            System.out.println("Date 1 comes after Date 2");
        }
        else {
            System.out.println("Date 1 is the same as Date 2");
        }

    }
}
