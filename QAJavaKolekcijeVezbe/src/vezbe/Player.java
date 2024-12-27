package vezbe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player implements Comparable<Player> {
	
	private int ranking;
	private String name;
	private int age;
	
	public Player(int ranking,String name,int age) {
		this.ranking=ranking;
		this.name=name;
		this.age=age;
		
		
	}
	
	public int getRanking() {
		return this.ranking;
	}
	
	public void setRanking(int rank) {
		this.ranking=rank;
		
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	
	}
	
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge (int age) {
		this.age=age;
	}

	@Override
	public int compareTo(Player o) {
		
		return Integer.compare(this.getRanking(), o.getRanking());
	}
	
	@Override
	public String toString() {
		return "Name: "+this.getName()+" Age: "+this.getAge()+" Ranking: "+this.getRanking();
	}
	
	public static void main(String[] args) {
		
		
		List<Player>footballTeam = new ArrayList<Player>();
		Player p1 = new Player(23, "Nenad", 25);
		Player p2 = new Player(17, "Pajo", 27);
		Player p3 = new Player(34, "Nikola", 23);
		footballTeam.add(p1);
		footballTeam.add(p2);
		footballTeam.add(p3);
		
		System.out.println("Before sorting: "+footballTeam);
		
		Collections.sort(footballTeam);
		
		System.out.println("After sorting: "+footballTeam);
	}
}
