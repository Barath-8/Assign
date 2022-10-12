import java.util.Scanner;

public class DaysCalci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int year1,mnt1,day1,
			year2,mnt2,day2;
		
		System.out.println("Enter From date with space separation (dd/mm/yyyy):");
		day1=sc.nextInt();
		mnt1=sc.nextInt();
		year1=sc.nextInt();
		
		System.out.println("Enter To date with space separation (dd/mm/yyyy):");
		day2=sc.nextInt();
		mnt2=sc.nextInt();
		year2=sc.nextInt();
		
		
		int dayCount =0 ;
		
		int year=year1;
		
		//to get in between days with year count
		
		while(year <year2) {   
			if(year%100==0 &&year%400!=0 )
				dayCount+=365;
			else if(year%4==0)
				dayCount+=366;
			else
				dayCount+=365;
			
			year++;
		}
		
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int start = 0;
		for(int i=0 ; i<mnt1-1 ; i++) {
			start+=months[i];
		}
		
		start+=day1;// got the not needed days to substract from dayCount
		
		if((year1%4==0 &&year1%100!=0)||(year1%100==0 && year1%400==0))
			start+=1 ;
			
		int last = 0;
		for(int i=0 ; i<mnt2-1 ; i++) {
			last+=months[i];
		}
		
		last+=day2;
		
		if((year2%4==0 &&year2%100!=0)||(year2%100==0 && year2%400==0))
			last+=1;
		
		System.out.println(dayCount-start+last);
		
		

	}

}
