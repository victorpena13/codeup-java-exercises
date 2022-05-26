import util.Input;

public class InputTest {


    public static void main(String[] args) {
        Input input = new Input();
        System.out.print("Enter a string to test getString() method: ");
        String userInput = input.getString();
        System.out.println(userInput);


    }
}
