public class SuperHero extends PersonLesson {

    private String alterEgo;

    public SuperHero(String firstName, String lastName, String alterEgo) {
        super(firstName, lastName);
        this.alterEgo = alterEgo;
    }

    public String getName() {
        return alterEgo;
    }

    public String getSecretIdentity() {
        return super.getFirstName();
    }

    public static void main(String[] args) {
        SuperHero superHero1 = new SuperHero("clark", "kent", "superman");

        System.out.print(superHero1.getFirstName() + " ");
        System.out.println(superHero1.getLastName());
        System.out.println("test: ");
        System.out.println(superHero1.getSecretIdentity());
        System.out.println(superHero1.getName());
    }
}
