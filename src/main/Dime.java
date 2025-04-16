import java.util.Calendar;

public class Dime extends Coin {    

    public Dime() {
        this(Calendar.getInstance().get(Calendar.YEAR));
    }
    
    public Dime(int year) {
        super(
            "Dime", 
            DIME_VALUE, 
            "IN GOD WE TRUST", 
            "E PLURIBUS UNUM", 
            "LIBERTY", 
            "UNITED STATES OF AMERICA", 
            "F_Roosevelt", 
            "Torch_Branches", 
            "ONE DIME", 
            true, 
            new CuproNickel(), 
            year
        );

        Coin.coinCounter.incrementTotalCoins();
        Coin.coinCounter.incrementDime();
        TotalCoins.update();
    }
}
protected Coin imprintFront(Coin c)
{
    c.frontMotto = "IN GOD WE TRUST";
    c.frontLabel = "LIBERTY";
    c.frontImage = "F_Roosevelt";
    return c;
}

protected Coin imprintBack(Coin c)
{
    c.backMotto = "IN GOD WE TRUST";
    c.backLabel = "UNITED STATES OF AMERICA";
    c.backImage = "Torch_Branches";
    return c;
}

protected Coin edge(Coin c)
{
    c.ridgedEdge = true;
    return c;
}