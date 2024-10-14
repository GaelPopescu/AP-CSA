public class GradesV2 {
    // Gael Popescu - 8/9/2024, Prints 4 lines with each having the current test grade, a total number of points and a rolling average of all test scores.
    static void printAll(int NT, int TG, int TP, double Avg) {
        System.out.printf("Test #%d   Test Grade: %d", NT, TG);
        System.out.print("   Total Points: ");
        System.out.print(TP);
        System.out.print("   Average Score: ");
        System.out.println(Avg);
    }

    public static void main(String[] args) {
        //local variables
        int numTests = 0;      //counts number of tests
        int testGrade = 0;     //individual test grade
        int totalPoints = 0;   //total points for all tests
        double average = 0.0;  //average grade

        testGrade = 95;
        numTests += 1;
        totalPoints = totalPoints + testGrade;
        average = (double) totalPoints/numTests;
        printAll(numTests, testGrade, totalPoints , average);

        testGrade = 73;
        numTests += 1;
        totalPoints = totalPoints + testGrade;
        average = (double) totalPoints/numTests;
        printAll(numTests, testGrade, totalPoints , average);

        testGrade = 91;
        numTests += 1;
        totalPoints = totalPoints + testGrade;
        average = (double) totalPoints/numTests;
        printAll(numTests, testGrade, totalPoints , average);

        testGrade = 82;
        numTests += 1;
        totalPoints = totalPoints + testGrade;
        average = (double) totalPoints/numTests;
        printAll(numTests, testGrade, totalPoints , average);
        }
}