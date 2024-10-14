//This Code takes in information about the purchase and then prints a receipt for it
//Gael Popescu - 8/21/2024
import java.util.Scanner;         //imports Scanner methods
public class BuyMovieTickets {
    public static void main(String[] args) {
        //Initializes the two scanner objects used
        Scanner in = new Scanner(System.in);
        Scanner s = new Scanner(System.in).useDelimiter("/");

        //First Name and Last Name are saved as variables
        System.out.println("Please type your first and last name: ");
        String Name1 = in.next();
        String Name2 = in.next();

        //Using s allows / to be the delimiter and makes it easier to detect without using substring.
        // Unfortunately, substring is needed for Year since it will take in an extra space at the end when submitting by pressing space and then clicking new line.
        System.out.println("Enter Today's Date as mm/dd/yyyy: ");
        String Month = s.next();
        String Day = s.next();
        String Year = s.next().substring(0,4);

        //Takes the entire name of the item by using next and nextLine
        System.out.println("Enter the name of the item: ");
        String Item = in.next() + in.nextLine();

        //Must take in quantity and price as strings and then uses parse to turn them into int and double respectively.
        System.out.println("Enter the amount and price of the item (Separate them with a Space and no Dollar Sign): ");
        String SQty = in.next();
        int Qty = Integer.parseInt(SQty);
        String SPri = in.next();
        double Pri = Double.parseDouble(SPri);

        //Converts Entire Debit Card Number Into the printed final 4 digits
        System.out.println("Enter Debit Card Number (#####-###-####): ");
        String DCN = in.next();
        String FDCN = DCN.substring(10);

        //Takes in Pin as a String
        System.out.println("Enter your PIN (#####): ");
        String PIN = in.next();

        //Prints Everything and does the necessary math
        System.out.println("\n------------");
        System.out.println("Your e-Receipt\n");
        System.out.println(Month + "-" + Day + "-" + Year);
        System.out.println("Order Number: " + Name1.substring(0,1) + Name2.substring(0,1) + DCN.substring(0,1) + DCN.substring(6,7) + FDCN.substring(0,1) + "\n");
        System.out.println("  " + Name1.substring(0,1) + ". " + Name2);
        System.out.println("  Account: #####-###-" + FDCN);
        System.out.println("  Item: " + Item);
        System.out.println("  Number of Items: " + Qty);
        System.out.println("  Price of Item: " + Pri);
        System.out.println("\n  $" + Qty * Pri + " will be debited to your account");
        System.out.println("\n  Thank you");
    }
}