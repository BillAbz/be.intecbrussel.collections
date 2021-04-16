package Opdracht5_Queue;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queueApp {
    public static void main(String[] args) {
        Queue<BurgerOrder> orders = new LinkedList<>();

        orders.offer(new BurgerOrder("Bill",43));
        orders.offer(new BurgerOrder("Jack",14));
        orders.offer(new BurgerOrder("John",41));
        orders.offer(new BurgerOrder("Bill",24));
        orders.offer(new BurgerOrder("Miki",33));

        BurgerOrder s = orders.peek();
        while (s != null){
            System.out.println("About to handle " + s);
            s = orders.poll();
            System.out.println("Handling " + s);
            s = orders.peek();
        }

        System.out.println("---------------------------");

        Comparator<BurgerOrder> burgerOrderComparator = (BurgerOrder b1, BurgerOrder b2) -> b1.getNumber() - b2.getNumber();
        Queue<BurgerOrder> orderQueue = new PriorityQueue<>(Comparator.comparingInt(BurgerOrder::getNumber).thenComparing(BurgerOrder::getName));

        orderQueue.offer(new BurgerOrder("Beef",43));
        orderQueue.offer(new BurgerOrder("Chicken",14));
        orderQueue.offer(new BurgerOrder("Vegie",41));
        orderQueue.offer(new BurgerOrder("Fish",24));
        orderQueue.offer(new BurgerOrder("Cheesy",33));
        orderQueue.offer(new BurgerOrder("Beef And Cheesy",15));



//        BurgerOrder sQ = orderQueue.peek();
//        while (sQ != null){
//            System.out.println("About to handle " + sQ);
//            sQ = orders.poll();
//            System.out.println("Handling " + sQ);
//            sQ = orders.peek();
//        }
//        System.out.println("   ");

        orderQueue.forEach(burgerOrder -> System.out.println(burgerOrder));





    }
}
