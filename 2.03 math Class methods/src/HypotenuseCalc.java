// Gael Popescu - 8/19/24
// This code randomly generates two right triangles with 2 integer sides and then calculates the Hypotenuse
public class HypotenuseCalc {
    public static void main(String[] args) {
        // Variable Declaration
        double RandA, RandB, SumOfSquares, Hypotenuse;
        int SideA, SideB;
        // For loop to Generate 2 Triangles
        for (int i = 0; i < 2; i++) {
            // Chooses Two Random Numbers between 0 and 1
            RandA = Math.random();
            RandB = Math.random();
            // Converts the two previously chosen random numbers to be between 5 and 23
            SideA = (int) (RandA * 18 + 5);
            SideB = (int) (RandB * 18 + 5);
            // Calculates the Hypotenuse
            SumOfSquares = Math.pow(SideA, 2) + Math.pow(SideB, 2);
            Hypotenuse = Math.sqrt(SumOfSquares);
            // Prints
            System.out.printf("Triangle %d,\tSide 1: %d\tSide 2: %d\tHypotenuse: %f%n", i, SideA, SideB, Hypotenuse);
        }
    }
}