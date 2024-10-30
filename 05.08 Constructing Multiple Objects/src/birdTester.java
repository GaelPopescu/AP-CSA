// Gael Popescu - 10/19/24
// This program uses the bird class to calculate the position of a bird after it flaps.
// The BirdV8 class has 2 constructors, one being the default constructor, and another taking 3 variables

public class birdTester {
    // Prints everything
    public static void printInfo(double yPos, double wingspan) {
        System.out.println("Bird Information:");
        System.out.printf("Wingspan: %.1f\t\tY-position: %.2f%n", wingspan, yPos);
    }

    public static void printInfo(double xPos, double yPos, double wingspan) {
        System.out.println("Bird Information:");
        System.out.printf("Wingspan: %.1f\t\tX and Y position: (%.2f, %.2f)%n", wingspan, xPos, yPos);
    }

    public static void main(String[] args) {
        // Defines needed variables
        double wingspan = 12;
        double ycoord = 0;
        // Constructs objects, one for each constructor
        BirdV8 blackbird = new BirdV8();
        BirdV8 woodstar = new BirdV8(3, 0, 0);
        BirdV8 crow = new BirdV8(33, 0, 10);
        // Uses methods for the blackbird object
        ycoord = blackbird.flap(ycoord, wingspan);
        printInfo(ycoord, wingspan);
        //uses methods for the woodstar object
        woodstar.flap();
        printInfo(woodstar.getXpos(), woodstar.getYpos(), woodstar.getWingspan());
        //uses methods for the crow object
        crow.flap();
        printInfo(crow.getXpos(), crow.getYpos(), crow.getWingspan());
    }
}