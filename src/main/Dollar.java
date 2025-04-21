import java.util.Calendar;

public class Dollar extends Coin {

    public Dollar() {
        this(Calendar.getInstance().get(Calendar.YEAR));
    }

    public Dollar(int year) {
        super(
<<<<<<< HEAD
            "Dollar", 
            DOLLAR_VALUE, 
            "IN GOD WE TRUST", 
            "E PLURIBUS UNUM", 
            "LIBERTY", 
            "UNITED STATES OF AMERICA", 
            "S_Anthony", 
            "Moon_Eagle", 
            "ONE DOLLAR", 
            true, 
            new CuproNickel(), 
            year
=======
                "Dollar",
                DOLLAR_VALUE,
                new CuproNickel()
>>>>>>> 552fbe2 (formatting changes)
        );
        Coin.coinCounter.incrementTotalCoins();
        Coin.coinCounter.incrementDollar();
        TotalCoins.update();
    }
<<<<<<< HEAD
}
=======

    protected Coin imprintFront(Coin c) {
        c.frontMotto = "IN GOD WE TRUST";
        c.frontLabel = "LIBERTY";
        c.frontImage = "S_Anthony";
        return c;
    }

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

    protected Coin edge(Coin c) {
        c.ridgedEdge = true;
        return c;
    }
}
>>>>>>> 552fbe2 (formatting changes)
