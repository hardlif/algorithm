import java.util.Scanner;

public class 格式化日期 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       long dataTime =  scanner.nextLong();
       //今天的秒数
       long hourTime = dataTime%(60*60*24*1000)/1000;
        //
       long hour = hourTime/(60*60);
       long minute = hourTime/(60)%60;
       long seconds = hourTime-hour*60*60-minute*60;
       String hourStr = hour>9 ? String.valueOf(hour) : "0"+String.valueOf(hour);
        String minuteStr = minute>9 ? String.valueOf(minute) : "0"+String.valueOf(minute);
        String secondsStr = seconds>9 ? String.valueOf(seconds) : "0"+String.valueOf(seconds);
        System.out.println(hourStr+":"+minuteStr+":"+secondsStr);
    }


}
