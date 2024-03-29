// strings are objects - meaning they are a reference type.
// == operator checks if both objects are the same reference.
// ==  therefore you can't use this to compare strings only object type.
// strings are immutable.

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

        String school = "code bro";
        System.out.println(school.endsWith("up"));  //true
        System.out.println(school.endsWith("test")); // false

        char charAtMethod = school.charAt(3);
        System.out.println(charAtMethod); // e

        int indexOf = school.indexOf("e");
        System.out.println(indexOf); // 3

        int lastIndexOf = school.lastIndexOf("o");
        System.out.println(lastIndexOf); // 7

        int lengthMethod = school.length();
        System.out.println(lengthMethod); // 8

        String substringMethod = school.substring(5, 8);
        System.out.println(substringMethod); // bro

        String toUpperCase = school.toUpperCase();
        System.out.println(toUpperCase); // CODE BRO

        String toLowerCase = school.toLowerCase();
        System.out.println(toLowerCase); // code bro

        school = "  code bro  ";
        String trimMethod = school.trim();
        System.out.println(trimMethod); //"code bro" removes white space infront and end of string.

    }

}
