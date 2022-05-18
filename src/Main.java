public class Main {
    public static void main(String[] args) {

        int myFavoriteNumber = 13;
        String myString = "This is a string";
//        myString = 'c'; // cannot use single quotes
//        myString = 3.14; // requires string and provided double
        long myNumber;
//        System.out.println(myNumber); // error: not initialized
//        myNumber = 3.14; // error: gave double requires long
        myNumber = 123L;
        myNumber = 123; // the number 123 is already assigned in line 11.

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

    }
}
