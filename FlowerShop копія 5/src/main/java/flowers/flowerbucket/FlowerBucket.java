package flowers.flowerbucket;

import flowers.Flower;
import flowers.characteristic.Color;

import java.util.ArrayList;

public class FlowerBucket {
    private String type;
    public Integer size;
    public Float price;
    public ArrayList<Flower> flowers = new ArrayList <>();

    public FlowerBucket(String type){

            this.size = new Integer(7);

            while (flowers.size() != this.size ) {
                Flower new_flower = new Flower(Color.RED,40,"Germany", (float) 23);
                addFlower(new_flower);
            }
            this.getPrice();
    }
    public void addFlower(Flower fl){
        flowers.add(fl);
    }

    public void getPrice(){
        float price = 0;
        for (int i = 0; i < this.flowers.size();i++){
            Float new_price = this.flowers.get(i).price;
            price += new_price;
        }
        this.setPrice(Math.round(price));
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
