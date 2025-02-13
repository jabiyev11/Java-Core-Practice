package datetime;

public class CustomTime {
    private int hour;
    private int minute;
    private int second;

    public CustomTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public CustomTime(){
        this(0, 0, 0);
    }

    public CustomTime(int hour){
        this(hour, 0, 0);
    
    }

    public CustomTime(int hour, int minute){
        this(hour, minute, 0);
    }

    public CustomTime(CustomTime time){
        this(time.hour, time.minute, time.second);
    }


    public int getHour(){
        return this.hour;
    }

    public int getMinute(){
        return this.minute;
    }

    public int getSecond(){
        return this.second;
    }

    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandartString(){
        return String.format("%2d:%02d:%02d %s", 
        ((hour == 0 || hour == 12) ? 12 : hour % 12), minute, second, 
        (hour < 12 ? "AM" : "PM"));
       
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%02d", hour)).append(":")
          .append(String.format("%02d", minute)).append(":")
          .append(String.format("%02d", second));
        return sb.toString();
    }
}
