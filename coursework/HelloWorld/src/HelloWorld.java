public class HelloWorld {
    public static void main(String [] args) {
        System.out.println("Hello World");
        Person p1 = null;
        p1 = new Person("John",56);
        System.out.println(p1);
        p1.birthday();

        Person p2 = new Person("Denise");
        System.out.println(p2);
        p2.birthday();

        Person p3 = new Person();
        p3.setName("Phoebe");
        System.out.println(p3);
        p3.birthday();

    }

}
