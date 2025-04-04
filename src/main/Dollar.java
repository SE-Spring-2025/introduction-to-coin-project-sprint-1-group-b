import java.util.Calendar;

public class Dollar extends Coin {

    public Dollar() {
        this(Calendar.getInstance().get(Calendar.YEAR));
    }
    
    public Dollar(int year) {
        super(
            "Dollar", 
            DIME_VALUE, 
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
        );
    }
}