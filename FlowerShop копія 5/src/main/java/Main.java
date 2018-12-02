import сlient.Client;

public class Main {
    public static void main(String[] args) {
        Client Jack  = new Client("Jack",18,"ReadyBucket",0,0,0);
        System.out.printf("Dear Jack, we have already prepared  order for you.The bouquet costs %s%n", Jack.order.price);
        Client Melania = new Client("Melania",21,"NewBucket",3, 3, 3);
        System.out.printf("Dear Melanie, we have already prepared special order for you.The special bouquet costs %s%n", Melania.order.price);
    }

}
