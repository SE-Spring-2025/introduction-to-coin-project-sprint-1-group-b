import java.util.Calendar;

public class HalfDollar extends Coin {
    
    public HalfDollar() {
        this(Calendar.getInstance().get(Calendar.YEAR));
    }
    
    public HalfDollar(int year) {
        super(
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
        );
        Coin.coinCounter.incrementTotalCoins();
        Coin.coinCounter.incrementHalfDollar();
        TotalCoins.update();
    }
}
