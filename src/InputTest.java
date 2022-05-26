import util.Input;

public class InputTest {


    public static void main(String[] args) {
        Input input = new Input();
        System.out.print("yes or no? ");
        String userInput = input.getString();
        System.out.println(input.yesNo(userInput));
    }
}
