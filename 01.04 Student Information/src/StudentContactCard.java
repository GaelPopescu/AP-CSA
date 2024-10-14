 /* Gael Popescu - 8/13/24
 \  This program prints a lot of information about myself
  */
public class StudentContactCard {
    public static void main(String[] args) {
        String StdName = "Gael Popescu";
        String StdBirthday = "1/30";
        int StdAge = 15;
        String StdSchool = "Hanover High School";
        int Grade = 11;
        String City = "Hanover";
        String Email = "gael.popescu@gmail.com";
        long Phone = 6036431923L;
        double StartTimeAvailable = 3.30;
        double EndTimeAvailable = 7.00;

        String ParEmail = "alin.c.popescu@gmail.com";
        String HighestMath = "Multivariable Calculus";
        String CSExp = "I have taken Multiple CS Classes before, although they were in Python. \n               " +
                "I am also currently doing a programming-heavy research project";
        String CSReason = "I want to take the CSA AP Exam and I would like to learn Java";

        System.out.println("Student Information:");

        System.out.printf("Name: %s, Birthday: %s, Age: %d %n", StdName, StdBirthday, StdAge);
        System.out.printf("School: %s, Grade: %d %n", StdSchool, Grade);

        System.out.printf("%nContact Information:%nCity: %s, Email: %s, Phone, %d %n", City, Email, Phone);
        System.out.printf("Time Range Available during School: %.2f - %.2f%n", StartTimeAvailable,EndTimeAvailable);
        System.out.printf("Parental Contact Information: %s%n", ParEmail);

        System.out.printf("%nHighest Math Class Taken: %s%n", HighestMath);
        System.out.print("CS Experience: ");
        System.out.println(CSExp);
        System.out.println("Reason for Course: " + CSReason);
    }
}