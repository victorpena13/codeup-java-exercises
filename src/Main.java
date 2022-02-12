import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Create an int variable named myFavoriteNumber and assign
//your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 13;
        System.out.println(myFavoriteNumber);

//Create a String variable named myString and assign a string
//value to it, then print the variable out to the console.
        String name = "victor";
        System.out.println(name);

// Change your code to assign a character value to myString. What do you notice?
// Change your code to assign the value 3.14159 to myString. What happens?
// an error occurs. and the code will not compile.
//Declare an long variable named myNumber, but do not
// assign anything to it. Next try to print out myNumber to the console. What happens?
// an error occurs saying lacks initialization.

//Change your code to assign the value 3.14 to myNumber. What do you notice?
//unable to place a double digit inside a float.

//Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//cast or declare myNumber as double.
        float myNumber;
        myNumber = (float) 3.14;

        int y = 5;
        System.out.println(y++);
        System.out.println(y);

        int a = 5;
        System.out.println(++a);
        System.out.println(a);

        //y does not immediately reflect the increment.
        //a immediately reflects the increment.

// Object is the most generic type in Java. You can assign any value to a variable
// of type Object. What do you think will happen when the following code is run?
//the code is redundant.
//string cannot be cast to integer

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//Rewrite the following expressions using the relevant shorthand assignment operators:

        int x = Integer.MAX_VALUE;
        int result = x += 1;
        System.out.println("test");
        System.out.println(result);

// if an int goes over the maximum limit it begins at -2147....

        String nickName = "willy";
        System.out.printf("Hello there, %s.  Nice to see you.%n", nickName);//%n - new line
        String greeting = "Salutations";
        System.out.printf("%s, %s!", greeting, nickName);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Something: ");
        String userInput = scanner.next();
        System.out.printf("You entered: --> %s <--", userInput);
    }
}
