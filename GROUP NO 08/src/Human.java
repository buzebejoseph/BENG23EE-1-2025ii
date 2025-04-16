import java.util.Scanner;
public class Human
{
    String kingdomName;
    String breathing;
    String movements;
    public static void main(String[] args)
    {


        int choice ;
        Scanner sc= new Scanner(System.in);

        System.out.println("Welcome Make a choice\n -----------------");
        System.out.println("Option 1: Male");
        System.out.println("Option 2: Female");
        Human H = new Human();

        choice=sc.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("You have chosen the class Male");
                new Male();
                {
                    Male.displaymale();
                }
                break;
            }
            case 2:
            {
                System.out.println("You have chosen the class Female");
                new Female();
                {
                    Female.displayfemale();
                }
                break;
            }

            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }

    }
}


