package Opdracht8_EenmaligSorteren;

import Opdracht7_IntrinsiekSorteren.AgeComparator;
import Opdracht7_IntrinsiekSorteren.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortApp {


    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Bilal","Abz","male",28,1.75,72));
        personList.add(new Person("Bilal","Arr","male",28,1.65,59));
        personList.add(new Person("Florian","Keis","male",22,1.85,75));
        personList.add(new Person("Yilmaz","Chef","male",33,1.75,76));


        personList.sort(Comparator.reverseOrder());

        personList.forEach(person -> System.out.println(person));

        System.out.println("------------");

        personList.sort(Comparator.comparingDouble(Person::getWeight));

        personList.forEach(person -> System.out.println(person));





    }

}
