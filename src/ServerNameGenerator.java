import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ServerNameGenerator {

    public static String randomizeArray(String[] ar) {
        int randomNumberOneThroughTen = ThreadLocalRandom.current().nextInt(0, ar.length-1);
        String phrase[] = {"x"};
        switch (randomNumberOneThroughTen) {
            case 0:
                 Arrays.fill(phrase, ar[0]);
                 break;
            case 1:
                Arrays.fill(phrase, ar[1]);
                break;

            case 2:
                Arrays.fill(phrase, ar[2]);
                break;

            case 3:
                Arrays.fill(phrase, ar[3]);
                break;
            case 4:
                Arrays.fill(phrase, ar[4]);
                break;
            case 5:
                Arrays.fill(phrase, ar[5]);
                break;
            case 6:
                Arrays.fill(phrase, ar[6]);
                break;
            case 7:
                Arrays.fill(phrase, ar[7]);
                break;
            case 8:
                Arrays.fill(phrase, ar[8]);
                break;
            case 9:
                Arrays.fill(phrase, ar[9]);
                break;
            case 10:
                Arrays.fill(phrase, ar[10]);
                break;
        }
        return phrase[0];
    }
    public static void main(String[] args) {
        String[] adjectives = {"charming", "cruel", "fantastic", "gentle", "huge", "perfect", "rough", "sharp"};
        String[] nouns = {"cats", "sock", "ships", "heroes", "monkeys", "babies", "matches"};

        String adjective = randomizeArray(adjectives);
        String noun = randomizeArray(nouns);
        System.out.println(adjective + " " + noun);



    }
}
