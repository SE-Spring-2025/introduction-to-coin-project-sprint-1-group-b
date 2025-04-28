# COINS~!!!

## Main Features/Functionality

Currently supports every coin in US circulation. The demo allows for the client to interact with the features we have written.

Also has a GUI interface that shows the counts for total quarters and overall coin totals.

## Setup

Clone the repository, and then run make compile from the terminal. Then you can run the tests, checkstyle, demo, etc.

## Usage

Once you've cloned the repository, run make compile, and then make demo. If you want to run the tests, run make test. **DO THIS FROM THE SOURCE DIRECTORY**

### Relevant methods

`Coin ( int year : optional ) -> Coin`:\
An abstract class to be extended by specific coin types. We currently support all US Standard coins: \
Penny, Nickel, Dime, Quarter, Half-Dollar, Dollar. \
Allows a creation year to be passed as an argument, defaults to the current year.

`manufacture() -> Coin`:\
Performs the coin manufacturing process by imprinting the front, \
flipping it, imprinting the back, then ridging the edges (if applicable) \
Returns a manufactured Coin object.

### Usage Example:
```java
Coin dime = new Dime(2005);
dime.manufacture();
System.out.println(dime);  // Prints the specifics for a dime created in 2005
```

## Contribution guidelines.

Make sure your code is readable and follows the checkstyle standards. Run make check whenever you add new code and adjust as needed.

## Code structure

Each class has its own test class. Make sure that you test your code and make sure everything is functional before committing and opening a PR.
