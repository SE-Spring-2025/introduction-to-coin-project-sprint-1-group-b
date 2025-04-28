import java.util.Calendar;

public class HalfDollar extends Coin {
    public HalfDollar() {
        this(Calendar.getInstance().get(Calendar.YEAR));
    }

    public HalfDollar(int year) {
        super(
            "HalfDollar",
            HALFDOLLAR_VALUE,
            new CuproNickel(),
            year
        );

        Coin.coinCounter.incrementTotalCoins();
        Coin.coinCounter.incrementHalfDollar();
        TotalCoins.update();
    }

    @Override
    protected Coin imprintFront(Coin c) {
        c.frontMotto = "IN GOD WE TRUST";
        c.frontLabel = "LIBERTY";
        c.frontImage = "J_Kennedy";
        return c;
    }

    @Override
    protected Coin imprintBack(Coin c) {
        if (!c.flipped) {
            return c;
        }
        c.backMotto = "E PLURIBUS UNUM";
        c.backLabel = "UNITED STATES OF AMERICA";
        c.backImage = "Presidential_Seal";
        c.valueDescription = "HALF DOLLAR";
        return c;
    }

    @Override
    protected Coin edge(Coin c) {
        c.ridgedEdge = true;
        return c;
    }
}
