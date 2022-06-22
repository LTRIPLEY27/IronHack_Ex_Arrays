import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private String mail;

    public Person(String name, int age){
        setName(name);
        this.age = age; // Porqué únicamente declara el Name con setter y no el age
        mail = this.name
                .replace("_", ".")
                .concat("@ironhack.com");
    }

    private Person(){

    }

    public String getName() {
        return name.replace("_", " ");
    }

    public int getAge() {
        return age;
    }

    public String getMail() {
        return mail;
    }

    public void setName(String name) {
        this.name = name.toLowerCase().trim().replace(" ", "_");
    }

    public void setAge(int age) {
        this.age = age;
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
        if(this == o) return true; // if they are literally the same with a boolean comparator
        if(o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o; // DECLARACIÓN DE INSTANCIA Y CASTEO DEL OBJETO
        return age == person.age; // CREACIÓN DE LA INSTANCIA PERSON Y COMPARACIÓN CON EL OBJETO ENVIADO POR PARÁMTROS SEGÚN EL ATRIBUTO EDAD
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, age, mail);
    }
}
