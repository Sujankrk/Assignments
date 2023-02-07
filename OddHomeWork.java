import java.util.Scanner;

public class OddHomeWork {
    public static void main(String[] args) {
        System.out.println("Start of Main");
        Scanner Odd= new Scanner(System.in);
        System.out.println("Your Number");
        int num= Odd.nextInt();
        for (int i=2; i<=num; i++)
        if (i%2!=0){
            System.out.println(+i);


        }
        System.out.println("End of Main");
    }
}
