public class ControlFlowExercises {
    public static void main (String[] args) {

        // write a program that prints the numbers from 1 to 100.
        // for multiples of three: print "fizz" instead of the number.
        // for multiples of five: print "buzz".
        // for numbers which are multiples both three and five: print "fizzbuzz"


        for (int i =1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("fizz");
                continue;
            } else if (i % 5 == 0) {
                System.out.println("buzz");
                continue;
            }
            System.out.println(i);
        }
    }
}
