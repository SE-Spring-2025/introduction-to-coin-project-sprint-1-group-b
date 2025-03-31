import java.util.Calendar;

public class Nickel extends Coin {

    public Nickel() {
        this(Calendar.getInstance().get(Calendar.YEAR));
    }
    
    public Nickel(int year) {
        super(NICKEL_VALUE, year);
    }
}
