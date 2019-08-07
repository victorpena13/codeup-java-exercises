package grades;

import java.util.HashMap;
import java.util.Scanner;
public class GradesApplication {

    static HashMap<String, Student> students = new HashMap<>();

    public static void main(String[] args) {

        Student victor = new Student("victor");
        victor.addGrade(95);
        victor.addGrade(75);
        victor.addGrade(69);
        students.put("victorjavierantoniopenadelagarza", victor);
        System.out.println(students.get("victorjavierantoniopenadelagarza").getName());
        System.out.println("grade average: " + victor.getGradeAverage());
        Student susan = new Student("susan");
        susan.addGrade(100);
        susan.addGrade(85);
        susan.addGrade(90);
        students.put("KpopQueen52", susan);
        System.out.println(students.get("KpopQueen52").getName());
        System.out.println("grade average: " + susan.getGradeAverage());
        Student mario = new Student("mario");
        mario.addGrade(100);
        mario.addGrade(75);
        mario.addGrade(90);
        students.put("mylittlepony25", mario);
        System.out.println(students.get("mylittlepony25").getName());
        System.out.println("grade average: " + mario.getGradeAverage());
        Student peter = new Student("peter");
        peter.addGrade(100);
        peter.addGrade(100);
        peter.addGrade(0);
        students.put("gangstaboi69", peter);
        System.out.println(students.get("gangstaboi69").getName());
        System.out.println("grade average: " + peter.getGradeAverage());

        showStudents();
        boolean repeat = true;

    }

    public static void showStudents() {
        System.out.println("Here are the GitHub usernames of our students:");
        for (String username : students.keySet()) {
            System.out.print(username + " | ");
        }
        System.out.println();

    }
}






























//package grades;
//
//import java.util.Scanner;
//import java.util.HashMap;
//
//public class GradesApplication {
//    static HashMap<String, Student> students = new HashMap<>();
//
//    public static void main(String[] args) {
//        Student victor = new Student("victor");
//        victor.addGrade(90);
//        victor.addGrade(85);
//        victor.addGrade(75);
//        students.put("victorpena13", victor);
//        System.out.println(students.get("victorpena13").getName());
//        System.out.println(students);
//        System.out.println(victor.getGradeAverage());
//        Student mario = new Student("mario");
//        mario.addGrade(99);
//        mario.addGrade(75);
//        mario.addGrade(50);
//        students.put("mylittlepony25", mario);
//        System.out.println(students.get("mylittlepony25").getName());
////        System.out.println(students);
//        System.out.println(mario.getGradeAverage());
//        Student susan = new Student("susan");
//        susan.addGrade(99);
//        susan.addGrade(89);
//        susan.addGrade(79);
//        students.put("kpopqueen52", susan);
//        System.out.println(students.get("kpopqueen52").getName());
//        System.out.println(susan.getGradeAverage());
//
//        boolean repeat = true;
//        do {
//            System.out.println("Here are the GitHub Usernames of our students:");
//            System.out.println(students.keySet());
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("What student would you like to see more information on?");
//            String userInput = scanner.nextLine();
//            System.out.println(userInput);
//            if(userInput.equalsIgnoreCase("victorpena13")) {
//                System.out.println(victor.getGradeAverage());
//
//            } else if (userInput.equalsIgnoreCase("mylittlepony25")) {
//                System.out.println(mario.getGradeAverage());
//            } else if (userInput.equalsIgnoreCase("kpopqueen52")) {
//                System.out.println(susan.getGradeAverage());
//            }
//        } while(repeat);
//
//    }
//    }



