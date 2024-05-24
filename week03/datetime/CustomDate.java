package datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CustomDate {
    private int month;
    private int day;
    private int year;

    public CustomDate(int month, int day, int year){
        if(isValidDate(month, day, year)){
        this.month = month;
        this.day = day;
        this.year = year;
        }
        else{
            throw new IllegalArgumentException("Invalid Date");
        }
    }

    public void setMonth(int month){
            this.month = month;
    }

    public int getMonth(){
        return this.month;
    }

    public void setDay(int day){
        this.day = day;
    }

    public int getDay(){
        return this.day;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return this.year;
    }

    private boolean isValidDate(int month, int day, int year) {
        if (year < 1 || month < 1 || month > 12 || day < 1) {
            return false;
        }
    
        
        if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            return false;
        }
    
       
        if (month == 2) {
            
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                if (day > 29) {
                    return false;
                }
            } else {
                if (day > 28) {
                    return false;
                }
            }
        }
    
       
        return true;
    }
    

    public void displayDate(){
        System.out.println(month + "/" + day + "/" + year);
    }

    public long difference(CustomDate date){
        LocalDate dateStart = LocalDate.of(year, month, day);
        LocalDate dateEnd = LocalDate.of(date.getYear(), date.getMonth(), date.getDay());
        return ChronoUnit.DAYS.between(dateStart, dateEnd);
    }

    public static int compare(CustomDate date1, CustomDate date2){
        LocalDate localDate1 = LocalDate.of(date1.getYear(), date1.getMonth(), date1.getDay());
        LocalDate localDate2 = LocalDate.of(date2.getYear(), date2.getMonth(), date2.getDay());
        return localDate1.isBefore(localDate2) ? 1 : localDate1.isAfter(localDate2) ? -1 : 0;
    }

    public void displayFormatted(){
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", 
        "Aug", "Sep", "Oct", "Nov", "Dec"};

        System.out.println(day + " " + months[month - 1] + " " + year);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(month).append("/").append(day).append("/").append(year);
        return sb.toString();
    }


}
