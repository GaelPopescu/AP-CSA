import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
// Gael Popescu, 8/30/24
// This program takes information in like name, gender, BMR, and how active is someone
// and prints all those as well as printing the TDEE value
public class TDEE  {
    public static void main(String[] args) {
        //Imports Scanner object
        Scanner in = new Scanner(System.in);
        //Takes all information necessary and parses it how is necessary
        System.out.print("Please enter your name: ");
        String name = in.nextLine();
        System.out.print("Please enter your BMR: ");
        String SBMR = in.next();
        double BMR = Double.parseDouble(SBMR);
        System.out.print("Please enter your gender (M/F): ");
        String Gender = in.next();
        // Prints and takes options for physical activity
        System.out.println("Select your Activity Level");
        System.out.println("[A] Resting: Sleeping, reclining");
        System.out.println("[B] Sedentary: Minimal movement, mainly sitting/lying down");
        System.out.println("[C] Light: Office work, sitting");
        System.out.println("[D] Moderate: Light manual labor");
        System.out.println("[E] Very Active: Hard manual labor");
        System.out.println("[F] Extremely Active: Heavy manual labor");
        System.out.println("Enter the Letter corresponding to your activity level:");
        String al = in.next();
        // Creates the lists necessary for converting the letter for activity level into a number
        // The corresponding number has the same index as the letter
        List<String> letters = Arrays.asList("A", "B", "C", "D", "E", "F");
        List<Double> AFMLst = Arrays.asList(1.0, 1.3, 1.6, 1.7, 2.1, 2.4);
        List<Double> AFFLst = Arrays.asList(1.0, 1.3, 1.5, 1.6, 1.9, 2.2);
        //declares a variable to be used later
        double af = 0;
        //Matches letter to number if female. Accepts both F and f
        if (Gender.equals("F") || Gender.equals("f")) {
            //Iterates through the list of letters
            for (String i: letters) {
                //Finds correct letters and matches them with the number
                if (i.equals(al)){
                    af = AFFLst.get(letters.indexOf(i));
                }
            }
        }
        // Same As for female but for male
        else if (Gender.equals("M") || Gender.equals("m")) {
            for (String i: letters) {
                if (i.equals(al)){
                    af = AFMLst.get(letters.indexOf(i));
                }
            }
        }
        //Prints something if the gender doesn't make sense
        else {
            System.out.println("Incorrect Gender Entered");
            af = 0;
        }
        // Prints all the results and calculates the TDEE by multiplying the BMR and the Activity Factor
        System.out.println("Your results:");
        System.out.println("Name: " + name + "\t\t\t\tGender: " + Gender);
        System.out.println("BMR: " + BMR + " calories\t\t\t Activity Factor: " + af);
        System.out.printf("TDEE: %.2f calories", BMR * af);

    }
}