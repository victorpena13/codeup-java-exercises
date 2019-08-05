package Grades;

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

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }
    // returns the average of the students grades

    public double getGradeAverage() {
        double total = 0;
        for(int i = 0; i<grades.size();i++) {
            total = total + grades.get(i);
        }
        return total / grades.size();
    }



public static void main(String[] args) {
  Student victor= new Student("Victor");
    System.out.println("victor.getName() = " + victor.getName());
    victor.addGrade(90);
    System.out.println(victor.grades);
    victor.addGrade(80);
    System.out.println(victor.grades);
    System.out.println(victor.getGradeAverage());

}

}
