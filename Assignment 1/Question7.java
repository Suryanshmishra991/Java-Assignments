import java.util.*;

class Team {
    protected String name;
    protected int matchesPlayed;
    protected int wins;
    protected int draws;

    public Team(String name, int matchesPlayed, int wins, int draws) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.wins = wins;
        this.draws = draws;
    }

    public int calculatePoints() {
        return 0;
    }
}

class CricketTeam extends Team {
    public CricketTeam(String name, int matchesPlayed, int wins, int draws) {
        super(name, matchesPlayed, wins, draws);
    }

    public int calculatePoints() {
        return wins * 2 + draws;
    }
}

class FootballTeam extends Team {
    public FootballTeam(String name, int matchesPlayed, int wins, int draws) {
        super(name, matchesPlayed, wins, draws);
    }

    public int calculatePoints() {
        return wins * 3 + draws;
    }
}

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            String[] data = sc.nextLine().split(",");

            String sport = data[0];
            String name = data[1];

            int matches = Integer.parseInt(data[2]);
            int wins = Integer.parseInt(data[3]);
            int draws = Integer.parseInt(data[4]);

            Team team;

            if (sport.equalsIgnoreCase("Cricket")) {
                team = new CricketTeam(name, matches, wins, draws);
            } else {
                team = new FootballTeam(name, matches, wins, draws);
            }

            System.out.println(
                "Team: " + name +
                " (" + sport + ") Points: " +
                team.calculatePoints()
            );
        }

        sc.close();
    }
}