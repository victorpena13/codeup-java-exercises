public class Developer extends Emp {
    public Developer(String name, String department) {
        super(name, department);
    }

    @Override
    public String work() {
        return "writing code";
    }
}
