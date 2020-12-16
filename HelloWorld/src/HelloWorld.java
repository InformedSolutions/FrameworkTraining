public class HelloWorld {

    public static void main(String [] args) {
        System.out.println("Hello World");

        Person p1 = null;
        p1 = new Person("James", 23);
        System.out.println(p1);

        Person p2 = new Person("John Hunt");
        System.out.println(p2);

        Person p3 = new Person();
        p3.setName("Elvis");
        p3.setAge(3);
        p3.getName();
        p3.getAge();
        System.out.println(p3);
    }
}
