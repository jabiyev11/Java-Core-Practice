import datetime.CustomTime;

public class CustomTimeTest {
    public static void main(String[] args) {
        CustomTime time1 = new CustomTime(12, 34, 23);
        CustomTime time2 = new CustomTime(15, 45);
        CustomTime time3 = new CustomTime(14);
        CustomTime time4 = new CustomTime(0, 0, 0);
        CustomTime time5 = new CustomTime(time1);
    
    System.out.println("Universal format of time 1 is " + time1.toUniversalString());
    System.out.println("Standart format of time 1 is " + time1.toStandartString());

    System.out.println("Universal format of time 2 is " + time2.toUniversalString());
    System.out.println("Standart format of time 2 is " + time2.toStandartString());

    System.out.println("Universal format of time 3 is " + time3.toUniversalString());
    System.out.println("Standart format of time 3 is " + time3.toStandartString());

    System.out.println("Universal format of time 4 is " + time4.toUniversalString());
    System.out.println("Standart format of time 4 is " + time4.toStandartString());

    System.out.println("Universal format of time 5(copy of time 1) is " + time5.toUniversalString());
    System.out.println("Standart format of time 5(copy of time 1) is " + time5.toStandartString());

    }
}
