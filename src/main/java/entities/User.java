package entities;

public class User {
    private final int id;
    private String name;
    private int age;
    private static int idIncrement = 1;


    @Override
    public String toString() {
        return "Name: " + name + "\tAge: " + age;
    }

    public int getId() {
        return id;
    }

    public User(String name, int age) {
        this.id = idIncrement;
        idIncrement++;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
