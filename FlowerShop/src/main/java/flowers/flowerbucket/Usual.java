package flowers.flowerbucket;

import flowers.Flower;
import flowers.characteristic.Color;

public class Usual extends FlowerBucket{
    public Usual(String type) {
        super(type);
        this.size = 7;

        while (flowers.size() != this.size ) {
            Flower new_flower = new Flower(Color.RED,40,"Germany", (float) 23);
            addFlower(new_flower);
        }
        this.getPrice();
    }

    public void getPrice(){
        float price = 0;
        for (int i = 0; i < this.flowers.size();i++){
            Float new_price = this.flowers.get(i).price;
            price += new_price;
        }
        this.setPrice(Math.round(price));
    }

    public void GenerateFlowerBucket(String flower, Integer number){
    }
}
