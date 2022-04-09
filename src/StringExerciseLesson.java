// strings are objects - meaning they are a reference type.
// == operator checks if both objects are the same reference.
// ==  therefore you can't use this to compare strings only object type.
// strings are immutable

import java.util.Scanner;

public class StringExerciseLesson {
    public static void main (String[] args) {
        String message = "Hello";
        System.out.println(message);
        message = message + " World!";
        System.out.println(message);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Continue? [y,N]");
        String userInput = scanner.next();

        if(userInput.equals("y")){
            System.out.println("yes");
        } else if (userInput.equals("n")) {
            System.out.println("no");
        }

        String school = "code up";
        System.out.println(school.endsWith("up"));  //true
        System.out.println(school.endsWith("test")); // false

        char charAtMethod = school.charAt(3);
        System.out.println(charAtMethod); // e

        int indexOfString = school.indexOf("e");
        System.out.println(indexOfString); // 3



    }

}
