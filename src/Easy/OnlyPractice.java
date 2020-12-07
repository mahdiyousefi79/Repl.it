package Easy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class OnlyPractice {
    public String name, jobTitle, ID, companyName ;
    public double salary;
    public LocalDate hireDate;
    public char gender;


    public void setInfo(String name, String jobTitle, String ID, String companyName, double salary, LocalDate hireDate, char gender) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.companyName = companyName;
        this.salary = salary;
        this.hireDate = hireDate;
        this.gender = gender;

    }


    public String toString() {
        return "OnlyPractice{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID='" + ID + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                ", gender=" + gender +
                '}';
    }
}