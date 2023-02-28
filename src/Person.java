public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;


    public Person() {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
        if (age != 0){
            return true;
        } else {
            return false;
        }
    }
    public boolean hasAddress() {
        if (address.isEmpty()){
            return false;
        } else {
            return true;
        }
    }

    public String getName() {
        return surname;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void happyBirthday() { /*...*/ }

    @Override
    public String toString() {
        return name + " " + surname + " " + age + " " + address;
    }

    @Override
    public int hashCode() {

    }

    public PersonBuilder newChildBuilder() { /*...*/ }
}
