//This code randomly generates passwords of a specific length
//Gael Popescu, 9/22/24
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Objects;
import java.util.Scanner;

public class SecretPasscode
{
    public static void main(String [] args) throws IOException
    {
        String userChoice = "Y";
        int pwLength = 0;
        int randNum = 95;
        String password = "";

        // initialize scanner and print writer
        Scanner in = new Scanner(System.in);
        PrintWriter outFile = new PrintWriter(new File("src//passwords.txt"));

        System.out.println("**********************************************************");
        System.out.println("Welcome to a simple password generator. \nThe password will include lowercase, uppercase, & numbers.");

        // Ask for password length
        while (Objects.equals(userChoice, "Y") || Objects.equals(userChoice, "y")) {
            System.out.print("Enter a password length (6 or more): ");
            String pl = in.next();
            pwLength = Integer.parseInt(pl);

            // validate password length
            while (pwLength < 6) {
                System.out.println("Password length too short.");
                System.out.print("Enter a password length (6 or more): ");
                pl = in.next();
                pwLength = Integer.parseInt(pl);
            }
            // generate a random character in the correct character set
            char ch = 49;
            for (int i = 0; i < pwLength; i++) {
                randNum = (int) (Math.random() * 75 + 48);
                ch = (char) randNum;
                while ((96 >= randNum && randNum >= 91) || (58 <= randNum && randNum <= 64)) {
                    randNum = (int) (Math.random() * 75 + 48);
                    ch = (char) randNum;
                }
                // concatenate the character to the password
                password = password + ch;
            }

            // write the password to the file
            outFile.println(password);
            password = "";
            // Sees if another password is wanted
            System.out.print("Would you like to generate another password? (Y/N)");
            userChoice = in.next();
        }
        // when the user is done, close the text file so that it can be re-opened and read
        outFile.close();

        // Read passwords back from text file and display to the screen
        String token;
        File fileName = new File("src//passwords.txt");
        Scanner inFile = new Scanner(fileName);
        //while loop will continue while inFile has a next token to read
        while (inFile.hasNext()) {
            token = inFile.nextLine();
            System.out.println(token);
        }

    }//end main
}//end class


