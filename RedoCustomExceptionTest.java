public class RedoCustomExceptionTest {
    public static void main(String[] args) {
        FootballGame footballGame=new FootballGame("Osumane Dembele", "Europa Cup");
        System.out.println("The Player's name is " +footballGame.nameOfThePlayer+ " and his is in " + footballGame.nameOfTheTournament);

        try {
            footballGame.playerFitness(90f);
        }
        catch (CannotStayOnTheBenchException x){
            System.out.println("Player should be at their best: " );
        }
        catch (PlayerOutForTwoWeeksException x){
            System.out.println("Player cannot return to Squad for at least two weeks ");
        }
        catch (PlayerOutForAMonthException x){
            System.out.println("Player should be fit and can return to squad after a month ");
        }

    }
}
class FootballGame{
    String nameOfThePlayer;
    String nameOfTheTournament;
    float fitness;

    String playerFitness;

    public FootballGame(String nameOfThePlayer, String nameOfTheTournament) {
        this.nameOfThePlayer=nameOfThePlayer;
        this.nameOfTheTournament = nameOfTheTournament;

    }

    @Override
    public String toString() {
        return "FootballGame{" +
                "nameOfThePlayer=" + nameOfThePlayer +
                ", nameOfTheTournament='" + nameOfTheTournament + '\'' +
                '}';
    }

    void playerFitness(float fitness){
        this.fitness = fitness;


        if (fitness>90.00)
            playerFitness= "fitToPlay";
        if (fitness>=75 && fitness<=90)
            playerFitness= "notFitToPlay";
        if (fitness>=60 && fitness<=75)
            playerFitness="needsMedicalCheckUp";
        System.out.println("Player wants to play the tournament....");


        if (fitness>50) {
            CannotStayOnTheBenchException  rte= new CannotStayOnTheBenchException("Player not fit to stay in the bench");
            throw rte;
        }
        else if (fitness>=40 && fitness<50) {
            PlayerOutForTwoWeeksException rte = new PlayerOutForTwoWeeksException("Player not in squad list for two Weeks");
            throw rte;
        }
        else if (fitness<40) {
            PlayerOutForAMonthException rte= new PlayerOutForAMonthException("Player not in squad list for a month");
            throw rte;
        }
        else {
            playerFitness= "fitToPlay";
            System.out.println("Player is fully fit to play");
        }

            }

    }
    class CannotStayOnTheBenchException extends RuntimeException {
        CannotStayOnTheBenchException(String x) {
            super(x);
        }
    }
    class PlayerOutForTwoWeeksException extends RuntimeException {
        PlayerOutForTwoWeeksException (String x){
            super(x);
        }
    }
    class PlayerOutForAMonthException extends RuntimeException{
        PlayerOutForAMonthException (String x){
            super(x);
        }
    }


