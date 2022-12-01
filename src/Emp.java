abstract class Emp {
    protected String name;
    protected String department;

    public Emp(String name, String department) {
        this.name= name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
    public abstract String work();
}
