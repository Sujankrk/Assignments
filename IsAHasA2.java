public class IsAHasA2 {
    public static void main(String[] args) {
    ChampionsLeague CL= new ChampionsLeague();
    CL.playMatches();
    CL.trophy();

    CL.teams.enterTopFourInLeague();


    }
}
class FootballLeague{

    void playMatches(){
        System.out.println("Football Teams plays matches.....");
    }

}
class ChampionsLeague extends FootballLeague{
    FootballTeams teams=new FootballTeams();
    void trophy(){
        System.out.println("Winners of the Champions league win trophy");
    }
}
class FootballTeams{
    String Players;
    String TeamNames;
    String Coach;

    void enterTopFourInLeague(){
        System.out.println("Football Team has to be in top four of their leagues to enter the Champions League");
    }

}
