import java.util.Calendar;

public class Dime extends Coin {    

    public Dime() {
        this(Calendar.getInstance().get(Calendar.YEAR));
    }
    
    public Dime(int year) {
        super(DIME_VALUE, year);
    }
}
