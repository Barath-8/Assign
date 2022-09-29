import java.util.*;

public class Match{
	
	Team play[]= new Team[2];
	
	Match(Team t1,Team t2){
		play[0]=t1;
		play[1]=t2;
	}
	
	
	
	
	void Start(){

		Scanner sc = new Scanner(System.in);
		
		String order[] = {"First","Second"};
		
		int choice =2;
		
		while(choice !=1 && choice !=0) {
		System.out.println("Choose your Team  \n  1."+play[0].get_Tname() + "\n  2."+play[1].get_Tname());
		choice = sc.nextInt()-1;
		
		}		
		int currBat =choice,
			currBowl= (choice==1)? 0:1;
		
		int temp ;
		Random random =new Random();
		boolean toss = random.nextBoolean();
		
		if(toss)
			System.out.println("Your Team won by "+play[currBat].get_Tname() );
		else {
			System.out.println("Better Luck Next Time :)");
			System.out.println("Toss won by "+play[currBowl].get_Tname());
			//Swap(currBat,currBowl);
			temp = currBat;
			currBat= currBowl;
			currBowl =temp;
			
		}
		System.out.println("\nPress any key to continue.....");
		sc.next();
	
	
	for(int inn=0 ; inn<=1 ;inn++) {

		Team batting = play[currBat];
		Team bowling = play[currBowl];
	
	int strike  =0,
		nonStrike  =1,
		bowl =6,
		over =0,
		ball =0,
		out  =0;
	
	while( over <5 &&out<=9 ) {
		boolean noBall=false;
		ArrayList<String> currOver = new ArrayList<>();
		
		Player bowler = bowling.p[bowl];
		
		for(ball =0 ; ball<6&&out<=9 ; ball++) {

			Player  striker = batting.p[strike],
					nonStriker = batting.p[nonStrike];
	
			System.out.println("\n\n\n\n\n\n\n\n\n");
			
			System.out.println(batting.getTeamName() + "  ("+batting.getScore()+"/"+over+"."+ball+")");
			System.out.printf("\n%-20s%d",striker.getName(),striker.getRuns());
			System.out.printf("\n%-20s%d",nonStriker.getName(),nonStriker.getRuns() );
			System.out.println("\n\tTotal : " + batting.getScore() +"/"+out);
			System.out.printf("\n%-18sOver: %d.%d/5	\n",bowler.getName(),over,ball);
			System.out.println(currOver);
			
			String run = sc.next();
			
			if(run.equalsIgnoreCase("out") || run.equalsIgnoreCase("o")) {
				if(noBall) {
					noBall = false;
					continue;
				}
				
				if(out<9) {
				strike++;
				if(strike == nonStrike)
					strike++;
				}
				
				out++;
				currOver.add("Out");
				bowler.setWicket(1);
				
				if(out > 9 ) break;
			
			}else if(run.equalsIgnoreCase("noball") || run.equalsIgnoreCase("wide") || run.equalsIgnoreCase("nb") || run.equalsIgnoreCase("w")) {
				
				ball--;
				batting.setScore(1);
				if(run.equalsIgnoreCase("noball")) {
					currOver.add("NB");
					noBall = true;
				}else
					currOver.add("W");
				
				bowler.set_extras(1);
				
			}else if(run.charAt(0) >= '0' && run.charAt(0) <='6' &&run.charAt(0) !='5') {
				
				int r = run.charAt(0)-'0';
				striker.setRun(r);
				batting.setScore(r);
				bowler.set_bowlRun(r);
								
				currOver.add(String.valueOf(r));
				
				if(r == 1 || r==3) {
					temp = strike;
					strike= nonStrike;
					nonStrike=temp;
				}
				
			}else {
				ball--;
				System.out.println("Wrong input");	
			}
			if(batting.getScore() > bowling.getScore() && inn==1) break;
		
		}
		
		
		bowler.set_over(1);
		
		if(batting.getScore() > bowling.getScore() && inn==1) break;
		bowl++;
		over++;
		
		if(bowl >10)
			bowl=6;
		
		temp = strike;
		strike= nonStrike;
		nonStrike=temp;
	
		}
	
	System.out.println("\n\n\n\n\n\n\n\n\n");

	System.out.println(order[inn] + " Innings Over------ ");
	
	System.out.println(batting.p[strike].name +"\t\t" +batting.p[strike].getRuns());
	System.out.println(batting.p[nonStrike].name + "\t\t"+ batting.p[nonStrike].getRuns());
	
	System.out.println("\n\tTotal : " + batting.getScore() +"/"+out);
	System.out.println("\n"+bowling.p[bowl].name + "\tover : " + over+"."+ball%6+"/5");
	
	System.out.println("\n\n\n");
	batting.display();
	System.out.println("\n\n");
	bowling.bowl_display();
	
	System.out.println("Press Any key to start....");
	sc.next();
	
	temp = currBat;
	currBat= currBowl;
	currBowl =temp;
	
	
		}
	
	getResult();
	
	sc.close();
	
	}
	
	void getResult() {
		if(play[0].getScore() > play[1].getScore())
			play[0].win();
		else if(play[1].getScore() > play[0].getScore())
			play[1].win();
		else
			System.out.println("Its a DRAW!!!");
	}
}
