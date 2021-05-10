package generics.challenge;

import java.util.ArrayList;
import java.util.Collections;

public class League <T extends Team> {
    private String name;
    private ArrayList<T> league;

    public League(String name) {
        this.name = name;
        this.league =  new ArrayList<>();
    }

    public boolean addTeam(T team) {
        if(!league.contains(team)) {
            league.add(team);
            return true;
        }
        return false;
    }

    public void showLeagueTable() {
        Collections.sort(league);
        for (T t : league) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }

}
