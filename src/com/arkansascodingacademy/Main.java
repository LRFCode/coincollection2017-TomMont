package com.arkansascodingacademy;

public class Main
{
    //GOALS
    //Create classes
    //Add constructors to classes
    //Add variables to classes
    //Add methods to classes
    //Use BigDecimal class
    //Use ArrayList class

    //The code below has been written to exercise code the you will write
    //You can comment out any code you want to test your partial code but
    //be sure to put it back to complete this lab
    //If you want to add any extra code to this class please put it below
    //the comment at the end of main()

    public static void main(String[] args)
    {
        //BRONZE
        //Hint code this for just the Penny class at first and then go back to do the other coins
        //Hint you can ignore some of the values in the CoinCollection constructor at first to get things going

        //TODO Create Classes CoinCollection, Penny, Nickel, Dime, and Quarter in the com.arkansascodingacademy package
        //TODO Inside the CoinCollection class create a constructor that takes initial counts for each denomination
        //TODO Inside each coin Class create a constructor that takes a year as type int and saves it off at the instance level
        //TODO Inside the CoinCollection constructor create the specified number of each coin using a default year of 2000
        //TODO As you create each coin, keep track of it at the instance level in the CoinCollection class (Hint: use an ArrayList per coin denomination)
        //TODO Add addPenny, addNickel, addDime, and addQuarter methods to the CoinCollection class accepting a year as an int as input
        //TODO In the addPenny, addNickel, addDime, and addQuarter methods, create the appropriate coin and keep track of it along with the already created coins
        //TODO In each coin class create a getFaceValue() method that returns a BigDecimal representation of the coin's face value (Hint: remember that the face value for a given denomination is the same for all coins)
        //TODO In each coin class create a getCollectibleValue() method that returns a BigDecimal representation of the coin's collectible value (Hint: remember that the collectible value for coins can vary within a denomination)
        //TODO The collectible value for a coin should be based on the following:
        //TODO Penny:  Face Value + (0.03 * (Number of Years Older than 1945))
        //TODO Nickel: Face Value + (0.10 * (Number of Years Older than 1935))
        //TODO Dime:   Face Value (dimes have no additional collectible value)
        //TODO Quarter: Face Value + (0.22 * (Number of Years Older than 1923))
        //TODO In the CoinCollection create a getFaceValue() method that returns a BigDecimal representation of the total face value of all coins in the collection
        //TODO In the CoinCollection create a getCollectibleValue() method that returns a BigDecimal representation of the total collectible value of all coins in the collection

        System.out.println("Welcome to the ultimate coin collection program!");
        System.out.println("First we will create a default coin collection with some exciting coins.");

        final int quarterCount = 10;
        final int dimeCount = 5;
        final int nickelCount = 3;
        final int pennyCount = 2;

        //This invokes the CoinCollection constructor
        CoinCollection coinCollection = new CoinCollection(quarterCount, dimeCount, nickelCount, pennyCount);

        System.out.println("Let's take a look at the value of your new coin collection.");
        System.out.println();

        System.out.println("Coins have total face value of " + coinCollection.getFaceValue());
        System.out.println("Coins have total collectible value of " + coinCollection.getCollectibleValue());

        System.out.println();
        System.out.println("Let's add some more coins to your collection.");

        final int pennyYear1 = 1900;
        final int nickelYear1 = 1903;
        final int dimeYear1 = 1905;
        final int quarterYear1 = 1908;

        coinCollection.addPenny(pennyYear1);
        coinCollection.addNickel(nickelYear1);
        coinCollection.addDime(dimeYear1);
        coinCollection.addQuarter(quarterYear1);

        final int pennyYear2 = 1940;
        final int nickelYear2 = 1993;
        final int dimeYear2 = 1978;
        final int quarterYear2 = 2008;

        coinCollection.addPenny(pennyYear2);
        coinCollection.addNickel(nickelYear2);
        coinCollection.addDime(dimeYear2);
        coinCollection.addQuarter(quarterYear2);

        System.out.println("Let's take a look at the value of your improved coin collection.");
        System.out.println();
        System.out.println("Coins have total face value of " + coinCollection.getFaceValue());
        System.out.println("Coins have total collectible value of " + coinCollection.getCollectibleValue());

        System.out.println();
        System.out.println("Let's take a look at the value of your improved coin collection in more detail.");
        System.out.println();
        System.out.println("Quarters have total face value of " + coinCollection.getQuartersFaceValue());
        System.out.println("Quarters have total collectible value of " + coinCollection.getQuartersCollectibleValue());

        System.out.println("Dimes have total face value of " + coinCollection.getDimesFaceValue());
        System.out.println("Dimes have total collectible value of " + coinCollection.getDimesCollectibleValue());

        System.out.println("Nickels have total face value of " + coinCollection.getNickelsFaceValue());
        System.out.println("Nickels have total collectible value of " + coinCollection.getNickelsCollectibleValue());

        System.out.println("Pennies have total face value of " + coinCollection.getPenniesFaceValue());
        System.out.println("Pennies have total collectible value of " + coinCollection.getPenniesCollectibleValue());
    }
}



        /*
        //SILVER
        //Add support for Paper Currency to your CoinCollection class
        //Support 1,5,10,20, and 100 dollar bills but do not worry about adding default counts to the constructor of CoinCollection
        //Make the constructor of the paper currency types also take an int serial number
        //Add methods to CoinCollection that return true or false if a bill already exists given a serial number

        //GOLD
        //Throw an exception if someone tries to add a bill with the same serial number as any other bill in the same denomination
        //Make a second constructor on CoinCollection take takes a BigDecimal amount and populates
        //the collection with the fewest possible currency instances needed to add up to that amount
        //For example $123.12 would result in 1 of $100, 1 of $20, 3 of $1, 1 of Dime, and 2 of Penny
        //Create JUnit tests to prove your code meets the requirements above

        //TODO Put any extra testing code you want after this line
        System.out.println("My Testing Code Starts Here");
    }
}


/*
Recommended order of modifiers
public / private / protected
abstract
static
final
transient
volatile
**default**
synchronized
native
strictfp
 */
