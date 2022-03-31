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

        //because long is reserved for large numbers that range from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        // and integer is reserved for any type(decimal or whole) of number between a smaller range -2,147,483,648 to 2,147,483,647

    }
}
