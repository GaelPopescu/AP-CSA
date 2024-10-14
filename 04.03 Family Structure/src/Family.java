import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/* Gael Popescu - 9/21/24
   This Program creates composition statistics for families with two children by reading a text file */
public class Family {
    public static void main(String[] args) throws IOException {
        //Creates all classes and necessary variables
        String token = " ";
        File fileName = new File("src\\familyMembers.txt");
        Scanner inFile = new Scanner(fileName);
        int bbnum = 0;
        int bgnum = 0;
        int ggnum = 0;
        // Goes Through Every line in the file
        while( inFile.hasNext() )
        {
            token = inFile.next( );
            if (token.equals("BB")) {
                bbnum += 1;
            }
            else if (token.equals("BG") || token.equals("GB")) {
                bgnum += 1;
            }
            else if (token.equals("GG")) {
                ggnum += 1;
            }
        }
        //Closes the File
        inFile.close();
        // Calculates everything Necessary
        int total = bbnum + bgnum + ggnum;
        double bbp = ((double) bbnum /total) * 100;
        double ggp = ((double) ggnum /total) * 100;
        double bgp = ((double) bgnum /total) * 100;

        // Prints all the data
        System.out.println("Composition statistics for families with two children.\t");
        System.out.printf("Total Number of Families: %d%n%n", total);
        System.out.println("Number of Families With");
        System.out.printf("          2 Boys: %d represents %.2f%%%n", bbnum, bbp);
        System.out.printf("         2 Girls: %d represents %.2f%%%n", ggnum, ggp);
        System.out.printf("1 Boy and 1 Girl: %d represents %.2f%%%n", bgnum, bgp);

    }
}