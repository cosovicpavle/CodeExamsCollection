package vezbe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlayerRankingComparator implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		
		return Integer.compare(o1.getRanking(), o2.getRanking());
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
		
		Comparator<Player> c = new PlayerRankingComparator();
		Collections.sort(footballTeam, c);
		
		System.out.println("After sorting: "+footballTeam);
		
		
	}

}
