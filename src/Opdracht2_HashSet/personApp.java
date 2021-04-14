package Opdracht2_HashSet;

import java.util.HashSet;
import java.util.Set;

public class personApp {

    public static void main(String[] args) {
        Set<Person> persons = new HashSet<>();

        persons.add(new Person("Bill", 24, 62.2));
        persons.add(new Person("Erik", 22, 62.2));
        persons.add(new Person("Bill", 24, 62.2));
        persons.add(new Person("John", 45, 66));

        persons.forEach(person -> {
            System.out.println(person);
        });


    }
}
