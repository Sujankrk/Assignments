import java.util.Scanner;

public class EvenHomeWork {
    public static void main(String[] args) {
        System.out.println("Start of Main");
        Scanner Even= new Scanner(System.in);
        System.out.println("Your Even Numbers are: ");
        int num= Even.nextInt();
        for (int i=3; i<=30; i++)
            if (i%2!=0){
            System.out.println(+i);


        }
        System.out.println("End of Main");
    }

}
