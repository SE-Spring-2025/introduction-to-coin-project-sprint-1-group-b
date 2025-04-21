public class Quarter extends Coin {
    public Quarter(int year) {
        super(
            "Quarter", 
            QUARTER_VALUE, 
            new CuproNickel()
        );

        Coin.coinCounter.incrementTotalCoins();
        Coin.coinCounter.incrementPenny();
        TotalCoins.update();
    }

    protected Coin imprintFront(Coin c) {
        c.frontMotto = "IN GOD WE TRUST";
        c.frontLabel = "LIBERTY";
        c.frontImage = "G_Washington";
        return c;
    }

    protected Coin imprintBack(Coin c) {
        c.backMotto = "IN GOD WE TRUST";
        c.backLabel = "UNITED STATES OF AMERICA";
        c.backImage = "Eagle";
        c.valueDescription = "QUARTER DOLLAR";
        return c;
    }

    protected Coin edge(Coin c) {
        c.ridgedEdge = false;
        return c;
    }
}
