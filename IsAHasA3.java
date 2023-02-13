public class IsAHasA3 {
    public static void main(String[] args) {
        ImmigrationLawyer immigrationLawyer=new ImmigrationLawyer();
        immigrationLawyer.advocatesLaw();
        immigrationLawyer.winCases();
        immigrationLawyer.forms();
        immigrationLawyer.winCases();
        immigrationLawyer.hearings();
        immigrationLawyer.filesPetition();

        System.out.println(".......................................");

        immigrationLawyer.lawDegree.certification();
        immigrationLawyer.lawDegree.nameOfLawyer();
        immigrationLawyer.lawDegree.dateOfCompletion();

        System.out.println(".........................................");



    }
}
class Lawyer{
    void advocatesLaw(){
        System.out.println("Lawyers advocate law");
    }
    void winCases(){
        System.out.println("Lawyers win your cases");
    }

}
class ImmigrationLawyer extends Lawyer{
    LawDegree lawDegree= new LawDegree();
    void forms(){
        System.out.println("Immigration lawyer helps you complete Immigration Forms");
    }
    void filesPetition(){
        System.out.println("Immigration lawyer files Immigration Petition");
    }
    void hearings(){
        System.out.println("Immigration lawyer attends court hearings");
    }


}
class LawDegree{
    void certification (){
        System.out.println("Law Degree has a certification authorities seal, stamps and signatures");
    }
    void nameOfLawyer (){
        System.out.println("Law Degree has a name of lawyer");
    }
    void dateOfCompletion (){
        System.out.println("Law Degree has a completion date");
    }
}
