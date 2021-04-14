package Opdracht4_DeTreeSet;

import java.util.NavigableSet;
import java.util.Scanner;
import java.util.*;
import java.util.TreeSet;

public class deTreeSet {
    public static void main(String[] args) {
        NavigableSet<String> getallen = new TreeSet<>();

        Scanner keyboard = new Scanner(System.in);

        for (int i=0; i<4 ; i++){
            System.out.println("Voer een woord in");
            String input = keyboard.next();

            getallen.add(input);
        }

        getallen.forEach(s -> System.out.println(s));

        System.out.println("------------");

        System.out.println(getallen.first());
        System.out.println("------------");

        System.out.println(getallen.last());


    }
}
