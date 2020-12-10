/* This is a class Person with a
 @author Austen Wells
 */

public class Person {

    // Instance Variables
    private int age;
    private String name;

    public Person() {
        //System.out.println("Person()");
    }

    public Person(String name) {
        this(name,18);
        //System.out.printf("Person(" + name +")");
    }

    public Person(String name, int age) {
        //System.out.printf("Person(%s, %d)\n", name, age);
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person(" + name + ", " + age + ")";
    }

    public void birthday() {
        int oldAge = age;
        age = age + 1; // this.age++;
        System.out.println("Happy Birthday you were " +
                oldAge + " you are now " + age);
    }
}