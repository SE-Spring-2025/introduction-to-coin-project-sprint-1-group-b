import java.util.Calendar;

public class Quarter extends Coin {
    public Quarter() {
        this(Calendar.getInstance().get(Calendar.YEAR));
    }

    public Quarter(int year) {
        super(
            "Quarter", 
            QUARTER_VALUE, 
            new CuproNickel(),
            year
        );

        Coin.coinCounter.incrementTotalCoins();
        Coin.coinCounter.incrementQuarter();
        TotalCoins.update();
    }

    @Override
    protected Coin imprintFront(Coin c) {
        c.frontMotto = "IN GOD WE TRUST";
        c.frontLabel = "LIBERTY";
        c.frontImage = "G_Washington";
        return c;
    }

    @Override
    protected Coin imprintBack(Coin c) {
        c.backMotto = "IN GOD WE TRUST";
        c.backLabel = "UNITED STATES OF AMERICA";
        c.backImage = "Eagle";
        c.valueDescription = "QUARTER DOLLAR";
        return c;
    }
    
    @Override
    protected Coin edge(Coin c) {
        c.ridgedEdge = false;
        return c;
    }
}
