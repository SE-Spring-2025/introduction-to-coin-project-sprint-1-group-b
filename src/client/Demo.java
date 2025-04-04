
import java.util.Scanner;

public class Demo {
	private static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println();
		System.out.println();
		System.out.println("Welcome to the CoinFlips Demo!");

		fixedDemo();
		interactiveDemo();

		System.out.println();
		System.out.println();
		System.out.println("Thanks for watching the CoinFlips Demo.");
		System.out.println("Have a wonderful day!");
		System.out.println();
	}

	private boolean cmpDoubles(double a, double b) {
		return Math.abs(a-b) < 0.00001;
		}

	public void make_a_coin(double value, int year) {
		if (cmpDoubles(value, PENNY_VALUE)) {
			familiarName = "Penny";
			frontImage = "A_Lincoln";
			backImage = "Lincoln_Memorial";
			valueDescription = "ONE CENT";
			ridgedEdge = false;
			metallurgy = "Copper";
		}
		else if (cmpDoubles(value, NICKEL_VALUE)) {
			familiarName = "Nickel";
			frontImage = "T_Jefferson";
			backImage = "Jefferson_Memorial";
			valueDescription = "FIVE CENTS";
			ridgedEdge = false;
			metallurgy = "Cupro-Nickel";
		}
		else if (cmpDoubles(value, DIME_VALUE)) {
			familiarName = "Dime";
			frontImage = "F_Roosevelt";
			backImage = "Torch_Branches";
			valueDescription = "ONE DIME";
			ridgedEdge = true;
			metallurgy = "Cupro-Nickel";
		}
		else if (cmpDoubles(value, QUARTER_VALUE)) {
			familiarName = "Quarter";
			frontImage = "G_Washington";
			backImage = "Eagle";
			valueDescription = "QUARTER DOLLAR";
			ridgedEdge = true;
			metallurgy = "Cupro-Nickel";
		}
		else if (cmpDoubles(value, HALFDOLLAR_VALUE)) {
			familiarName = "HalfDollar";
			frontImage = "J_Kennedy";
			backImage = "Presidential_Seal";
			valueDescription = "HALF DOLLAR";
			ridgedEdge = true;
			metallurgy = "Cupro-Nickel";
		}
		else if (cmpDoubles(value, DOLLAR_VALUE)) {
			familiarName = "Dollar";
			frontImage = "S_Anthony";
			backImage = "Moon_Eagle";
			valueDescription = "ONE DOLLAR";
			ridgedEdge = true;
			metallurgy = "Cupro-Nickel";
		}
		else value = 0;
	
		this.value = value;
		this.manufactureYear = year;
		this.frontMotto = "IN GOD WE TRUST";
		this.backMotto = "E PLURIBUS UNUM";
		this.frontLabel = "LIBERTY";
		this.backLabel = "UNITED STATES OF AMERICA";
		
		}

	private static void fixedDemo() {
		System.out.println();
		System.out.println();
		System.out.println("Making a Penny()");
		System.out.println("Result:" + new Penny());
		System.out.println("Making a Nickel()");
		System.out.println("Result:" + new Nickel());
		System.out.println("Making a Dime()");
		System.out.println("Result:" + new Dime());
		System.out.println("Making a Quarter()");
		System.out.println("Result:" + new Quarter());
		System.out.println("Making a HalfDollar()");
		System.out.println("Result:" + new HalfDollar());
		System.out.println("Making a Dollar()");
		System.out.println("Result:" + new Dollar());
		System.out.println("Making a Dollar(1991)");
		System.out.println("Result:" + new Dollar(1991));
	}

	private static void printMenu() {
		System.out.println();
		System.out.println();
		System.out.println("I'm ready to make you a coin!");
		System.out.println("Enter G for a dollar coin.");
		System.out.println("Enter H for a half dollar coin.");
		System.out.println("Enter Q for a quarter  coin.");
		System.out.println("Enter D for a dime  coin.");
		System.out.println("Enter N for a nickel coin.");
		System.out.println("Enter P for a penny coin.");
		System.out.println();
		System.out.println("Enter X to exit the demo.");
		System.out.println();
	}

	private static void interactiveDemo() {
		System.out.println();
		System.out.println();
		System.out.println("Would you like to make more coins yourself? (Y/n) ");
		String response = keyboard.nextLine();
		response = response.trim();
		if (response.charAt(0) == 'Y' || response.charAt(0) == 'y')
			runDemo();
	}

	private static void runDemo() {
		Coin c;

		while (true) {
			System.out.println();
			System.out.println();

			printMenu();
			System.out.print("What coin to make? ");
			String response = keyboard.nextLine();
			response = response.trim();
			switch (response.charAt(0)) {
				case 'G':
					System.out.println("Gonna make a dollar coin...");
					c = new Dollar();
					break;
				case 'H':
					System.out.println("Gonna make a half dollar coin...");
					c = new HalfDollar();
					break;
				case 'Q':
					System.out.println("Gonna make a quarter coin...");
					c = new Quarter();
					break;
				case 'D':
					System.out.println("Gonna make a dime coin...");
					c = new Dime();
					break;
				case 'N':
					c = new Nickel();
					System.out.println("Gonna make a nickel coin...");
					break;
				case 'P':
					System.out.println("Gonna make a penny coin...");
					c = new Penny();
					break;
				case 'X':
					return;
				default:
					System.out.println("Invalid entry, try again.");
					break;
			}
		}
	}
}
