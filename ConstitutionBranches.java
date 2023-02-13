public class ConstitutionBranches {
    public static void main(String[] args) {
        Legislative legislative=new Legislative("make laws");
        legislative.makeLaws();

        Executive executive=new Executive("make laws", "implement laws");
        executive.implementLaws();

        Judicial judicial= new Judicial("make laws", "implement laws", "evaluate laws");
        judicial.evaluateLaws();
    }
}
class Legislative{
    String function1;
    public Legislative (String function1){
        this.function1=function1;
        }
        void makeLaws(){
            System.out.println("Legislative is a first branch oof Constitution and its function is to " +function1);
    }
}
class Executive extends Legislative {
    String function2;
    public Executive(String function1, String function2) {
        super(function1);
        this.function2=function2;
    }
    void implementLaws(){
        System.out.println("Executive is a second branch of Constitution and its function is to " +function2+ " made by Legislative");

    }
}
class Judicial extends Executive{
    String function3;

    public Judicial(String function1, String function2, String function3) {
        super(function1, function2);
        this.function3=function3;
    }
    void evaluateLaws(){
        System.out.println("Judicial is a third branch of Constitution and its function is to " +function3+ "evaluate the laws implemented by Executive");
    }
}
