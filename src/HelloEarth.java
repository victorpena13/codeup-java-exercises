import java.util.Scanner;

public class HelloEarth {
    public static void main(String[] args){
        System.out.println("Hello, Earth");

        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);

        String myString = "String value";
        System.out.println(myString);

//        myString = 'a';  // required string provided char.
//        myString = 3.14159; // required string provided double.

        long myNumber;
        //System.out.println(myNumber); // has not been initialized.
        //myNumber =3.14; // required long provided double.
        myNumber = 123L;
        myNumber = 123; // variable is already assigned to this value.

        // precision

        float precisionTest = myNumber;
        System.out.println(precisionTest);

        int x =5;
        System.out.println(x++);
        System.out.println(x);

        int y = 5;
        System.out.println(++y);
        System.out.println(y);

        int a = 4;
        a +=5;
        int b = 3;
        int c = 4;
        c *=b;

        int m = 10;
        int n = 2;
        m /= n;
        n -=m;

        int maxInt = Integer.MAX_VALUE;
        System.out.println(maxInt); // 2147483647
        System.out.println(++maxInt); // -2147483648

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a integer: ");
        int userInt = scanner.nextInt();
        System.out.println("you entered: " + userInt);

    }
}
