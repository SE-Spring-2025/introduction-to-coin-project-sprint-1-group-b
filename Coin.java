public class Coin {
    protected double value;
    protected String commonName;
    protected String frontMotto;
    protected int manufactureYear;
    protected String frontImage;
    protected String backImage;
    protected String backMotto;
    protected String frontLabel;
    protected String backLabel;
    protected String valueDescription;
    protected String riggedEdge;
    protected String mettalurgy;

    public Coin() {

    }

    public Coin(double value) {
        this.value = value;
    }

    public Coin(double value, int year){
        this.value = value;
        this.manufactureYear = year;
    }

    public String toString() {
        String printString = "This is a coin";
        if (this.value != 0) {
            printString += String.format(" worth %f cents", this.value);
        }
        if (this.manufactureYear != 0) {
            printString += String.format(" manufactured in %d", this.manufactureYear);
        }
        printString += ".";
        return printString;
    }
}
