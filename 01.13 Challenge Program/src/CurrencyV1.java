/*
 * The Currency class converts an amount of money from a specific country into the equivalent currency of another country given the current exchange rate.
 * @author Gael Popescu
 * @version 08/15/24
 */
public class CurrencyV1
{
    public static void main(String [ ] args)
    {
        double startingUsDollars = 6500.00;		// starting US Dollars
		//Mexico
        double pesosSpent = 7210.25;
        double pesoExchangeRate = 19.57852;     // 1 US dollar = 19.57852 Pesos
        double dollarsSpentInMexico = pesosSpent / pesoExchangeRate;
        double dollarsAfterMexico = startingUsDollars - dollarsSpentInMexico;
		//Switzerland
		double francsSpent = 1387.68;
		double francExchangeRate = 0.864772 ;     // 1 US dollar = 0.864772 Francs
		double dollarsSpentInSwi = francsSpent / francExchangeRate;
		double dollarsAfterSwi = dollarsAfterMexico - dollarsSpentInSwi;
		//New Zealand
		double NZDspent = 2568.76;
		double NZDExchangeRate = 1.66583;     // 1 US dollar = 1.66583 NZD
		double dollarsSpentInNZ = NZDspent / NZDExchangeRate;
		double dollarsAfterNZ = dollarsAfterSwi - dollarsSpentInNZ;
        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money from a ");
        System.out.println("specific country into the equivalent currency of ");
        System.out.println("another country given the current exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		System.out.printf("Mexico:%n Pesos Spent:%,20.2f%n",pesosSpent);
		System.out.printf(" US Dollars Equivalent:%,8.2f%n",dollarsSpentInMexico);
		System.out.printf(" US Dollars remaining:%,11.2f%n%n",dollarsAfterMexico);

		System.out.printf("Switzerland:%n Francs Spent:%,19.2f%n",francsSpent);
		System.out.printf(" US Dollars Equivalent:%,10.2f%n",dollarsSpentInSwi);
		System.out.printf(" US Dollars remaining:%,11.2f%n%n",dollarsAfterSwi);

		System.out.printf("New Zealand:%n NZ Dollars Spent:%,15.2f%n",NZDspent);
		System.out.printf(" US Dollars Equivalent:%,10.2f%n",dollarsSpentInNZ);
		System.out.printf(" US Dollars remaining:%,11.2f%n%n",dollarsAfterNZ);

		System.out.printf("Remaining US Dollars:%,16.2f%n%n",dollarsAfterNZ);

        // Complete the code below for Souvenir Purchases
 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculations for Souvenir #1
		int costItem1 = 12;  						//cost per item of first souvenir
		int budget1 = 100;   						//budget for first item
		int totalItems1 = budget1/costItem1; 		//how many items can be purchased
		int fundsRemaining1 = budget1-totalItems1 * costItem1;  //how much of the budget is left

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItems1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1 + "\n ");

		//Calculations for Souvenir #2
		double costItem2 = 29.99;  						//cost per item of second souvenir
		int budget2 = 500;   							//budget for second item
		int totalItems2 = (int)(budget2/costItem2); 	//how many items can be purchased
		double fundsRemaining2 = budget2 - totalItems2 * costItem2;  	//how much of the budget is left

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItems2);
		System.out.printf("   Funds remaining: $%.2f", fundsRemaining2);
    } // end of main method
} // end of class

