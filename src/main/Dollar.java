import java.util.Calendar;

public class Dollar extends Coin {
    public Dollar() {
        this(Calendar.getInstance().get(Calendar.YEAR));
    }

    public Dollar(int year) {
        super(
            "Dollar",
            DOLLAR_VALUE,
            new CuproNickel(),
            year
        );

        Coin.coinCounter.incrementTotalCoins();
        Coin.coinCounter.incrementDollar();
        TotalCoins.update();
    }

    @Override
    protected Coin imprintFront(Coin c) {
        c.frontMotto = "IN GOD WE TRUST";
        c.frontLabel = "LIBERTY";
        c.frontImage = "S_Anthony";
        return c;
    }

    @Override
    protected Coin imprintBack(Coin c) {
        if (!c.flipped) {
            return c;
        }
        c.backMotto = "E PLURIBUS UNUM";
        c.backLabel = "UNITED STATES OF AMERICA";
        c.backImage = "Moon_Eagle";
        c.valueDescription = "ONE DOLLAR";
        return c;
    }

    @Override
    protected Coin edge(Coin c) {
        c.ridgedEdge = true;
        return c;
    }
}
