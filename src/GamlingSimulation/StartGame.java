package GamlingSimulation;

public class StartGame {
        public StartGame() {
            System.out.println("Welcome to Gambling Simulation Problem Program");
            System.out.println();
            System.out.println("Gambler starts the game...**");
        }
        //Declaring constants
        final int betMoney = 1;
        final int stakePerDay = 100;
        public static void main(String[] args) {
            //Initialize the object.
            StartGame gambling = new StartGame();
            System.out.println();
            //Declaring variables
            int stake = 0;
            stake = stake + gambling.stakePerDay;
            System.out.println("Initial stake of Gambler is : "+gambling.stakePerDay);
            System.out.println("Initial betting money in gambling is : "+gambling.betMoney);


        }
    }

