package contacts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
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

    public static void main(String[] args) throws IOException {
        Path contactsDotTxt = Paths.get("src","contacts", "contacts.txt");
        System.out.println(contactsDotTxt);
        boolean test = Files.exists(contactsDotTxt);
        System.out.println(test);
        Integer response = Integer.valueOf(menu());
        Scanner scanner = new Scanner(System.in);
        Contact contact = new Contact();
        switch (response){

            case 1:
                contact.allContacts();
                break;
            case 2:
                System.out.print("firstname: ");
                String newContactFirstName = scanner.next();
                System.out.print("lastname: ");
                String newContactLastName = scanner.next();
                System.out.print("number: ");
                String newContactNumber = scanner.next();
                System.out.println("2");
                new Contact(newContactFirstName, newContactLastName, newContactNumber);
                System.out.println("contact saved!");
                break;
            case 3:
                System.out.println("search contact.");
                System.out.print("firstname: ");
                String searchFirstName = scanner.next();
                System.out.print("lastname: ");
                String searchLastName = scanner.next();
                Path contactsPath = Paths.get("src", "contacts", "contacts.txt");
                List<String> contactList = Files.readAllLines(contactsPath);
                for(int i = 0; i < contactList.size(); i += 1) {
                    if (contactList.get(i).contains(searchFirstName) && contactList.get(i).contains(searchLastName)) {
                        System.out.println("true");
                        System.out.println((i + 1) + " : " + contactList.get(i));
                    } else {
                        System.out.println("that contact does not exist.");
                    }
                }
                break;
        }
    }
}
