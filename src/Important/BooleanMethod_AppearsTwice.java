package Important;

public class BooleanMethod_AppearsTwice {
    public static void main(String[] args) {




     String str = "I would like to buy a new laptop,  because my laptop is too old.";
     String target ="laptop";

        boolean a=appearsTwice(target,str);
        System.out.println(a);
    }

    public static boolean appearsTwice(String target, String sentence) {
        int count = 0;
       for (String each: sentence.split(" "))
           if (each.contains(target)){
               count++;
           }
        return (count == 2) ? true : false;

    }
}

/*
Write a a method appearsTwice() that returns true if value of variable target appears only twice in the string sentence, otherwise return false.

Examples:
Main.appearsTwice("java", "java is fun!")
      - returns false, because java appears only once.

Main.appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old.")
      - returns true, because laptop appears twice.
 */