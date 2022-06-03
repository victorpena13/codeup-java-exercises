package grades;

public class StudentTest {

    public static void main(String[] args) {
        Student vic = new Student("vic");
        vic.addGrade(100);
        vic.addGrade(50);
        System.out.print(vic.getName() + ": ");
        System.out.println(vic.getGradeAverage());
    }

}
