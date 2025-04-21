public class Nickel extends Coin {
    public Nickel() {
        super(
            "Nickel",
            NICKEL_VALUE,
            new CuproNickel()
        );

        Coin.coinCounter.incrementTotalCoins();
        Coin.coinCounter.incrementNickel();
        TotalCoins.update();
    }

    protected Coin imprintFront(Coin c) {
        c.frontMotto = "IN GOD WE TRUST";
        c.frontLabel = "LIBERTY";
        c.frontImage = "T_Jefferson";
        return c;
    }

    protected Coin imprintBack(Coin c) {
        c.backMotto = "IN GOD WE TRUST";
        c.backLabel = "UNITED STATES OF AMERICA";
        c.backImage = "Jefferson_Memorial";
        c.valueDescription = "FIVE CENTS";
        return c;
    }

    protected Coin edge(Coin c) {
        c.ridgedEdge = false;
        return c;
    }
}
