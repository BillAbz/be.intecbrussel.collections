package Opdracht1_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // OPDRACHT VOOR NUMMER---------------

//        System.out.println("Voer drie nummer in= ");
//        int number1 = input.nextInt();
//        int number2 = input.nextInt();
//        int number3 = input.nextInt();
//
//
//
////        List<Integer> numbers = new ArrayList<>();
////        numbers.add(number1);
////        numbers.add(number2);
////        numbers.add(number3);
//
//        List<Integer> numbersLinked = new LinkedList<>();
//        numbersLinked.add(number1);
//        numbersLinked.add(number2);
//        numbersLinked.add(number3);
//
//        System.out.println(numbersLinked);
//
//        int som = 0;
//        for (int i : numbersLinked){
//            som += i;
//        }
//        System.out.println("Som= "+som);
//        double gemiddel = (double) som/numbersLinked.size();
//        System.out.println("Gemiddeld= "+gemiddel);


        // OPDRACHT VOOR STRING -------------------------


//        System.out.println("Voer een zin in die afgesloten met een punt. ");
        String string = "";

        ArrayList<String> strings = new ArrayList<>();


        do{
            System.out.println("Voer een zin in die afgesloten met een punt. ");
            string = input.nextLine();

        }while ( !string.contains("."));

        strings.add(string);



//        String omgekeer = "";
//
//        for (int i=string.length(); i<0; i--){
//            omgekeer += strings[i]);
//        }
//        System.out.println(omgekeer);

        String[] split = strings.get(0).split(" ");
        for (int i=0; i<split.length; i++){
            strings.add(split[i]);
        }
        strings.remove(0);
        System.out.println(strings);


        System.out.println(strings.size());






    }
}
