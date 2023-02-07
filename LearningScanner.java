import java.util.Scanner;

public class LearningScanner {
    public static void main(String[] args) {
        System.out.println("Players");
        System.out.println("............");
        System.out.println("1. Lionel Messi");
        System.out.println("2. Cristiano Ronaldo");
        System.out.println("3. Neymar Jr.");
        System.out.println("4. Kilyan Mbappe");
        System.out.println("5. Christian Pulisic");
        Scanner scanner= new Scanner(System.in);
        int choice= scanner.nextInt();

        switch (choice)
        {
            case 1:
            System.out.println("My favourite player is Messi");
                break;
            case 2:
                System.out.println("My favourite player is Ronaldo");
                break;
            case 3:
                System.out.println("My favourite player is Neymar");
                break;
            case 4:
                System.out.println("My favourite player is Mbappe");
                break;
            case 5:
                System.out.println("My favourite palyer is Pulisic");
                break;
            default:
                System.out.println("I don't have any favourites. I don't like football");


        }
    }

}
