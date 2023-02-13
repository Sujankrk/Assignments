public class IsAHasA {
    public static void main(String[] args) {Mineral mineral=new Mineral();
       Protein protein=new Protein();
       protein.strength();

       protein.formula.balancesTheChemicalElement();

    }

}
class Mineral{

    void strength(){
        System.out.println("Minerals give strength");

    }

}
class Protein extends Mineral{


    ChemicalFormula formula= new ChemicalFormula();

    void buildMuscle(){
        System.out.println("Protein builds muscle");

    }
}
class ChemicalFormula{

    String Sodium;
    String Chloride;

    void balancesTheChemicalElement(){
        System.out.println("Formula balances the chemical elements in the protein");

    }

}