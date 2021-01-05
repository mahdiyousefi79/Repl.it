package OOP.CodesWroteSameClass;



import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person1 {


        private String firstname, lastname, SSN;
        private int birthmonth, birthday, birthyear;


        public Person1(String firstname, String lastname , int birthmonth, int birthday, int birthyear, String SSN) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.SSN = SSN;
            this.birthmonth = birthmonth;
            this.birthday = birthday;
            this.birthyear = birthyear;
        }


        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getBirthday() {


            DateTimeFormatter df = DateTimeFormatter.ofPattern("MM/dd/yyyy");
            LocalDate DOB = LocalDate.of(birthyear, birthmonth, birthday);


            return DOB.format(df);
        }

        public boolean verifySSN(String SSN) {

            if (SSN.equals(this.SSN)) {
                return true;

            } else {
                return false;
            }
        }
    }

class Person1Object {
    public static void main(String[] args) {


        Person1 per = new Person1("Mahdi", "Yousefi", 8, 26, 1979, "12345");

        System.out.println(per.getFirstname());
        System.out.println(per.getLastname());
        System.out.println(per.getBirthday());  // 08/26/1979


        System.out.println(per.verifySSN("12345"));  //true
    }
}



/*
Rename file1.java to Person.java

Create the a Person class with the following:

Class Variables
String firstname
String lastname
int birthmonth
int birthday
int birthyear
String ssn
All variables above should be private.

Constructor
The main constructor should take in all values and assign them to their respective private class variables

Methods
Create a public getters and setters for firstname and lastname:
getFirstname
getLastname
setFirstname
setLastname

Create a public getter method called getBirthday, which will return a String composed of their birthday in month/day/year format.
  For example, if birthmonth=3, birthday=22, birthyear=2000, it should return the String "3/22/2000"

Create a public method called verifySSN that takes in a String parameter and returns a boolean.
 It will check the parameter against the person's SSN and return true or false based on whether they match.

Complete the questions on Classroom.
 */