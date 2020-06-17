package validation;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null || name.isEmpty() || name.length()>40){
            throw new IllegalArgumentException("Name input is not valid");
        }
        if (age<0 || age>120){
            throw new IllegalArgumentException("Age has to be between 0-120");
        }

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
