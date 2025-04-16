import javax.swing.*;
import java.awt.*;
// import java.awt.event.*;

public class TotalCoins extends JFrame {
    private static JLabel totalCoinsLabel; 
    private static JLabel quarterCountLabel; 
    static CoinCounter coinCounter;

    public TotalCoins() {
        coinCounter = Coin.coinCounter;

        setTitle("Quarter Counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        totalCoinsLabel = new JLabel("Total Coins: 0");
        add(totalCoinsLabel);

        quarterCountLabel = new JLabel("Quarters: 0");
        add(quarterCountLabel);

        pack();
        setVisible(true);
    }

    public static void update() {
        totalCoinsLabel.setText(String.format("Total Coins: %d", coinCounter.getTotalCoins()));
        quarterCountLabel.setText(String.format("Quarters: %d", coinCounter.getQuarterCount()));
    }
}
