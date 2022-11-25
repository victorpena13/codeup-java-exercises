public class Creature {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("hello " + getName());
    }

    public static void main(String[] args) {

        Creature creature1 = new Creature();
        creature1.setName("john");
        creature1.sayHello();

        Creature creature2 = new Creature();
        creature2.setName("john");
        System.out.println(creature1.getName().equals(creature2.getName())); //true
        System.out.println(creature1 == creature2); //false

        Creature creature3 = creature1;

        System.out.println(creature1 == creature3); // true


    }

}


