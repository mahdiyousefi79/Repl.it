import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Practice {

    public String name, jobTitle, ID;

    public double salary;


    public Practice(String name) {
        this.name = name;
    }

    public Practice(String name, String jobTitle) {
        this(name);
        this.jobTitle = jobTitle;
    }

    public Practice(String name, String jobTitle, String ID) {
        this(name, jobTitle);
        this.ID = ID;
    }

    public Practice(String name, String jobTitle, String ID, double salary) {
        this(name, jobTitle, ID);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Practice{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID='" + ID + '\'' +
                ", salary=" + salary +
                '}';
    }
}
//---------------------------------------------------
class PracticeObject{

    Practice practice1 = new Practice("mahdi");


}