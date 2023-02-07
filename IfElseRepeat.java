public class IfElseRepeat {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 8;
        System.out.println("Begin with the Main");
        if (a > b && a>c) {
            System.out.println("A is higher");
        }
        else if (b>a && b>c) {
            System.out.println("B is higher");
        }
        else {
            System.out.println("C is greater than A and B");
            System.out.println("End of Main");
        }

    }
}



