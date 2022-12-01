public class Accountant extends Emp {
    public Accountant(String name, String department) {
        super(name, department);
    }

    @Override
    public String work() {
        return "crunching numbers";
    }

    public static void main(String[] args) {

    }
}
