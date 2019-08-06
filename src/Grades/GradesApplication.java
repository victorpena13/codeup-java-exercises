package Grades;

import java.util.Scanner;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student victor = new Student("victor");
        victor.addGrade(90);
        victor.addGrade(85);
        victor.addGrade(75);
        students.put("victorpena13", victor);
        System.out.println(students.get("victorpena13").getName());
        System.out.println(students);
        System.out.println(victor.getGradeAverage());
        Student mario = new Student("mario");
        mario.addGrade(99);
        mario.addGrade(75);
        mario.addGrade(50);
        students.put("mylittlepony25", mario);
        System.out.println(students.get("mylittlepony25").getName());
//        System.out.println(students);
        System.out.println(mario.getGradeAverage());
        Student susan = new Student("susan");
        susan.addGrade(99);
        susan.addGrade(89);
        susan.addGrade(79);
        students.put("kpopqueen52", susan);
        System.out.println(students.get("kpopqueen52").getName());
        System.out.println(susan.getGradeAverage());

        boolean repeat = true;
        do {
            System.out.println("Here are the GitHub Usernames of our students:");
            System.out.println(students.keySet());
            Scanner scanner = new Scanner(System.in);
            System.out.println("What student would you like to see more information on?");
            String userInput = scanner.nextLine();
            System.out.println(userInput);
            if(userInput.equalsIgnoreCase("victorpena13")) {
                System.out.println(victor.getGradeAverage());

            } else if (userInput.equalsIgnoreCase("mylittlepony25")) {
                System.out.println(mario.getGradeAverage());
            } else if (userInput.equalsIgnoreCase("kpopqueen52")) {
                System.out.println(susan.getGradeAverage());
            }
        } while(repeat);

    }
}


