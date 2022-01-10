package classObject;

public class Cricket {
	
	private String tournament ;
	private String team ;
	private int player ;
	private int matches ;
	private double points ;
	
	
	public Cricket (String tournament, String team, int player, int matches, double points) {
		
	
		this.tournament = tournament ;
		this.team = team ;
		this.player = player ;
		this.matches = matches ;
		this.points = points ;
		
	}
	
	public String getTournament () {
		return tournament;
	}
	
	public void setTournament (String tournament) {
		
		this.tournament = tournament;
	}
	
	public String getTeam () {
		return team;
	}
	
	public void setTeam (String team) {
		this.team = team;
	}
	
	public int getPlayer () {
		return player;
	}
	

	public void setPlayer (int player) {
		this.player = player ;		
	}
	
	public int getMatches () {
		return matches ;
	}
	
	public void setMatches (int matches) {
		this.matches = matches ;	
	}
	
	public double getPoints () {
		return points ;
	}
	public void setPoints (double points) {
		this.points = points ;
	}
	

	public String toString () {
		return "Tournament: " + tournament + "\nTeam: " + team + "\nPlayers: " + player + "\nMatches: "+ matches + "\nPoints: "+ points;	
	}
	
	
}
