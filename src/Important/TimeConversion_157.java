package Important;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class TimeConversion_157 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {

        String s1= s.toLowerCase();
        int hour = Integer.parseInt(s1.substring(0,s1.indexOf(':')));
        int minute = Integer.parseInt(s1.substring(s1.indexOf(':')+1,s1.lastIndexOf(':')));
        int second = Integer.parseInt(s1.substring(s1.lastIndexOf(':')+1,s1.indexOf('m')-1));

       if (s1.contains("pm")){
           hour+=12;
       }
     if (s1.contains("am") && hour==12) {
         hour =0;

     }

        LocalTime convertedTime = LocalTime.of(hour,minute,second);
        System.out.println(convertedTime);
    }


    }

/*
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
 Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
Function Description
It should print a new string representing the input time in 24 hour format.
timeConversion has the following parameter(s):
s: a string representing time in  12 hour format

Input: 07:05:45PM
Output: 19:05:45
 */