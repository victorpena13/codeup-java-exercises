package exceptionsAndErrorHandling;

import java.util.Scanner;

public class CheckedExpression {
    public static String getIndentationPreference() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("What type of indentation do you prefer?");
        String indentationPreference = sc.nextLine();
        if (indentationPreference.equals("tabs")) {
            throw new Exception("Spaces are superior!");
        }
        return indentationPreference;
    }

    public static void main(String[] args) throws Exception {
        String indentationPreference;
        try {
            indentationPreference = getIndentationPreference();
            System.out.println("okay " + indentationPreference + " is a great choice.");
        } catch (Exception e) {
            System.out.println("uh oh, something went wrong " + e.getMessage());
            System.out.println("Here is some more detail: ");
            e.printStackTrace();
        }
    }

}
