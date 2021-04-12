package Opdracht2_HashSet;
import java.util.*;

public class appHashSet {

    public static void main(String[] args) {
        Set<Integer> nummerVanGebruiker = new HashSet<>();

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
        System.out.println(nummerVanGebruiker);



        Set<Integer> willekeurigeGetallen = new HashSet<>();

        willekeurigeGetallen.add(12);
        willekeurigeGetallen.add(42);
        willekeurigeGetallen.add(23);
        willekeurigeGetallen.add(14);
        willekeurigeGetallen.add(6);
        willekeurigeGetallen.add(33);

        System.out.println(willekeurigeGetallen);

        willekeurigeGetallen.retainAll(nummerVanGebruiker);

        System.out.println(willekeurigeGetallen);




    }
}
