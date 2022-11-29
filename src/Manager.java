public class Manager extends Employee {

    public Manager(String employeeFirstName, String employeeLastName) {
        super(employeeFirstName, employeeLastName);
    }

    public void doWork() {
        System.out.println("managing employees");
    }
}
