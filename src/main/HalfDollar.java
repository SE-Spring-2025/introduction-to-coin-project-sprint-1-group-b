import java.util.Calendar;

public class HalfDollar extends Coin {

    public HalfDollar() {
        this(Calendar.getInstance().get(Calendar.YEAR));
    }

    public HalfDollar(int year) {
        super(
<<<<<<< HEAD
            "HalfDollar", 
            HALFDOLLAR_VALUE, 
            "IN GOD WE TRUST", 
            "E PLURIBUS UNUM", 
            "LIBERTY", 
            "UNITED STATES OF AMERICA", 
            "J_Kennedy", 
            "Presidential_Seal", 
            "HALF DOLLAR", 
            true, 
            new CuproNickel(), 
            year
=======
                "HalfDollar",
                HALFDOLLAR_VALUE,
                new CuproNickel()
>>>>>>> 552fbe2 (formatting changes)
        );
        Coin.coinCounter.incrementTotalCoins();
        Coin.coinCounter.incrementHalfDollar();
        TotalCoins.update();
    }
<<<<<<< HEAD
=======

    protected Coin imprintFront(Coin c) {
        c.frontMotto = "IN GOD WE TRUST";
        c.frontLabel = "LIBERTY";
        c.frontImage = "J_Kennedy";
        return c;
    }

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

    protected Coin edge(Coin c) {
        c.ridgedEdge = true;
        return c;
    }
>>>>>>> 552fbe2 (formatting changes)
}
