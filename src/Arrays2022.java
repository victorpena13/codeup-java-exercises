import java.util.Arrays;
public class Arrays2022 {

    public static void addPerson(Person[] list, Person person) {
        list = Arrays.copyOf(list, list.length+1);
        list[list.length-1] = person;
        for(int i = 0; i < list.length; i++) {
            System.out.println(list[i].getName());

        }
    }

    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        Person[] persons;
        persons = new Person[3];

        persons[0] = new Person();
        persons[1] = new Person();
        persons[2] = new Person();

        persons[0].setName("john");
        persons[1].setName("jacob");
        persons[2].setName("smith");


        for(Person person: persons) {
            System.out.println(person.getName());
        }

        Person victor = new Person();
        victor.setName("victor");

        addPerson(persons, victor);



    }
}
