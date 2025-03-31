import java.util.Calendar;

public class Penny extends Coin {
    
    public Penny() {
        this(Calendar.getInstance().get(Calendar.YEAR));
    }
    
    public Penny(int year) {
        super(PENNY_VALUE, year);
    }
}

