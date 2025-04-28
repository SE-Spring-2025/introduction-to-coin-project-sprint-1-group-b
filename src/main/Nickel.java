import java.util.Calendar;

public class Nickel extends Coin {
    public Nickel() {
        this(Calendar.getInstance().get(Calendar.YEAR));
    }

    public Nickel(int year) {
        super(
            "Nickel",
            NICKEL_VALUE,
            new CuproNickel(),
            year
        );

        Coin.coinCounter.incrementTotalCoins();
        Coin.coinCounter.incrementNickel();
        TotalCoins.update();
    }

    @Override
    protected Coin imprintFront(Coin c) {
        c.frontMotto = "IN GOD WE TRUST";
        c.frontLabel = "LIBERTY";
        c.frontImage = "T_Jefferson";
        return c;
    }

    @Override
    protected Coin imprintBack(Coin c) {
        c.backMotto = "IN GOD WE TRUST";
        c.backLabel = "UNITED STATES OF AMERICA";
        c.backImage = "Jefferson_Memorial";
        c.valueDescription = "FIVE CENTS";
        return c;
    }

    @Override
    protected Coin edge(Coin c) {
        c.ridgedEdge = false;
        return c;
    }
}
