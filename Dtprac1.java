import java.lang.*;

public class Dtprac1 {
	
	public static void main (String[] args) {
		long minutes = 1700000L;
		long minperyear = 525600L;
		double yearscalculated = (double)minutes/minperyear;
		double additionalyears;
		//System.out.println (yearscalculated);
		long exactyears = Math.round(yearscalculated);
		//System.out.println (exactyears);
		double daysofcalculatedyear = yearscalculated * 365;
		double daysdifference = daysofcalculatedyear - 365;
		
		//System.out.println ("The result is "+exactyears+" year(s) and "+Math.round(daysdifference)+" days");
		
		if (daysdifference > 365){
			additionalyears = daysdifference / 365;
			}
			
	}
}

