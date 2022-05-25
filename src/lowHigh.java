import java.util.concurrent.ThreadLocalRandom;

public class lowHigh {

    public static void main(String[] args) {
        int randomInt = ThreadLocalRandom.current().nextInt(1, 101);
        System.out.println(randomInt);


    }
}
