package Opdracht7_IntrinsiekSorteren;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SorterenApp {
    public static void main(String[] args) {

        SortedSet<Person> personQueue = new TreeSet<>();

        personQueue.add(new Person("Bilal","Abz","male",28,1.75,72));
        personQueue.add(new Person("Bilal","Arr","male",28,1.65,59));
        personQueue.add(new Person("Florian","Keis","male",22,1.85,75));
        personQueue.add(new Person("Yilmaz","Chef","male",33,1.75,76));

        personQueue.forEach(person -> System.out.println(person));

        System.out.println("--------------");

        Set<Person> personSet = new TreeSet<>(new AgeComparator());
        personSet.addAll(personQueue);

        personSet.forEach(person -> System.out.println(person));

        System.out.println("----------------");

        Set<Person> personSetWeight = new TreeSet<>(new WeightComparator());
        personSetWeight.addAll(personQueue);

        personSetWeight.forEach(person -> System.out.println(person));


    }
}
