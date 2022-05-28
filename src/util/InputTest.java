package util;

import util.Input;

public class InputTest {


    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("continue? [yes / no] ");
        String userInput = input.getString();
        input.yesNo("would you like to measure a circle [yes / no] ", userInput);
        System.out.println(input.getInt(1,10));
        System.out.println(input.getDouble(1,20));
    }
}
