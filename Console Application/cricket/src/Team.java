
public class Team {
	private String Tname,
	teamName;
	
	Player[] p= new Player[11];
	private int score;
	
	Team(String Tname,String[] str){
		this.teamName = Tname;
		this.Tname = "Team "+Tname;
		
		for(int i=0 ; i<str.length ; i++) 
				p[i] = new Player(str[i]);
	
		
	}
	
	void setScore(int  scores) {
		this.score += scores;
	}
	
	int getScore() {
		return score;
	}
	
	String getTeamName() {
		return teamName;
	}
	
	String get_Tname() {
		return Tname;
	}
	
	
	
	void display() {
		System.out.println("\n-------------------------Batting Report--------------------------\n");
		System.out.printf("%35s",Tname);
		System.out.println("\n-----------------------------------------------------------------\n");
		System.out.println("   Player Name           | Runs |  Balls | Fours |  Sixs |  S/R  |");
		
		for(Player play : p)
			play.bat_display();
		
		System.out.println("\n__________________________________________________________________\n");
		System.out.printf("\n                                                    Total : %d",score);
		System.out.println("\n__________________________________________________________________\n");
		
	}
	
	void bowl_display() {
		System.out.println("\n-------------------------Bowling Report---------------------------\n");
		System.out.printf("%35s",Tname);
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Player Name               | overs | Runs_Given | wickets | extras |");
		
		for(int i= 6 ; i<=10 ; i++)
			p[i].bowl_display();
		
		System.out.println("\n____________________________________________________________________\n");
	}
	
	
	void win() {
		System.out.println("___________________________                  _________________________");
		System.out.println("___________________________"+Tname+" WINS!!!!_________________________");
	}
	
}
