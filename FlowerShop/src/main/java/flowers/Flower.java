package flowers;

import flowers.characteristic.Color;

public class Flower {
    private Color color;
    private int lengthOfTheStem;
    //    private String order;
    private String countrOfOrigin;
    public Float price;

    public Flower(Color color, int lengthOfTheStem, String countrOfOrigin, float price){
        this.color = color;
        this.lengthOfTheStem = lengthOfTheStem;
        this.countrOfOrigin = countrOfOrigin;
        this.price = price;
    }
}

