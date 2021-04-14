package Opdracht7_IntrinsiekSorteren;

import java.util.Objects;


public class Person implements Comparable<Person>{
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private double weight;
    private double height;


    public Person(String firstName, String lastName, String gender, int age,  double height,double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Opdracht2_HashSet.Person)) return false;
        Opdracht2_HashSet.Person person = (Opdracht2_HashSet.Person) o;
        return getAge() == person.getAge() && Double.compare(person.getWeight(), getWeight()) == 0 && getFirstName().equals(person.getFirstName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getAge(), getWeight());
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return -(this.lastName.compareTo(o.getLastName()));
    }
}
