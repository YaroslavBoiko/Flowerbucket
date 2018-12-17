package сlient;

import flowers.flowerbucket.FlowerBucket;
import flowers.flowerbucket.Unusual;

import java.util.Scanner;

public class Client {
    private String name;
    private Integer old;
    private String advantages;
    private Integer countRossie = 0;
    private Integer countTulip = 0;
    private Integer countChamomile = 0;
    public FlowerBucket order;
//    Реалізація декількох букетів

    public Client(){
        System.out.println("Hello!");
        System.out.println("Do you want ready bucket or do something special? (Choose option 'Ready' or 'New')");

        //Визначення типу
        Scanner scan = new Scanner(System.in);
        String new_data = scan.nextLine();
        this.advantages = new_data;

        //Створення букету
        if (this.advantages.equals("Ready")){
            System.out.println("So, please wait a few microseconds .... ");
            this.setOrder(generateFlowerBucket(this.advantages));
            System.out.println("And Voila, your price is " + this.order.price);
        }else if(this.advantages.equals("New")){

            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("Okey, In our store you will find a wide assortment.");
            System.out.println("We have tulips in our shop. They were imported from Hungary.");
            System.out.println("We have tulips in our shop. They were imported from Hungary.");
            System.out.println("Also rose from Holland");
            System.out.println("And what is the most important Ukrainian chamomile");
            System.out.println("So, when you now what exactly you can choose");
            System.out.println("And now, when you know what's in our shop, you can choose something for yourself");
            System.out.println("--------------------------------------------------------------------------------");

            System.out.println("How many Tulips you want? (Please enter integer)");

            Scanner scan1 = new Scanner(System.in);
            Integer n1 = scan.nextInt();
            this.countTulip = n1;

            System.out.println("How many Rossie you want? (Please enter integer)");

            Scanner scan2 = new Scanner(System.in);
            Integer n2 = scan.nextInt();
            this.countRossie = n2;

            System.out.println("How many Chamomile you want? (Please enter integer)");

            Scanner scan3 = new Scanner(System.in);
            Integer n3 = scan.nextInt();
            this.countChamomile = n3;

            this.setOrder(generateFlowerBucket(this.advantages));

            System.out.println("So, your price is " + this.order.price);
        }
    }
    {//        this.name = name;
//        this.old = old;

    }

    private FlowerBucket generateFlowerBucket(String advantages){
        if (this.advantages.equals("Ready")){
            return new FlowerBucket(this.advantages);
        }
        else{
            return new Unusual(this.advantages,this.countRossie, this.countChamomile, this.countTulip);
        }
    }

    public FlowerBucket getOrder() {
        return order;
    }

    private void setOrder(FlowerBucket order) {
        this.order = order;
    }
}
