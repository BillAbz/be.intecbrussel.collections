package Opdracht11_Map;

import java.util.*;
import java.math.*;

public class MapApp {
    public static void main(String[] args) {
        Map<Coin, Integer> coins = new LinkedHashMap<>();

        coins.put(Coin.TENCENT,38);
        coins.put(Coin.FIVECENT,14);
        coins.put(Coin.TWOCENT, 8);
        coins.put(Coin.ONECENT, 11);
        coins.put(Coin.FIVECENT,23);


        coins.keySet().forEach(coin -> System.out.println(coin));
        coins.forEach((integer, coin) -> System.out.println(integer +" "+ coin));
        System.out.println("---------");

        coins.keySet().stream()
                .sorted()
                .forEach(coin -> System.out.println(coin + " " + coins.get(coin)));


        double money = 0;
        for (Coin coin : coins.keySet()){

            System.out.println("For this coin: "+coin.name()+" I have "+coins.get(coin)+" pieces.");
            money+= coins.get(coin)*coin.getV();
        }

        System.out.println("I have $ "+money);
    }
}
