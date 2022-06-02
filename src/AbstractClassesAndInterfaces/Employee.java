package AbstractClassesAndInterfaces;

abstract class Employee {
    protected String name;
    protected String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    public abstract String work();

}
