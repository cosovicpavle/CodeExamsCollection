package exceptionsAndFiles;

public class FootballGame implements IFootball {
	
	
	private String homeTeam;
	private String visitingTeam;
	private String date;
	private int homeTeamScore;
	private int visitingTeamScore;
	private String stadium;
	
	
	
		

	
	
	public void homeTeamScored() {
		homeTeamScore++;
		System.out.println(this.homeTeam+" have a chance!!! ");
		System.out.println(this.homeTeam+" scored!!!");
	}
	public void visitingTeamScored() {
		visitingTeamScore++;
		System.out.println(this.visitingTeam+" have a chance!!! ");
		System.out.println(this.visitingTeam+" scored!!!");
		
		
	}

	@Override
	public void setHomeTeam(String team) {
		this.homeTeam=team;
		
		
	}

	@Override
	public void setVisitingTeam(String team) {
		this.visitingTeam=team;
		
	}

	@Override
	public String result() {
		
		return this.homeTeam+" "+this.homeTeamScore+" : "+this.visitingTeamScore+" "+this.visitingTeam+" Stadium: "+this.stadium;
	}

	@Override
	public void setEventDate(String date) {
		this.date=date;
		
	}
	
	public void goalChance() {
		double chance=Math.random();
		
		if(chance>=0 && chance<0.1) {
			homeTeamScored();
		}else if(chance>=0.5 && chance<0.6) {
			visitingTeamScored();
			
		}else if(chance>=0.1 && chance<0.2) {
			System.out.println(this.homeTeam+" has a big chance but goalkeeper saved it");
			
			
		}else if(chance>=0.6 && chance<0.7) {
			System.out.println(this.visitingTeam+" had a big chance but goalkeeper saved it");
			
		}else {
			System.out.println("That shot went far from the goal");
		}
		
		
	}
	
	public void firstHalf() {
		
		for(int i =0;i<5;i++) {
			goalChance();
			
		}
		
	}
	public void secondHalf() {
		for(int i =0;i<6;i++) {
			goalChance();
		}
		
	}
	
	public void setStadium(String stadium) {
		this.stadium=stadium;
		
	}
	
	public void HalfTimeScore() {
		System.out.println(this.homeTeam+" "+this.homeTeamScore+" : "+this.visitingTeamScore+" "+this.visitingTeam+" Stadium: "+this.stadium);
		
	}

}
