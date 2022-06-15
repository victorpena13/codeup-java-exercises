package contacts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class Contact {
    private String firstName;
    private String lastName;
    private String number;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNumber() {
        return number;
    }

    public String getFullName() {
        String fullName = firstName + " " + lastName;
        return fullName;
    }

    public Contact(String firstname, String lastname,  String number) throws IOException {
        this.firstName = firstname;
        this.lastName = lastname;
        this.number = number;
        Files.write(
                Paths.get("src", "contacts", "contacts.txt"),
                Arrays.asList(firstname + " " + lastname + " | " + number ),
                StandardOpenOption.APPEND
                );
    }


    public void allContacts() {

    }
}
