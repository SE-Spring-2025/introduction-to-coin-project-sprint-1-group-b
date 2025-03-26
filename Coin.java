public class Coin {
    private double value;
    private String commonName;
    private String frontMotto;
    private int manufactureYear;
    private String frontImage;
    private String backImage;
    private String backMotto;
    private String frontLabel;
    private String backLabel;
    private String valueDescription;
    private String riggedEdge;
    private String mettalurgy;

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

    public String getBackImage() {
        return backImage;
    }

    public String getBackLabel() {
        return backLabel;
    }

    public String getBackMotto() {
        return backMotto;
    }

    public String getCommonName() {
        return commonName;
    }

    public String getFrontImage() {
        return frontImage;
    }

    public String getFrontLabel() {
        return frontLabel;
    }

    public String getFrontMotto() {
        return frontMotto;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public String getMettalurgy() {
        return mettalurgy;
    }

    public String getRiggedEdge() {
        return riggedEdge;
    }

    public double getValue() {
        return value;
    }

    public String getValueDescription() {
        return valueDescription;
    }

    public void setBackImage(String backImage) {
        this.backImage = backImage;
    }

    public void setBackLabel(String backLabel) {
        this.backLabel = backLabel;
    }

    public void setBackMotto(String backMotto) {
        this.backMotto = backMotto;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public void setFrontImage(String frontImage) {
        this.frontImage = frontImage;
    }

    public void setFrontLabel(String frontLabel) {
        this.frontLabel = frontLabel;
    }

    public void setFrontMotto(String frontMotto) {
        this.frontMotto = frontMotto;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public void setMettalurgy(String mettalurgy) {
        this.mettalurgy = mettalurgy;
    }

    public void setRiggedEdge(String riggedEdge) {
        this.riggedEdge = riggedEdge;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setValueDescription(String valueDescription) {
        this.valueDescription = valueDescription;
    }
}
