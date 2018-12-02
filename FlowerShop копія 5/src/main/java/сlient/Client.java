package сlient;

import flowers.flowerbucket.FlowerBucket;
import flowers.flowerbucket.Unusual;
import flowers.flowerbucket.Usual;

public class Client {
    private String name;
    private Integer old;
    private String advantages;
    private Integer countRossie = 0;
    private Integer countTulip = 0;
    private Integer countChamomile = 0;
    public FlowerBucket order;

    public Client(String name, Integer old, String advantages, Integer countRossie, Integer countTulip, Integer countChamomile){
        this.name = name;
        this.old = old;
        this.advantages = advantages;
        this.countRossie = countRossie;
        this.countChamomile = countChamomile;
        this.countTulip = countTulip;
        this.setOrder(generateFlowerBucket(this.advantages));
    }

    private FlowerBucket generateFlowerBucket(String advantages){
        if (this.advantages.equals("ReadyBucket")){
            return new Usual(this.advantages);}
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
