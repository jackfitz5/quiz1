package quiz1;

import java.util.Scanner;

public class passerrating {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);

//Defines variables as doubles
		double completionsMade =0,  attemptsMade =0,  yardsThrown =0, touchdownsThrown =0, interceptionsThrown =0, a =0, b =0, c =0, d =0, passerrating= 0; 

// Completions
	System.out.println("How many completions has the quarterback made?: ");
	completionsMade = input.nextDouble();
	
// Attempts
	System.out.println("How many attempts has the quarterback thrown?: " );
	attemptsMade = input.nextDouble();

// Yards
	System.out.println("How many yards has the quarterback thrown for?: ");
	yardsThrown = input.nextDouble();

// Touchdowns
	System.out.println("How many touchdowns has the quarterback thrown?: ");
	touchdownsThrown = input.nextDouble();

// Interceptions
	System.out.println("How many interceptions has the quarterback thrown?: ");
	interceptionsThrown = input.nextDouble();
	
// Formula for a
	a = ((completionsMade/attemptsMade)-.3)*5;
// Formula for b
	b = ((yardsThrown/attemptsMade)-3)*(.25);		
// Formula for c
	c = (touchdownsThrown/attemptsMade)*20;
// Formula for d
	d = 2.375-((interceptionsThrown/attemptsMade)*25);		

// Formula to calculate passer rating
	passerrating = ((a+b+c+d)/6)*(100);
	

// Tell the user the quarterback's passer rating
	System.out.println(+ passerrating);

	input.close();
	}

}


