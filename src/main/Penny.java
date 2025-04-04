import java.util.Calendar;

public class Penny extends Coin {
    
    public Penny() {
        this(Calendar.getInstance().get(Calendar.YEAR));
    }
    
    public Penny(int year) {
        familiarName = "Penny";
			frontImage = "A_Lincoln";
			backImage = "Lincoln_Memorial";
			valueDescription = "ONE CENT";
			ridgedEdge = false;
			metallurgy = "Copper";
        super(PENNY_VALUE, year);
    }
}

