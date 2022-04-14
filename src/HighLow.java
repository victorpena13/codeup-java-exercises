import java.util.Random;

public class HighLow {

    public static void main(String[] args) {
        Random r = new Random();
        int low = 1;
        int high = 100;
        int result = r.nextInt(high-low) + low;
        System.out.println(result);
    }
}
