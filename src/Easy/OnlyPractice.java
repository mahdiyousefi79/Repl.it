package Easy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class OnlyPractice {
    public static void main(String[] args) {

        DateTimeFormatter df =DateTimeFormatter.ofPattern("yyyy/MM/dd EEEE");
        LocalDate dOfB = LocalDate.of(1979,8,26);
        System.out.println(dOfB.format(df));

int age = LocalDate.now().getYear()-dOfB.getYear();
        System.out.println(age);

    }

}
