package flowers.type;

import flowers.Flower;
import flowers.characteristic.Color;

public class Rosie extends Flower {
    private boolean presenceofthorns;

    public Rosie(Color color, int lengthOfTheStem, String countrOfOrigin, Float price, boolean presenceofthorns) {
        super(color, lengthOfTheStem,countrOfOrigin, price);
        this.presenceofthorns = presenceofthorns;
    }
}
