public class Student {
    public String name;
    public String cohort;
    private double grade;

    public Student(String studentName) {
        name = studentName;
        cohort = "Unassigned";
    }

    public Student(String studentName, String assignedCohort) {
        name = studentName;
        cohort = assignedCohort;
    }
    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public double shareGrade() {
        return grade;
    }

    public String getInfo() {
        return String.format("name: %s, cohort: %s", name, cohort);
    }

    public String sayHello() {
        return "Hello from " + this.name + "!";
    }

    public static void main(String[] args) {
        Student s1 = new Student("Student A");
        Student s2 = new Student("Student B", "Voyagers");
        System.out.println(s1.getInfo());
        System.out.println(s2.getInfo());
        System.out.println(s1.sayHello());
    }
}
