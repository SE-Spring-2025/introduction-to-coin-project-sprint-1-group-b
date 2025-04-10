import java.util.Calendar;

public class Penny extends Coin {
    
    public Penny() {
        this(Calendar.getInstance().get(Calendar.YEAR));
    }
    
    public Penny(int year) {
        super(
            "Penny", 
            PENNY_VALUE, 
            "IN GOD WE TRUST", 
            "E PLURIBUS UNUM", 
            "LIBERTY", 
            "UNITED STATES OF AMERICA", 
            "A_Lincoln", 
            "Lincoln_Memorial", 
            "ONE CENT", 
            false, 
            new Copper(), 
            year
        );
    }
}

