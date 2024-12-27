package model;

public class FootballGame implements IFootBall {
	
	private String stadium;
	private int homeTeamScore;
	private int visitingTeamScore;
	public String date;
	public String homeTeam;
	public String visitingTeam;
	
	public FootballGame(String stadium) {
		this.stadium=stadium;
		this.homeTeamScore=0;
		this.visitingTeamScore=0;
		
	}
	
	
	public void homeTeamScored() {
		
		this.homeTeamScore++;
		
	}
	public void visitingTeamScored() {
		
		this.visitingTeamScore++;
	}
	

	@Override
	public void setHomeTeam(String homeTeam) {
		this.homeTeam=homeTeam;
		
		
	}

	@Override
	public void setVisitingTeam(String visitingTeam) {
		this.visitingTeam=visitingTeam;
		
	}

	@Override
	public String result() {
		
		return "Result: H: "+homeTeamScore+" : V: "+visitingTeamScore;
	}

	@Override
	public void setEventDate(String date) {
		this.date=date;
		
	}
	@Override
	public String toString() {
		
		return "Stadium: "+this.stadium+"\nDate: "+this.date+"\nHome team: "+this.homeTeam+"\nVisitingTeam: "+this.visitingTeam+"\n"+this.result();
	}
	public static void main(String []args) {
		
		FootballGame f =  new FootballGame("Santiago Bernabeu");
		f.setHomeTeam("Real Madrid");
		f.setVisitingTeam("Barselona");
		
		f.setEventDate("3.05.2023");
		
		
		System.out.println("Match Start!");
		System.out.println(f);
		f.visitingTeamScored();
		System.out.println(f);
		f.homeTeamScored();
		System.out.println(f);
		f.visitingTeamScored();
		System.out.println(f);
		
		System.out.println("Match End!");
		
		
		
		
	}

}
