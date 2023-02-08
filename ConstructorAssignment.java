public class ConstructorAssignment {
        public static void main(String[] args) {
            FootballJersey Jersey1 = new FootballJersey("FCBarcelona", 'M', 99.99);
            FootballJersey Jersey2 = new FootballJersey("LiverpoolFC", 'L', 89.99);
            FootballJersey Jersey3 = new FootballJersey("Paris Saint Germain", 'S', 109.99);

            Jersey1.printFootballJersey();
            Jersey2.printFootballJersey();
            Jersey3.printFootballJersey();

            Jersey1.priceIncrease(19.00);
            Jersey2.priceIncrease(11.00);
            Jersey3.priceIncrease(8.00);

            Jersey1.printFootballJersey();
            Jersey2.printFootballJersey();
            Jersey3.printFootballJersey();

            Jersey1.discount(9.99);
            Jersey2.discount(4.99);
            Jersey3.discount(11.99);

            Jersey1.printFootballJersey();
            Jersey2.printFootballJersey();
            Jersey3.printFootballJersey();
        }
    }
    class FootballJersey{
        private String teamJerseyName;
        private char jerseySize;
        private double jerseyPrice;
        FootballJersey( String teamJerseyName, char jerseySize, double jerseyPrice) {
            System.out.println("Constructor is setting the Jersey details...");

            this.teamJerseyName = teamJerseyName;
            this.jerseySize = jerseySize;
            this.jerseyPrice = jerseyPrice;
        }
        void printFootballJersey(){
            System.out.println("The Team Jersey Name is " +teamJerseyName);
            System.out.println("The Jersey Size is "  +jerseySize);
            System.out.println("The Jersey Price is " +jerseyPrice);
            System.out.println("..................................");
        }
        void discount (double discountAmount){
            System.out.println("The Discounted Price is...... " +discountAmount);
            jerseyPrice=jerseyPrice-discountAmount;
        }
        void priceIncrease (double amountToIncrease){
            System.out.println("The Increased Price is....." +amountToIncrease);
            jerseyPrice=jerseyPrice+amountToIncrease;

        }
    }

