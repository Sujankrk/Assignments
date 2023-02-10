public class InheritanceLearning {
    public static void main(String[] args) {
        FCBarcelona L1= new FCBarcelona(20,  17);
        L1.printFCBarcelona();
        System.out.println("..............");

        LaLiga L2= new LaLiga(20,17,3);
        L2.printLaLiga();
        System.out.println("................");





    }
}
class FCBarcelona {
    int matchPlayed;
    int matchWon;

    public FCBarcelona(int matchPlayed, int matchWon) {
        System.out.println("Match Record)....");
        this.matchPlayed=matchPlayed;
        this.matchWon=matchWon;

    }

    void printFCBarcelona() {
        System.out.println("FC Barcelona played " + matchPlayed + "  matches and won " + matchWon+ " of them");
    }
}
   class LaLiga extends FCBarcelona {
    int matchLost;
       public LaLiga(int matchPlayed, int matchWon, int matchLost) {
           super(matchPlayed, matchWon);
           this.matchLost=matchLost;
       }
       void printLaLiga(){
           System.out.println("FC Barcelona Played " +matchPlayed+ " matches, won" +matchWon+ " matches and lost " +matchLost+  " matches");
       }
   }




