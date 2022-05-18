public class Main {
    public static void main(String[] args) {

        int myFavoriteNumber = 13;
        String myString = "This is a string";
//        myString = 'c'; // cannot use single quotes
//        myString = 3.14; // requires string and provided double
        float myNumber;
//        System.out.println(myNumber); // error: not initialized
//        myNumber = 3.14; // error: gave double requires long
        myNumber = 123L;
        myNumber = 123; // the number 123 is already assigned in line 11.

//       Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
        // because long is reserved for large numbers that range from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        // and integer is reserved for any type(decimal or whole) of number between a smaller range -2,147,483,648 to 2,147,483,647

//        Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
        myNumber = (float) 3.14;
        myNumber = 3.14F;


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

//        Try to create a variable named class. What happens?
//        String class; // unable to declare a variable called class

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o; // string cannot be cast

        int a = 4;
        a+=5;




    }
}
