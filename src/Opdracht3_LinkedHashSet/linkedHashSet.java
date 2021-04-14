package Opdracht3_LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.*;
import java.util.Set;

public class linkedHashSet {

    public static void main(String[] args) {
        Set<Integer> nummerVanGebruiker = new LinkedHashSet<>();

        Scanner input = new Scanner(System.in);

        System.out.println(nummerVanGebruiker);

        for (int i=0; i<6; i++){
            System.out.println("Voer een number tussen 1-45 in voor "+(i+1)+". nummer: ");
            int nummer = input.nextInt();
            if (nummer<0 || nummer>46){
                System.out.println("Voer een number tussen 1-45 in voor "+(i+1)+". nummer: ");
                nummer = input.nextInt();
                nummerVanGebruiker.add(nummer);
                if (nummerVanGebruiker.contains(nummer)) {
                    System.out.println("Voer verschillende number tussen 1-45 in voor " + (i + 1) + ". nummer: ");
                    nummer = input.nextInt();
                    if (nummer < 0 || nummer > 46) {
                        System.out.println("Voer een number tussen 1-45 in voor " + (i + 1) + ". nummer: ");
                        nummer = input.nextInt();
                        nummerVanGebruiker.add(nummer);
                    } else nummerVanGebruiker.add(nummer);
                }else nummerVanGebruiker.add(nummer);
            }else nummerVanGebruiker.add(nummer);
        }
        nummerVanGebruiker.forEach( getal -> System.out.println(getal));
    }

}
