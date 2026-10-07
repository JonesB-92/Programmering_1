package Exercise_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Team {
    private String name;
    private ArrayList<Player> players;

    //c) Add to the Team class:
    //– a constructor that initializes name from a parameter and initializes players to an empty
    //ArrayList<Player> object,
    public Team(String name) {
        this.name = name;
        players = new ArrayList<>();
    }

    //– a toString() method that prints “Team(A-team)” for a team named A-team.
    @Override
    public String toString() {
        return "Team(" + name + ")";
    }

    //– get methods for name and players
    public String getName() {
        return this.name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    //a method void addPlayer(Player p) that adds a player to the ArrayList of players,
    public void addPlayer(Player p) {
        players.add(p);
    }

    //– a method void printPlayers() that prints the name, the age and the score for
    //all players with one player on each line (use a for-each loop),
    public void printPlayers() {
        System.out.println("Player stats: ");
        int i = 1;
        for (Player player : players) {
            System.out.println(i + ": " + player.toString());
            i++;
        }
    }

    //a method double calcAverageAge() that returns the average age of all the players (use a for-each loop),
    public double calcAverageAge() {
        double ageOfEa = 0;
        for (Player player : players) {
            ageOfEa += player.getAge();
        }
        double averageAge = ageOfEa / players.size();

        return averageAge;
    }

    //– a method int calcTotalScore() that returns the total score of all players (use a for-each loop),
    public int calcTotalScore() {
        System.out.println("The total score of the current team is: ");
        int totalScore = 0;
        for (Player player : players) {
            totalScore += player.getScore();
        }
        return totalScore;
    }

    //– a method int calcOldPlayersScore(int ageLimit) that returns the total score of players older than ageLimit
    public int calcOldPlayersScore(int ageLimit) {
        int totalScore = 0;
        for (Player player : players) {
            if (player.getAge() > ageLimit) {
                totalScore += player.getScore();
            }
        }
        return totalScore;
    }

    //– a method int maxScore() that returns the highest score obtained by any player
    public int maxScore() {
        int maxScore = 0;
        for (Player player : players) {
            if (player.getScore() > maxScore) {
                maxScore = player.getScore();
            }
        }
        return maxScore;
    }

    public int maxScoreAuto() {
        ArrayList<Integer> goals = new ArrayList<>();
        for (Player player : players) {
            goals.add(player.getScore());
        }
        int maxScore = Collections.max(goals);
        return maxScore;
    }

    //– a method ArrayList<String> bestPlayerNames() that returns an ArrayList with the names of the players with the highest score (use a for-each loop).
    public ArrayList<String> bestPlayerNames() {
        //Finder først min maxScore vha tidligere loop
        int maxScore = 0;
        for (Player player : players) {
            if (player.getScore() > maxScore) {
                maxScore = player.getScore();
            }
        }
        ArrayList<String> bestPlayers = new ArrayList<>();
        for (Player player : players) {
            if (player.getScore() >= maxScore) {
                bestPlayers.add(player.getName());
            }
        }
        return bestPlayers;
    }

    //ELLER
    public ArrayList<String> bestPlayerNamesOptimised() {
        int maxScore = 0;
        ArrayList<String> listOfBestPlayers = new ArrayList<>();

        for (Player player : players) {
            System.out.println(player.getName() + " has " + player.getScore() + " goals!");
            //Første betingelse:
            if (player.getScore() > maxScore) {
                maxScore = player.getScore();
                listOfBestPlayers.clear();
                listOfBestPlayers.add(player.getName());
                System.out.println(player.getName() + " has the highscore and is added to the list!");
                //Anden betingelse
            } else if (player.getScore() == maxScore) {
                listOfBestPlayers.add(player.getName());
                System.out.println(player.getName() + " with matches the highscore and is added to the list!");
            } else {
                System.out.println(player.getName() + " didn't make the list, foh");
            }
        }
        return listOfBestPlayers;
    }

    public static void main(String[] args) {

        Player player1 = new Player("Ib", 22);
        Player player2 = new Player("Hans", 25);
        Player player3 = new Player("Jens", 21);
        Player player4 = new Player("Frank", 26);
        Player player5 = new Player("CC", 30);

        System.out.println(player1.toString()); //Override gør det unødvendigt at kalde to.String metoden!!
        System.out.println(player1);

        Team teamEasyOn = new Team("EasyOn");

        System.out.println("\n" + teamEasyOn);
        System.out.println(teamEasyOn.getName());
        System.out.print(teamEasyOn.getPlayers() + " (.getPlayers på en tom arraylist)\n");

        /* System.out.println(teamEasyOn.printPlayers());*/ //VIRKER IKKE, fordi sout kun kan printe noget
        // med en værdi, som f.eks. en String! Da printPlayers er void, returnerer den ingen værdi.
        System.out.println();
        teamEasyOn.printPlayers(); //Derfor kalder vi den således.
        System.out.println("(Indtil videre ingen players i, så den printer kun 'player stats')\n");

        //AddPlayer
        teamEasyOn.addPlayer(player1);
        teamEasyOn.addPlayer(player2);
        teamEasyOn.addPlayer(player3);
        teamEasyOn.addPlayer(player4);
        teamEasyOn.addPlayer(player5);
        System.out.println(".getPlayers efter at have tilføjet players = " + teamEasyOn.getPlayers() + "\n");
        teamEasyOn.printPlayers();

        //Average age
        System.out.println("\nThe average age of the team is: " + teamEasyOn.calcAverageAge() + "\n");

        //Total score inden loop:
        System.out.println(teamEasyOn.calcTotalScore() + "\n");
        System.out.println("The total score for players above ageLimit (24) " + teamEasyOn.calcOldPlayersScore(24) + "\n");
        System.out.println("Highest score on the team: " + teamEasyOn.maxScore());
        System.out.println("MaxScoreAuto method = " + teamEasyOn.maxScoreAuto() + "\n");

        //For ea loop der assigner random tal mellem 0 og 6 til score for alle spillere?
        //Her med Random object
        Random random = new Random();
        for (Player player : teamEasyOn.players) {
            int randomScore = random.nextInt(0, 7);
            player.setScore(randomScore);
        }

        System.out.println("Giver alle spillere et random antal mål med et for each loop og tester: ");
        teamEasyOn.printPlayers();
        //Total score efter loop
        System.out.println(teamEasyOn.calcTotalScore());
        System.out.println("The total score for players above ageLimit (24) " + teamEasyOn.calcOldPlayersScore(24));
        System.out.println("Highest score on the team: " + teamEasyOn.maxScore());
        System.out.println("MaxScoreAuto method = " + teamEasyOn.maxScoreAuto());


        //For ea loop med random object INDE i loopet, som ifølge GPT kan give de samme tal
        for (Player player : teamEasyOn.players) {
            Random random1 = new Random();
            int randomScore = random1.nextInt(0, 7);
            player.setScore(randomScore);

            /**ELLER
             player.setScore(new Random().nextInt(7));*/
        }


        System.out.println();
        teamEasyOn.printPlayers();
        //Total score efter loop
        System.out.println(teamEasyOn.calcTotalScore());
        System.out.println("The total score for players above ageLimit (24) " + teamEasyOn.calcOldPlayersScore(24));
        System.out.println("Highest score on the team: " + teamEasyOn.maxScore());
        System.out.println("MaxScoreAuto method = " + teamEasyOn.maxScoreAuto());


        //ELLER med Math.random:
        for (Player player : teamEasyOn.players) {
            int randomScore = (int) (Math.random() * 7);
            player.setScore(randomScore);
        }

        System.out.println();
        teamEasyOn.printPlayers();
        //Total score efter loop
        System.out.println(teamEasyOn.calcTotalScore());

        //OldLimitScore
        System.out.println("\nThe total score for players above ageLimit (24) " + teamEasyOn.calcOldPlayersScore(24));

        //Maxscore
        System.out.println("Highest score on the team: " + teamEasyOn.maxScore());
        System.out.println("MaxScoreAuto method = " + teamEasyOn.maxScoreAuto());

        //List of best players
        System.out.println("-------------");
        System.out.println(teamEasyOn.bestPlayerNames());
        System.out.println(teamEasyOn.bestPlayerNamesOptimised());


    }
}
