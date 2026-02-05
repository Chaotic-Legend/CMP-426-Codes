// CMP 426: Operating Systems - Homework 0 - Isaac D. Hoyos

// The Person class represents a person with basic identifying information.
public class Person {
    private String name;
    private int age;
    private String ssn;
    private String address;

    // This constructor initializes all fields to default values.
    public Person() {
        this.name = "";
        this.age = 0;
        this.ssn = "";
        this.address = "";
    }

    // This constructor initializes all fields using provided values.
    public Person(String name, int age, String ssn, String address) {
        this.name = name;
        this.age = age;
        this.ssn = ssn;
        this.address = address;
    }

    // This method returns the person's name.
    public String getName() {
        return name;
    }

    // This method sets the person's name.
    public void setName(String name) {
        this.name = name;
    }

    // This method returns the person's age.
    public int getAge() {
        return age;
    }

    // This method sets the person's age.
    public void setAge(int age) {
        this.age = age;
    }

    // This method returns the person's social security number.
    public String getSsn() {
        return ssn;
    }

    // This method sets the person's social security number.
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    // This method returns the person's address.
    public String getAddress() {
        return address;
    }

    // This method sets the person's address.
    public void setAddress(String address) {
        this.address = address;
    }
}
