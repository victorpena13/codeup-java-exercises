package grades;


import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double total = 0;
        for(int i = 0; i < grades.size(); i++) {
            total = total + grades.get(i);
        }
        return total / grades.size();
    }
    public static void main(String[] args) {
        Student victor = new Student("victor");
        victor.addGrade(50);
        victor.addGrade(95);
        victor.addGrade(75);
        System.out.println("victors grades: " + victor.grades);
        System.out.println("victors average: " + victor.getGradeAverage());
    }
}
