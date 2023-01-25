class StudentLesson {

    // instance variable fields:
    public String name;
    public String cohort;

    // constructor: 
    public StudentLesson(String studentName) {
        //the this keyword can also be used to call other constructors:
        this(studentName, "unassigned");

    }

    // constructor overloaded: 
    public StudentLesson(String studentName, String assignedCohort) {
        name = studentName;
        cohort = assignedCohort; 
    }

    // instance method:
    public String getInfo() {
        return String.format("name: %s, cohort: %s", name, cohort);
    
    }


    public static void main(String[] args) {
        StudentLesson s1 = new StudentLesson("Student A");
        StudentLesson s2 = new StudentLesson("student b", "voyagers");
        
    }



}