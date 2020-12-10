public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hey World, how ya doing?");

        Person p1 = new Person("Frank", 37);
        System.out.println(p1);
        System.out.printf("Hey %s, how ya doing now that you're %d?\n", p1.getName(), p1.getAge());

        Person p2 = new Person("Fred");
        System.out.println(p2);

        Person p3 = new Person();
        p3.setName("Froggy");
        System.out.println(p3);

        while(p3.getAge() < 18) {
            p3.birthday();
        }
    }
}
