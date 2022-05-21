public class ControlFlowExercise {
    public static void main(String[] args) {
        System.out.println("while loop:");
        int i = 5;

        while (i <= 15) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println("\ndo-while loop:");
        int a = 0;
        do {
            System.out.print(a + " ");
            a++;
        } while (a <= 100);
    }
}
