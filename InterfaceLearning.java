public class InterfaceLearning {
    public static void main(String[] args) {
        Legislative1 legislative= new Legislative1();
        Executive1 executive= new Executive1();
        Judiciary judiciary= new Judiciary();
        Police police= new Police();
        Criminal criminal= new Criminal();

        legislative.law();
        executive.law();
        judiciary.law();
        police.law();
        criminal.law();
    }
}
interface Laws{
    void law();


}
class ConstitutionBranch{

}
class Citizen{

}
class Legislative1  extends ConstitutionBranch implements Laws{

    public void law(){
        System.out.println("Legislative1 is the branch of constitution that makes law");
    }
}
class Executive1 extends ConstitutionBranch implements Laws {

    public void law() {
        System.out.println("Executive1 is the branch of constitution that implements the law made by Legislative");

    }

}
class Judiciary extends ConstitutionBranch implements Laws{

    public void law(){
        System.out.println("Judiciary is the branch of constitution that evaluates law");
}

}
class Police extends Citizen implements Laws{
    public void law(){
        System.out.println("Police catches citizen who do not abide by the law");
}

}
class Criminal extends Citizen implements Laws{
    public void law() {
        System.out.println("Criminal gets punished for the crimes they committed");
    }
}