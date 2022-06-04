package grades;
import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        Student victor = new Student("victor pena");
        HashMap<String, String> students = new HashMap<>();

        students.put(victor.getName() , "victorpena13");
        System.out.println(students.get("victor pena"));


    }
}

