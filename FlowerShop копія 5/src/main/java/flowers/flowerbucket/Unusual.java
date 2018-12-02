package flowers.flowerbucket;


import flowers.characteristic.Color;
import flowers.type.Chamomile;
import flowers.type.Rosie;
import flowers.type.Tulip;

public class Unusual extends FlowerBucket {
    Integer countRossie;
    Integer countTulip;
    Integer countChamomile;

    public Unusual(String type,  Integer countRossie, Integer countTulip, Integer countChamomile) {
        super(type);
        this.countChamomile = countChamomile;
        this.countTulip = countTulip;
        this.countRossie = countRossie;
        this.size = this.countChamomile + this.countTulip + this.countRossie;

        for (int i = 0; i <= this.countRossie; i++) {
            Rosie rosie = new Rosie(Color.RED, 40, "Holland", (float)23.50, true);
            addFlower(rosie);
        }
        for (int i = 0; i <= this.countTulip; i++) {
            Tulip tulip = new Tulip(Color.BLUE, 40, "Hungary", (float) 22.45);
            addFlower(tulip);
        }
        for (int i = 0; i <= this.countTulip; i++) {
            Chamomile chamomile = new Chamomile(Color.YELLOW, 39, "Ukraine", (float) 18.0);
            addFlower(chamomile);
        }
        this.getPrice();
        }

    }

