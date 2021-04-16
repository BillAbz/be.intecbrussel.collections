package Opdracht2_HashSet;
import java.util.*;

public class appHashSet {

    public static void main(String[] args) {
        Set<Integer> nummerVanGebruiker = new HashSet<>();

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println(nummerVanGebruiker);

//        for (int i=0; i<6; i++){
//            System.out.println("Voer een number tussen 1-45 in voor "+(i+1)+". nummer: ");
//            int nummer = input.nextInt();
//            if (nummer<0 || nummer>46){
//                System.out.println("Voer een number tussen 1-45 in voor "+(i+1)+". nummer: ");
//                nummer = input.nextInt();
//                nummerVanGebruiker.add(nummer);
//                if (nummerVanGebruiker.contains(nummer)) {
//                    System.out.println("Voer verschillende number tussen 1-45 in voor " + (i + 1) + ". nummer: ");
//                    nummer = input.nextInt();
//                    if (nummer < 0 || nummer > 46) {
//                        System.out.println("Voer een number tussen 1-45 in voor " + (i + 1) + ". nummer: ");
//                        nummer = input.nextInt();
//                        nummerVanGebruiker.add(nummer);
//                    } else nummerVanGebruiker.add(nummer);
//                }else nummerVanGebruiker.add(nummer);
//            }else nummerVanGebruiker.add(nummer);
//        }

        while (nummerVanGebruiker.size()<6){
            int i = input.nextInt();
            if (i<46&&i>0){
                nummerVanGebruiker.add(i);
            }else System.out.printf("Voer een number tussen 1-45 in");
        }

        System.out.println(nummerVanGebruiker);



        Set<Integer> willekeurigeGetallen = new HashSet<>();

        while (willekeurigeGetallen.size()<6){
            int i = random.nextInt(45)+1;
            willekeurigeGetallen.add(i);
        }

        System.out.println(willekeurigeGetallen);

        willekeurigeGetallen.retainAll(nummerVanGebruiker);

        System.out.println(willekeurigeGetallen);




    }
}
