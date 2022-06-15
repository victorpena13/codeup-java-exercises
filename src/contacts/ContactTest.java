package contacts;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ContactTest {

    public static String menu(){
        System.out.println("1. view contacts.");
        System.out.println("2. add new contact.");
        System.out.println("3. search a contact by name.");
        System.out.println("4. delete an existing account.");
        System.out.println("5. exit.");
        System.out.print("Enter an option 1, 2, 3, 4 or 5: ");
        Scanner scanner = new Scanner(System.in);
        String userResponse = scanner.next();
        return userResponse;
    }

    public static void main(String[] args) {
        Path contactsDotTxt = Paths.get("src","contacts", "contacts.txt");
        System.out.println(contactsDotTxt);
        boolean test = Files.exists(contactsDotTxt);
        System.out.println(test);
        menu();

    }
}
