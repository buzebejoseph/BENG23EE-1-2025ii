import java.util.Scanner;

public class SOMA {
    public static void main(String[] args) {
        // Create a Program
        Program P = new Program("OOP", "SCETO7255", "Mwinuka");

        // Create Students
        Students S1 = new Students("Elius", "BENG23BME", "Male");
        Students S2 = new Students("Esta", "0D21CE", "Female");
        Students S3 = new Students("Ezra", "BENG22EE", "Male");

        // Display initial info
        System.out.println("Program:");
        P.displayProgram();
        System.out.println("---------------------");


        System.out.println("\nStudent One:");
        S1.displayStudents();

        System.out.println("\nStudent Two:");
        S2.displayStudents();

        System.out.println("\nStudent Three:");
        S3.displayStudents();


        // Ask user to input a student name
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter student name to check: ");
        String inputName = sc.nextLine();

        if (inputName.equalsIgnoreCase("Sam")) {
            System.out.println("\nStudent Found:");
            S1.displayStudents();
            System.out.println("\nProgram Info:");
            P.displayProgram();
            System.out.println("\nHe is involved in Machine Learning.");
        } else if (inputName.equalsIgnoreCase("Mery")) {
            System.out.println("\nStudent Found:");
            S2.displayStudents();
            System.out.println("\nProgram Info:");
            P.displayProgram();
            System.out.println("\nHe is not involved in Machine Learning.");
        } else if (inputName.equalsIgnoreCase("Ezra")) {
            System.out.println("Student found");
            S3.displayStudents();
        }
        else
        {
            System.out.println("unknown student:");

        }

        sc.close();
    }
}

