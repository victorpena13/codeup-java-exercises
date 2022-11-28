import java.util.Random;

public class ServerNameGenerate {

    public static String generate(String[] x, String[] y) {
        Random random = new Random();
        int randomIntX = random.nextInt(10);
        int randomIntY = random.nextInt(10);

        return "server name: " + x[randomIntX] + " " +y[randomIntY];
    }

    public static void main(String[] args) {

        String[] adjectives = {"amused", "bad", "cheerful", "dark", "eager", "faithful", "naughty", "stormy", "victorious"};
        String[] nouns = {"3:30pm", "gary", "man", "elephant", "1989", "that-way", "thing", "saturn", "13th"};


        System.out.println(generate(adjectives, nouns));

    }
}
