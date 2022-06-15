package contacts;

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

    public Contact(String firstname, String lastname,  String number) {
        this.firstName = firstname;
        this.lastName = lastname;
        this.number = number;
    }

    public void allContacts() {

    }
}
