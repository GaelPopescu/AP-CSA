// Gael Popescu 10/4/24
// This Program calculates the gravitational acceleration on a planet given that planet's name, mass, and diameter.
public class PlanetGravity  {
    // Uses the Universal Gravitational Constant to find the mass
    public static double CalcGrav(double r, double m) {
        double UGC = 6.6743e-11;
        return (UGC * m)/(Math.pow(r,2));
    }
    // Uses printf to nicely format everything and centers the Title over the table
    public static void printTitle(){
        System.out.printf("\t\t\t\t\t\tPlanetary Data\n");
        System.out.printf("Planet\t\tDiameter (km)\t\tMass (kg)\t\tg (m/s^2)\n");
        System.out.printf("---------------------------------------------------------\n");
    }
    // Prints all the data very neatly using only one print statement.
    // %e is to print in scientific notation
    public static void printData(String planet, double D, double m, double g){
        System.out.printf("%s\t\t%,.1f\t\t\t%.3e\t\t%.2f", planet, D, m, g);
    }

    // Here are all the variables needed and the two print methods
    public static void main(String[] args) {
        String Planet = "Venus";
        double Diameter = 12103.6;
        double radius = 1000 * Diameter / 2;
        double mass = 	4.869e24;
        double grav = (CalcGrav(radius, mass));
        printTitle();
        printData(Planet, Diameter, mass, grav);

    }
}