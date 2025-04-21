public class HalfDollar extends Coin {
    public HalfDollar() {
        super(
                "HalfDollar",
                HALFDOLLAR_VALUE,
                new CuproNickel()
        );
        Coin.coinCounter.incrementTotalCoins();
        Coin.coinCounter.incrementHalfDollar();
        TotalCoins.update();
    }

    protected Coin imprintFront(Coin c) {
        c.frontMotto = "IN GOD WE TRUST";
        c.frontLabel = "LIBERTY";
        c.frontImage = "J_Kennedy";
        return c;
    }

    protected Coin imprintBack(Coin c) {
        if (!c.flipped) {
            return c;
        }
        c.backMotto = "E PLURIBUS UNUM";
        c.backLabel = "UNITED STATES OF AMERICA";
        c.backImage = "Presidential_Seal";
        c.valueDescription = "HALF DOLLAR";
        return c;
    }

    protected Coin edge(Coin c) {
        c.ridgedEdge = true;
        return c;
    }
}
