package library;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CreatedBy_Mahdi {
    public static void timeConversion(String s) {

        String s1 = s.toLowerCase();
        int hour = Integer.parseInt(s1.substring(0, s1.indexOf(':')));
        int minute = Integer.parseInt(s1.substring(s1.indexOf(':') + 1, s1.lastIndexOf(':')));
        int second = Integer.parseInt(s1.substring(s1.lastIndexOf(':') + 1, s1.indexOf('m') - 1));

        if (s1.contains("pm")) {

            if (hour == 12) {
                hour = 12;
            } else {
                hour += 12;
            }
        }
        if (s1.contains("am") && hour == 12) {
            hour = 0;

        }


        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("mm:ss");  // if we have seconds 00 it gives 00 not 0
        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("hh");

        LocalTime convertedTime = LocalTime.of(hour, minute, second);

        if (hour <= 12) {
            System.out.println(convertedTime.format(df2) + ":" + convertedTime.format(df1));
        }
        if (hour > 12) {
            System.out.println(hour + ":" + convertedTime.format(df1));    //   to shows 24-hour clock
        }
    }
}