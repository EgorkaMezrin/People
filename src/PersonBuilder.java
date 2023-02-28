public class PersonBuilder {


    private String name;
    PersonBuilder pBuilder = new PersonBuilder();
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return pBuilder;
    }
    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return pBuilder;

    }
    public PersonBuilder setAge(int age) {
        this.age = age;
        return pBuilder;
    }
    public PersonBuilder setAddress(String address) {
        this.address = address;
        return pBuilder;
    }

    public Person build() {
        Person nPerson = new Person();
        return nPerson;
    }
}
