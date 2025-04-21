import java.text.DecimalFormat;

public abstract class Coin {
	public static final double PENNY_VALUE = 0.01;
	public static final double NICKEL_VALUE = 0.05;
	public static final double DIME_VALUE = 0.10;
	public static final double QUARTER_VALUE = 0.25;
	public static final double HALFDOLLAR_VALUE = 0.50;
	public static final double DOLLAR_VALUE = 1.00;
	protected String familiarName;
	protected double value;
	protected String frontMotto;
	protected String backMotto;
	protected String frontLabel;
	protected String backLabel;
	protected String frontImage;
	protected String backImage;
	protected String valueDescription;
	protected boolean ridgedEdge;
	protected String metallurgy;
	protected Metallurgy smelter;
	protected int manufactureYear;
	protected static CoinCounter coinCounter = new CoinCounter();
	protected boolean flipped;
	protected boolean buffed;

	public Coin (String familiarName, double value, Metallurgy smelter, int year) {
		this.familiarName = familiarName;
		this.value = value;
		this.smelter = smelter;
		this.manufactureYear = year;  // THIS IS WRONG FOR SPRINT 5, NEED TO FIX

		this.flipped = false;
		this.buffed = false;
	}

	/* public Coin(
		String familiarName,
		double value,
		String frontMotto,
		String backMotto,
		String frontLabel,
		String backLabel,
		String frontImage,
		String backImage,
		String valueDescription,
		boolean ridgedEdge,
		Metallurgy smelter,
		int manufactureYear
	) {
		this.familiarName = familiarName;
		this.value = value;
		this.frontMotto = frontMotto;
		this.backMotto = backMotto;
		this.frontLabel = frontLabel;
		this.backLabel = backLabel;
		this.frontImage = frontImage;
		this.backImage = backImage;
		this.valueDescription = valueDescription;
		this.ridgedEdge = ridgedEdge;
		this.smelter = smelter;
		this.manufactureYear = manufactureYear;
	} */

	public Coin manufacture(Coin c0) {
		Coin c1 = c0.smelt(c0);
		c1 = c1.imprintFront(c1);
		c1.flip();
		c1 = c1.imprintBack(c1);
		c1 = c1.edge(c1);
		c1.buff();
		return c0;
	}

	protected abstract Coin imprintFront(Coin c);  // i dont think these should be abstract methods
	protected abstract Coin imprintBack(Coin c);
	protected abstract Coin edge(Coin c);

	public Coin smelt(Coin c0) {
		c0.metallurgy = smelter.smelt();
		return c0;
	}

	public void flip() {
		this.flipped = !flipped;
	}

	public void buff() {
		this.buffed = true;
	}

	public String getFamiliarName() {
		return familiarName;
	}

	public double getValue() {
		return value;
	}

	public String getFrontMotto() {
		return frontMotto;
	}

	public String getBackMotto() {
		return backMotto;
	}

	public String getFrontLabel() {
		return frontLabel;
	}

	public String getBackLabel() {
		return backLabel;
	}

	public String getFrontImage() {
		return frontImage;
	}

	public String getBackImage() {
		return backImage;
	}

	public String getValueDescription() {
		return valueDescription;
	}

	public boolean getRidgedEdge() {
		return ridgedEdge;
	}

	public String getMetallurgy() {
		return metallurgy;
	}

	public int getYear() {
		return manufactureYear;
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		String formattedValue = df.format(value);

		return "[" + familiarName
				+ "," + formattedValue
				+ "," + manufactureYear
				+ ",'" + frontMotto
				+ "','" + backMotto
				+ "','" + frontImage
				+ "','" + backImage
				+ "','" + frontLabel
				+ "','" + backLabel
				+ "','" + valueDescription
				+ "'," + (ridgedEdge ? "ridges" : "smooth")
				+ ",'" + metallurgy
				+ "']";
	}
}
