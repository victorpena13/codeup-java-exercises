import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

        int[] numbers={1,2,3,4,5};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        Person victor = new Person();
        Person vic = new Person();
        Person v = new Person();
        victor.setName("victor");
        vic.setName("vic");
        v.setName("v");

        Person[] persons = {victor, vic, v};
        for(Person person: persons) {
            System.out.println(person.getName());
        }



    }
}
