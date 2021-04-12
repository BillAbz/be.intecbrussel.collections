package Opdracht2_HashSet;

import java.util.HashSet;
import java.util.Set;

public class personApp extends Person{
    public static void main(String[] args) {
        Set<Person> persons = new HashSet<>();

        Person bill = new Person("Bill", 24, 62.2);
        Person bill2 = new Person("Bill",24,62.2);

        persons.add(bill);
        persons.add(bill2);

        persons.forEach(person -> {
            System.out.println(person);
        });


    }
}
