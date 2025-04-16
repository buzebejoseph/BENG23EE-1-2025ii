import java.util.Scanner;
public class Female {
    /**
     *
     */
    public static String Name;
    static String Voice;
    static String Gender;

    Female(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name of the Female");
        Name=sc.nextLine();
        System.out.println("Enter the voice of the Female");
        Voice=sc.nextLine();
        System.out.println("Enter the gender of the Female");
        Gender=sc.nextLine();
    }
    static void displayfemale()
    {
        System.out.println("Name:"+Name);
        System.out.println("Voice:"+Voice);
        System.out.println("Gender:"+Gender);
    }
}


