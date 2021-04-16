package Opdracht10_CollectionsEnStream;

import Opdracht7_IntrinsiekSorteren.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) {
        List<Person> streamList = new ArrayList<>();

        streamList.add(new Person("John","male",34));
        streamList.add(new Person("Marie","female",20));
        streamList.add(new Person("Jack","male",21));
        streamList.add(new Person("Alpha","male",18));
        streamList.add(new Person("Angel","female",33));
        streamList.add(new Person("Alexandra","female",23));
        streamList.add(new Person("Bill","male",30));
        streamList.add(new Person("Elie","female",19));

        List<Person> personList = streamList.stream()
                                            .filter(person -> person.getGender().contains("female"))
                                            .filter(person -> person.getAge()>20)
                                            .sorted()
                                            .collect(Collectors.toList());

        personList.forEach(person -> System.out.println(person));

    }
}
