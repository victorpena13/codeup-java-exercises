public class Main {
    public static void main(String[] args) {

//  Create an int variable named myFavoriteNumber
//  and assign your favorite number to it, then print it
//  out to the console.

        int myFavoriteNumber = 13;
        System.out.println("My Favorite Number: " + myFavoriteNumber + ".");

//  Create a String variable named myString and assign a
//  string value to it, then print the variable out to the
//  console.

        String myString;
        myString = "This is a string value example";
        System.out.println(myString);

//  Change your code to assign a character value
//  to myString. What do you notice?

        // myString = 'a';
        // you cannot assign a single character to a string variable.
        myString = "this is STRING VALUE example!";
        System.out.println(myString);

//  Change your code to assign the value 3.14159
//  to myString. What happens?

        // myString = 3.13159;
        // error: required String. type entered: double;

//  Declare an long variable named myNumber, but do
//  not assign anything to it. Next try to print out
//  myNumber to the console. What happens?

        long myNumber;
        // System.out.println(myNumber);
        // result: error - variable may not have been intialized;

//  Change your code to assign the value 3.14 to myNumber. What do you notice?

        // myNumber = 3.14;
        // result: error - required type: long. provided: double

//  Change your code to assign the value 123L
//  (Note the 'L' at the end) to myNumber.

        myNumber = 123L;

//  Change your code to assign the value 123 to myNumber

        myNumber = 123;  // variable is already assigned to this value;

//  Why does assigning the value 3.14 to a variable declared as a long
//  not compile, but assigning an integer value does?

        // because long is reserved for large numbers that range from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        // and integer is reserved for any type(decimal or whole) of number between a smaller range -2,147,483,648 to 2,147,483,647

// Change your code to declare myNumber as a float. Assign the value 3.14
// to it. What happens? What are two ways we could fix this?

        double pi = 3.14;
        myNumber = (int) pi;
        System.out.println(myNumber);


        System.out.println("Two Code Blocks Executed: ");
        int x = 5;
        System.out.println(x++);
        System.out.println(x);

        int y = 5;
        System.out.println(++y);
        System.out.println(y);

// What is the difference between the above code blocks?
// Explain why the code outputs what it does.
        // the difference between post and pre increment. is with post increment
        // the new value is not immediately revealed.
        // with pre increment the result is immediately revealed

//  Try to create a variable named class. What happens?

        // name class is off-limits because it is apart of the java language.


//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        System.out.println("test");
//        int three = (int) o;

        // you cannot cast a string.

// Rewrite the following expressions using the relevant shorthand assignment operators:

        int z = 4;
        z += 5;

        int l = 3;
        int h = 4;
        h *= l;

        int a = 10;
        int b = 2;
        a /= b;
        b -= a;

//  What happens if you assign a value to a numerical variable that is
//  larger (or smaller) than the type can hold? What happens if
//  you increment a numeric variable past the type's capacity?

        int longVariableMax = Integer.MAX_VALUE;
        System.out.println(longVariableMax);
        System.out.println(++longVariableMax); // result: -2147483648

//  when an int is incremented at is highest point it will loop
//  around to the beginning at -2147483648

    }
}
