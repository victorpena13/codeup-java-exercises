import java.util.Scanner;


public class Bob {
//    Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//    Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
    // lastIndexOf()
    // endsWith()
//    He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
    // lastIndexOf()
//    He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
    // isEmpty()
//    He answers 'Whatever.' to anything else.
    // else 'whatever'
//    Write the Java code necessary so that a user of your command line application can have a conversation with Bob.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Start a convo with bob: ");
        //use .nextLine to capture the end of the string with methods like .endsWith();
        String userInput = scanner.nextLine();
        System.out.println(userInput.endsWith("?"));
        System.out.println(userInput.lastIndexOf("?"));
    }
}
