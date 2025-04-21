import java.util.Calendar;

public class Penny extends Coin {
    public Penny() {
        this(Calendar.getInstance().get(Calendar.YEAR));
    }

    public Penny(int year) {
        super(
            "Penny",
            PENNY_VALUE,
            new Copper(),
            year
        );

        Coin.coinCounter.incrementTotalCoins();
        Coin.coinCounter.incrementPenny();
        TotalCoins.update();
    }

    @Override
    protected Coin imprintFront(Coin c) {
        c.frontMotto = "IN GOD WE TRUST";
        c.frontLabel = "LIBERTY";
        c.frontImage = "A_Lincoln";
        return c;
    }

    @Override
    protected Coin imprintBack(Coin c) {
        c.backMotto = "IN GOD WE TRUST";
        c.backLabel = "UNITED STATES OF AMERICA";
        c.backImage = "Lincoln_Memorial";
        c.valueDescription = "ONE CENT";
        return c;
    }

    @Override
    protected Coin edge(Coin c) {
        c.ridgedEdge = false;
        return c;
    }
}
