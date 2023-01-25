public class PersonLesson {

    // class - is used t o define a custom type in java. blue print for objects to be created on it. 
    // field - variable or method that belongs to an object or a class. 
    // object - is an instance of a class 
    //        - have field and methods, and are instantiated, created with the new keyword.

    //static variable: 
    public static long worldPopulation = 7_500_000_000L;
    //instance variables:
    public String firstName; 
    public String lastName;

        //Constructor: 
    // - a special method that is called when an object is being created. 
    // - has same name as the class and does not define a return type.  
    // - constructors, like any other method, can accept arguments and be over loaded. 

    public PersonLesson() {

        System.out.println("A person is being created! ");

    }

    //overloaded constructor:
    public PersonLesson(String firstname, String lastname) {
        // 'this' keyword provides us a way to refer to the current instnace. 'this object'.
        // can only use inside of an instance method. 
        // in this example: the constructor, the this keyword lets unambiuously refer to the name field of the person object that is being created, even though we already have a variable named name in scope.
        // the this keyword can also be used to call other constructors. 
        this.firstName = firstname;
        this.lastName = lastname;
    }

    
    //instance methods: 
    public String sayHello() {
        return String.format("hello from %s %s!", firstName, lastName);
    }
    // sayHello method referenes instance variables had we defined those same field in method it would refernce variables and not the fields

    public static void main(String[] args) {

        PersonLesson rick = new PersonLesson();
        rick.firstName = "rick";
        rick.lastName = "sanchez";
        System.out.println(rick.sayHello());

        //static vs instance: 

        PersonLesson ada = new PersonLesson();
        ada.firstName = "ada";
        ada.lastName = "lovelace";

        PersonLesson grace = new PersonLesson();
        grace.firstName = "grace";
        grace.lastName = "hopper";

        System.out.println(ada.sayHello());
        System.out.println(grace.sayHello());

        // each instance of the personLesson class has differnet value 
        // for each of the firstName and lastName fields, but  both have fields firstName and LastName

        //static fields, those that belong to a class as
        // a whole. static fields area accessible through the class itself. in other words they are 
        // accessible without creating an instance of the class

        //instance example: 

        System.out.println(Math.PI);
        // no code that instantiates 
        // static fields are defined with the static keyword, 
        // static fields should not be anything that is supposed to be nuique to instances of the class.  
        // should contain info that all insatnces will use, or methods and fields that are meant to be accessed only statically.  

    }
}