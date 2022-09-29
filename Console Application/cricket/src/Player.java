
public class Player {
	String name;
	private int runs,six,fours,ball;
	private int strikeRate,wicket,bowlRun,over,extras;
	
	boolean isCap =false;
	
	Player(String name){
		this.name = name;
	}
	
	Player(String name , boolean Cap){
		this.name = name+" (C)";
	}
	
	void setRun(int run) {
		
		ball++;
		runs  += run;
		if(run == 6)
			six++;
		if(run == 4)
			fours++;
	}
	
	int getRuns() {
		return runs;
	}
	
	String getName() {
		return name;
	}
	
	void setWicket(int wick) {
		wicket += wick;
	}
	
	void set_bowlRun(int runs) {
		bowlRun += runs;
	}
	
	void set_over(int over) {
		this.over += over;
	}
	
	void set_extras(int extra) {
		extras+=extra;
	}
	
	
	
	void out(int ball ) {
		this.ball = ball;
		
	}
	
	void bat_display() {
		strikeRate = (ball>0)? (runs/ball)*100: 0; 
		System.out.printf("\n%-25s|   %-3d|   %-3d  |   %-3d |   %-3d |   %-3d |",
										name,runs,ball,fours,six,strikeRate);
	}
	
	void bowl_display() {
		System.out.printf("\n%-25s|    %-3d |     %-3d  |    %-3d  |    %-3d  |",
										name,over,bowlRun,wicket,extras);
	}
	
}
