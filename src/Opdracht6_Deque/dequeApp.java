package Opdracht6_Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class dequeApp {
    public static void main(String[] args) {

        Deque<Person> personDeque = new ArrayDeque<>();

        personDeque.addFirst(new Person("John","male"));
        personDeque.addLast(new Person("Marie","female"));
        personDeque.addFirst(new Person("Jack","male"));
        personDeque.addFirst(new Person("Alpha","male"));
        personDeque.addLast(new Person("Angel","female"));
        personDeque.addLast(new Person("Alexandra","female"));
        personDeque.addFirst(new Person("Bill","male"));
        personDeque.addLast(new Person("Elie","female"));

        personDeque.forEach(person -> System.out.println(person));

        System.out.println("----------");

        Person mariedMan = personDeque.pollFirst();
        Person mariedWomen = personDeque.pollLast();
        while (mariedMan != null){
            System.out.println("Get maried "+mariedWomen.getName()+" and "+mariedMan.getName());
            mariedMan = personDeque.pollFirst();
            mariedWomen = personDeque.pollLast();
        }


    }
}
