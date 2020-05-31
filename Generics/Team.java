package Generics;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
	private String name;
	int played = 0; 
	int won = 0;
	int tied = 0;
	int lost = 0;
	
	private ArrayList<T> members = new ArrayList<>();

	public Team(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public boolean addPlayer(T player) {
		if(members.contains(player)) {
			System.out.println(player.getName()+" is already on team");
			return false;
		}else {
			members.add(player);
			System.out.println(player.getName()+" picked for the team "+this.name);
			return true;
		}
	}
	public int numberOfPlayers() {
		return this.members.size();
	}
	public void matchResults(Team oponent, int oponentScore, int ourScore) {
		String msg;
		if(ourScore > oponentScore) {
			won++;
			msg =" beat ";
		}else if(ourScore == oponentScore) {
			tied++;
			msg = " tied with ";
		}else {
			lost++;
			msg = " lost to ";
		}
		played++;
		if(oponent != null) {
			System.out.println(this.getName() + msg + oponent.getName());
			oponent.matchResults(null, oponentScore, ourScore);	
		}
	}
	public int ranking() {
		return ((won*2) + tied);
	}

	@Override
	public int compareTo(Team<T> team) {
		if(this.ranking() > team.ranking()) {
			return -1;
		}else if(this.ranking() < team.ranking()) {
			return 1;
		}else {
			return 0;
		}
	}
	
	

}
