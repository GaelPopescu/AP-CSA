import java.util.Scanner;

public class Main {
    public static String lastCharacters (String word) {

        word = word.substring(word.length() - 2, word.length());

        return "The Last two characters in that word are " + word;

    }

    public static String yearsToVote (int age) {

        String years = "";
        int difference = 0;

        if (age >= 18) {
            difference = age - 18;
            years = "You have been able to vote for " + difference + " years";
        }

else if (age >= 0) {
            difference = 18 - age;
            years = "You will be able to vote in " + difference + " years";
        }

        return years;

    }







    public static void main(String[] args) {
        System.out.println(lastCharacters("Hello"));
        System.out.println(yearsToVote(13));
        System.out.println(yearsToVote(30));

        Scanner input = new Scanner (System.in);
        System.out.println("How old are you?");
        String age = input.next();
        int newAge = Integer.parse(age);
    }
}