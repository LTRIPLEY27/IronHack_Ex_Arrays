import java.util.Objects;

public class Person {

    private String name;
    private int age;

    private String mail;


    public Person(String name, int age) {
        setName(name);
        this.age = age;
        mail = this.name
                .replace("_", ".")
                .concat("@ironhack.com");
    }

    private Person(){

    }



    public String getName() {
        return name.replace("_", " ");
    }

    public void setName(String name) {
        this.name = name.toLowerCase().trim().replace(" ", "_");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mail='" + mail + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // if they are literally the same
        if (o == null  || getClass() != o.getClass()) return false; // if the other object doesnt exist or they are different classes
        Person person = (Person) o;
        return age == person.age; // if they have the same attribute;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, mail);
    }
}
