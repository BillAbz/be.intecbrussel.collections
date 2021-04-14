package Opdracht5_Queue;

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

        Queue<BurgerOrder> orderQueue = new PriorityQueue<>();

        orderQueue.offer(new BurgerOrder("Bill",43));
        orderQueue.offer(new BurgerOrder("Jack",14));
        orderQueue.offer(new BurgerOrder("John",41));
        orderQueue.offer(new BurgerOrder("Bill",24));
        orderQueue.offer(new BurgerOrder("Miki",33));



        BurgerOrder sQ = orderQueue.peek();
        while (sQ != null){
            System.out.println("About to handle " + sQ);
            sQ = orders.poll();
            System.out.println("Handling " + sQ);
            sQ = orders.peek();
        }





    }
}
