package Opdracht12_TreeMap;

import Opdracht7_IntrinsiekSorteren.Person;
import Opdracht7_IntrinsiekSorteren.SorterenApp;

import java.util.*;

public class TreeMapApp {
    public static void main(String[] args) {
        Set<Person> personQueue = new TreeSet<>();

        personQueue.add(new Person("Bilal","Abz","male",28,1.75,72));
        personQueue.add(new Person("Bilal","Arr","male",28,1.65,59));
        personQueue.add(new Person("Florian","Keis","male",22,1.85,75));
        personQueue.add(new Person("Yilmaz","Chef","male",33,1.75,76));

        NavigableMap<String, Person> stringPersonMap = new TreeMap<>();

        personQueue.forEach(person -> stringPersonMap.put(person.getLastName()+ " "+person.getFirstName(), person));


        for (String fullName: stringPersonMap.keySet()){
            System.out.println("Key: "+fullName);
            System.out.println(stringPersonMap.get(fullName));
        }

        System.out.println(stringPersonMap.get("Abz Bilal"));
        System.out.println(stringPersonMap.firstEntry());
        System.out.println(stringPersonMap.lastEntry());





    }
}
