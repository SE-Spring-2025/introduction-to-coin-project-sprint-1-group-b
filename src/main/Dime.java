public class Dime extends Coin {
    public Dime() {
        super(
            "Dime",
            DIME_VALUE,
            new CuproNickel()
        );

        Coin.coinCounter.incrementTotalCoins();
        Coin.coinCounter.incrementDime();
        TotalCoins.update();
    }

    protected Coin imprintFront(Coin c) {
        c.frontMotto = "IN GOD WE TRUST";
        c.frontLabel = "LIBERTY";
        c.frontImage = "F_Roosevelt";
        return c;
    }

    protected Coin imprintBack(Coin c) {
        c.backMotto = "IN GOD WE TRUST";
        c.backLabel = "UNITED STATES OF AMERICA";
        c.backImage = "Torch_Branches";
        c.valueDescription = "ONE DIME";
        return c;
    }

    protected Coin edge(Coin c) {
        c.ridgedEdge = true;
        return c;
    }
}