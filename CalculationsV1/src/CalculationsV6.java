/**
 * @ author APCS Team
 * @ version 2020
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.

 * Gael Popescu - 8/12/24
 */
public class CalculationsV6 {
    public static void main(String[] args) {
        // Addition
        int iNum1 = 25;
        int iNum2 = 9;
        int iNum3 = 11;
        double dNum1 = 43.21;
        double dNum2 = 3.14;
        double dNum3 = 10.0;
        System.out.println("\nAddition");
        System.out.println("25 + 9 = " + (iNum1 + iNum2));
        System.out.println("43.21 + 3.14 = " + (dNum1 + dNum2));

        // Subtraction
        System.out.println("\nSubtraction");
        System.out.println("11 - 9 - 25 = " + (iNum3 - iNum1 - iNum2));
        System.out.println("3.14 - 10.0 = " + (dNum2 - dNum3));

        // Multiplication
        System.out.println("\nMultiplication");
        System.out.println("25 * 9 = " + (iNum1 * iNum2));
        System.out.println("3.14 * 10.0 * 10.0 = " + (dNum2 * dNum3 * dNum3));

        // Division
        System.out.println("\nDivision");
        System.out.println("9 / 25 = " + iNum1 / iNum2);
        System.out.println("43.21 / 10.0 = " + (dNum1 / dNum3));

        // Modulus operator
        System.out.println("\nModulus");
        System.out.println("11 % 9 = " + (iNum3 % iNum2));
        System.out.println("10.0 % 3.14 = " + (dNum3 % dNum2));

        // 1.08 Additional int Equations
        System.out.println("\nExtra Equations - int");
        System.out.println("9 * 11 + 25 = " + (iNum2 * iNum3 + iNum1));
        System.out.println("25 / 9 + 5 =" + (iNum1 / iNum2 + iNum3));
        System.out.println("25 % (11 * 9) = " + (iNum1 % (iNum3 * iNum2)));

        // 1.09 Additional double Equations
        System.out.println("\nExtra Equations - double");
        System.out.println("43.21 - 10.0/3.14 = " + (dNum1 - dNum3 / dNum2));
        System.out.println("43.21 % 3.14 - 43.21 * 10.0 = " + (dNum1 % dNum2 - dNum1 * dNum3));
        System.out.println("10.0 + 3.14 % 10.0 = " + (dNum3 + dNum2 + dNum1));

    } // end of main method
} // end of class
