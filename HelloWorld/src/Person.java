public class Person {

    private int age;
    private String name;

    public Person() {}

    public Person(String name) {
        this(name, 56);
    }

    public Person(String name, int age ) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person(" + "Name:" + name + ", age:" + age + ")";
    }
}

