class Employee extends PersonLesson {
    private double salary;
    public void doWork() {
        System.out.println("rhubarb, rhubarb");
    }

    public Employee(String employeeFirstName, String employeeLastName){
        super(employeeFirstName, employeeLastName);
    }

    public String sayHello() {
        return "Hello, how can i help you?";

    }

    public static void main(String[] args) {
        Employee taylor = new Employee("taylor", "swift");
        System.out.println(taylor.sayHello());
//        System.out.println(taylor.firstName + " " + taylor.lastName);
        taylor.doWork();
        taylor.setAge(32);
        System.out.println(taylor.getFirstName());
        System.out.println(taylor.getAge());
    }
}