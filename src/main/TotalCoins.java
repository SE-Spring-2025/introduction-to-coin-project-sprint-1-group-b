import javax.swing.*;
import java.awt.*;
// import java.awt.event.*;

public class TotalCoins extends JFrame {
    private static JLabel totalCoinsLabel; 
    private static JLabel pennyCountLabel; 
    private static JLabel nickelCountLabel; 
    private static JLabel dimeCountLabel; 
    private static JLabel quarterCountLabel; 
    private static JLabel halfDollarCountLabel; 
    private static JLabel dollarCountLabel; 
    static CoinCounter coinCounter;

    public TotalCoins() {
        coinCounter = Coin.coinCounter;

        setTitle("Quarter Counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        totalCoinsLabel = new JLabel("Total Coins: 0");
        totalCoinsLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 36));
        add(totalCoinsLabel);

        add(Box.createHorizontalStrut(10));

        pennyCountLabel = new JLabel("Pennies: 0");
        pennyCountLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 36));
        add(pennyCountLabel);

        add(Box.createHorizontalStrut(10));

        nickelCountLabel = new JLabel("Nickels: 0");
        nickelCountLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 36));
        add(nickelCountLabel);

        add(Box.createHorizontalStrut(10));

        dimeCountLabel = new JLabel("Dimes: 0");
        dimeCountLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 36));
        add(dimeCountLabel);

        add(Box.createHorizontalStrut(10));

        quarterCountLabel = new JLabel("Quarters: 0");
        quarterCountLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 36));
        add(quarterCountLabel);

        add(Box.createHorizontalStrut(10));

        halfDollarCountLabel = new JLabel("Half Dollars: 0");
        halfDollarCountLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 36));
        add(halfDollarCountLabel);

        add(Box.createHorizontalStrut(10));

        dollarCountLabel = new JLabel("Dollars: 0");
        dollarCountLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 36));
        add(dollarCountLabel);

        pack();
        setVisible(true);
    }

    public static void update() {
        totalCoinsLabel.setText(String.format("Total Coins: %d", coinCounter.getTotalCoins()));
        pennyCountLabel.setText(String.format("Pennies: %d", coinCounter.getPennyCount()));
        nickelCountLabel.setText(String.format("Nickels: %d", coinCounter.getNickelCount()));
        dimeCountLabel.setText(String.format("Dimes: %d", coinCounter.getDimeCount()));
        quarterCountLabel.setText(String.format("Quarters: %d", coinCounter.getQuarterCount()));
        halfDollarCountLabel.setText(String.format("Half Dollars: %d", coinCounter.getHalfDollarCount()));
        dollarCountLabel.setText(String.format("Dollars: %d", coinCounter.getDollarCount()));
    }
}
