package ObjecSuperclass;


/**
 * Purpose is to retrieve the runtime class of an object
 * <li>Cant be overriden<li/>
 */
public class GetClassDemo {
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println(person.getClass());
        Object o = "Hello there";
        System.out.println(o.getClass());
//        Reference Type (Object o): This determines what methods can be called at compile time.
//        Runtime Type (String): This is the actual type of the object stored in memory.
//        Since "Hello there" is a String, its runtime type is String, even though the reference is Object.
//        Class  personClass = person.getClass();
//        System.out.println(personClass.getName());
//        System.out.println(personClass.getClass());
//        System.out.println(personClass.getClasses());
//        System.out.println(personClass.getPackageName());


    }
}

class Person {
}
