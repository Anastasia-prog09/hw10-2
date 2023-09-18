package ua.stokipna.hw10;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toJson() {
        return "{\n" + "\"name\": \"" + name + "\",\n" + "\"age\": \"" + age + "\"\n}";
    }
}
