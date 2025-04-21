import java.util.Calendar;

public class Dime extends Coin {
    public Dime() {
        this(Calendar.getInstance().get(Calendar.YEAR));
    }

    public Dime(int year) {
        super(
            "Dime",
            DIME_VALUE,
            new CuproNickel(),
            year
        );

        Coin.coinCounter.incrementTotalCoins();
        Coin.coinCounter.incrementDime();
        TotalCoins.update();
    }

    @Override
    protected Coin imprintFront(Coin c) {
        c.frontMotto = "IN GOD WE TRUST";
        c.frontLabel = "LIBERTY";
        c.frontImage = "F_Roosevelt";
        return c;
    }

    @Override
    protected Coin imprintBack(Coin c) {
        c.backMotto = "IN GOD WE TRUST";
        c.backLabel = "UNITED STATES OF AMERICA";
        c.backImage = "Torch_Branches";
        c.valueDescription = "ONE DIME";
        return c;
    }

    @Override
    protected Coin edge(Coin c) {
        c.ridgedEdge = true;
        return c;
    }
}