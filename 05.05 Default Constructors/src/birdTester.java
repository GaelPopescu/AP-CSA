// Gael Popescu - 10/13/24
// This program uses the bird class to calculate the length of one wing, given the wingspan.
// It also calculates the y position of the bird after flapping once

public class birdTester {
    // Prints everything
    public static void printInfo(double yPos, double wingspan, double wing) {
        System.out.println("Bird Information:");
        System.out.printf("Wingspan: %.1f\t\tSingle wing length: %.1f\t\tY-position: %.2f", wingspan, wing, yPos);
    }

    public static void main(String[] args) {
        // Defines needed variables
        double wingspan = 3.0;
        double ypos = 1;
        // Constructs object
        BirdV3 blackbird = new BirdV3();
        // Uses methods from BirdV3 class
        double wing = blackbird.calcWing(wingspan);
        ypos = blackbird.flap(ypos, wing);
        printInfo(ypos, wingspan, wing);
    }
}