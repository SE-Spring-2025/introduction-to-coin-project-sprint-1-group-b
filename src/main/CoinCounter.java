public class CoinCounter {
    int totalCoins;
    int pennyCount;
    int nickelCount;
    int dimeCount;
    int quarterCount;
    int halfDollarCount;
    int dollarCount;

    public CoinCounter() {
        this.totalCoins = 0;
        this.pennyCount = 0;
        this.nickelCount = 0;
        this.dimeCount = 0;
        this.quarterCount = 0;
        this.halfDollarCount = 0;
        this.dollarCount = 0;
    }

    public int getDimeCount() {
        return dimeCount;
    }

    public int getDollarCount() {
        return dollarCount;
    }

    public int getHalfDollarCount() {
        return halfDollarCount;
    }

    public int getNickelCount() {
        return nickelCount;
    }

    public int getPennyCount() {
        return pennyCount;
    }

    public int getQuarterCount() {
        return quarterCount;
    }

    public int getTotalCoins() {
        return totalCoins;
    }

    public void incrementTotalCoins() {
        totalCoins++;
    }

    public void incrementPenny() {
        pennyCount++;
    }

    public void incrementNickel() {
        nickelCount++;
    }

    public void incrementDime() {
        dimeCount++;
    }

    public void incrementQuarter() {
        quarterCount++;
    }

    public void incrementHalfDollar() {
        halfDollarCount++;
    }

    public void incrementDollar() {
        dollarCount++;
    }
}
