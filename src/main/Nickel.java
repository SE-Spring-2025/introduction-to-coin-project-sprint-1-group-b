import java.util.Calendar;

public class Nickel extends Coin {

    public Nickel() {
        this(Calendar.getInstance().get(Calendar.YEAR));
    }

    public Nickel(int year) {
        super(
            "Nickel", 
            NICKEL_VALUE, 
            "IN GOD WE TRUST", 
            "E PLURIBUS UNUM", 
            "LIBERTY", 
            "UNITED STATES OF AMERICA", 
            "T_Jefferson", 
            "Jefferson_Memorial",
            "FIVE CENTS", 
            false, 
            new CuproNickel(), 
            year
        );
        Coin.coinCounter.incrementTotalCoins();
        Coin.coinCounter.incrementNickel();
        TotalCoins.update();
    }
}

protected Coin imprintFront(Coin c)
{
    c.frontMotto = "IN GOD WE TRUST";
    c.frontLabel = "LIBERTY";
    c.frontImage = "T_Jefferson";
    return c;
}

protected Coin imprintBack(Coin c)
{
    c.backMotto = "IN GOD WE TRUST";
    c.backLabel = "UNITED STATES OF AMERICA";
    c.backImage = "Jefferson_Memorial";
    return c;
}

protected Coin edge(Coin c)
{
    c.ridgedEdge = false;
    return c;
}

