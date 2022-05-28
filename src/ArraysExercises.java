import java.util.Arrays;

public class ArraysExercises {

    public static String addPerson(Person[] persons, Person person) {
        Arrays.copyOf(persons, persons.length + 2);
        persons[persons.length-1] = person;
        return Arrays.toString(persons);

    }

    public static void main(String[] args) {
        int[] test={1,2,4};
        int[] numbers={1,2,3,4,5};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        Person victor = new Person();
        Person vic = new Person();
        Person v = new Person();
        victor.setName("victor");
        vic.setName("vic");
        v.setName("v");
        Person vktr = new Person();
        vktr.setName("vktr");

        Person[] persons = {victor, vic, v};
        addPerson(persons,vktr);
        for(Person person: persons) {
            System.out.println(person.getName());
        }
    }
}
