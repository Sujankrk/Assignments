public class CalculateSIAndCI {
    public static void main(String[] args) {
        Calculate Interest1= new Calculate();
        Interest1.calculateSimpleInterest(30000,3, 3.3f);

        Interest1.calculateCompoundInterest();
    }
}
class Calculate {
    void calculateSimpleInterest(int p, int n, float r) {
        float si = (p * n * r) / 100;
        System.out.println("The Simple Interest is: " + si);

    }

    void calculateCompoundInterest() {
        int p = 30000;
        float r = 3f; //rate of interest
        int n = 3;
        int t = 12; //time in years
        double ci = p * (1 + 3 / 3) ^ (3 * 12);
        System.out.println("The Compound Interest is: " + ci);


    }
}


