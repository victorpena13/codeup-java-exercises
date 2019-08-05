import java.util.Arrays;

public class ArraysExercises {


    static public void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));


        Person[] people = {new Person("Josh"), new Person("pippa"), new Person("SpongeBob")};
        for(Person character : people) {
            System.out.println(character.getName());
    }


}
}
