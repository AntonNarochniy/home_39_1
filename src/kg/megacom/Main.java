package kg.megacom;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        Ticket babkaTicket = new Ticket(100, false);
        Ticket dedTicket = new Ticket(100, false);
        Ticket muzhikTicket = new Ticket(200, false);
        Ticket tetkaTicket = new Ticket(300, false);
        Ticket pocikTicket = new Ticket(400, true);
        Ticket progerTicket = new Ticket(500, true);
        Ticket japarovTicket = new Ticket(1000, true);


        Comparator<Ticket> comparatorVIP = new Comparator<>() {
            @Override
            public int compare(Ticket o1, Ticket o2) {
                if (o1.isVIP() && !o2.isVIP()) {
                    return -1;
                } else if (o2.isVIP() && !o1.isVIP()) {
                    return 1;
                } else return 0;
            }


        };
        Comparator<Ticket> comparatorCost = new Comparator<>() {
            @Override
            public int compare(Ticket o1, Ticket o2) {
                if (o1.getCost() > o2.getCost()) {
                    return -1;
                } else if (o2.getCost() > o1.getCost()) {
                    return 1;
                } else return 0;
            }
        };
        PriorityQueue<Ticket> queueVIP = new PriorityQueue<>(comparatorVIP);
        PriorityQueue<Ticket> queueCost = new PriorityQueue<>(comparatorCost);
        queueCost.add(japarovTicket);
        queueCost.add(pocikTicket);
        queueCost.add(dedTicket);
        queueCost.add(babkaTicket);
        queueCost.add(muzhikTicket);
        queueCost.add(tetkaTicket);
        queueCost.add(progerTicket);
        queueVIP.add(japarovTicket);
        queueVIP.add(pocikTicket);
        queueVIP.add(dedTicket);
        queueVIP.add(babkaTicket);
        queueVIP.add(muzhikTicket);
        queueVIP.add(tetkaTicket);
        queueVIP.add(progerTicket);

        while (!queueCost.isEmpty()){
            System.out.println(queueCost.poll().toString());
        }

        System.out.println("---------------------------------------------------");

        while (!queueVIP.isEmpty()){
            System.out.println(queueVIP.poll().toString());
        }






    }
}
