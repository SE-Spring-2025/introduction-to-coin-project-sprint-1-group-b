import java.util.Calendar;

public class HalfDollar extends Coin {
    
    public HalfDollar() {
        this(Calendar.getInstance().get(Calendar.YEAR));
    }
    
    public HalfDollar(int year) {
        super(HALFDOLLAR_VALUE, year);
    }
}
