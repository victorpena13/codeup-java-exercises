package grades;

import java.util.ArrayList;

public class Student extends StudentTest {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double average = 0;
        for(double grade : grades) {
            average += grade;
        }
        return average / grades.size();
    }
}
