package project1;
import java.util.*;

public class program {

	public static void main(String[] args) {
		int check = 1;
		int teamCounter = 0;
		int appCounter = 0;
		Scanner input = new Scanner(System.in);
		//Array must have preset storage, no dynamic storage unless arraylist.
		teamMember teamMembers[] = new teamMember[100];
		applicant applicants[] = new applicant[100];
		
		//Add team member and set stats.
		while (check == 1) {
			System.out.println("This program collects the data of applicants and calculates if those applicants are compatible with the work team members. ");
			System.out.println("------------------------------");
			System.out.println("Press 1 to add a team member.");
			System.out.println("Press 2 to add an applicant.");
			System.out.println("Press 3 to show compatibility score of applicant(s).");
			System.out.println("Press 4 to quit this application.");

			int choice = input.nextInt();
			
			if (choice == 1) {

				teamMembers[teamCounter] = new teamMember("",0,0,0,0);;
				
				System.out.println("Type the team member's name:");
				teamMembers[teamCounter].setName(input.next());
				System.out.println("Your team member's name is " + teamMembers[teamCounter].retName());
				
				System.out.println("What is your team member's intellgence from 1-10:");
				teamMembers[teamCounter].setInt(input.nextInt());
				System.out.println("Your team member's intelligence is " + teamMembers[teamCounter].retInt());
				
				System.out.println("What is your team member's strength from 1-10:");
				teamMembers[teamCounter].setStr(input.nextInt());
				System.out.println("Your team member's strength is " + teamMembers[teamCounter].retStr());
				
				System.out.println("What is your team member's endurance from 1-10:");
				teamMembers[teamCounter].setEnd(input.nextInt());
				System.out.println("Your team member's endurance is " + teamMembers[teamCounter].retEnd());
				
				System.out.println("What is your team member's spicy food tolerance from 1-10:");
				teamMembers[teamCounter].setSFT(input.nextInt());
				System.out.println("Your team member's spicy food tolerance is " + teamMembers[teamCounter].retSFT());
				
				System.out.println(teamMembers[teamCounter].retName() + " has been added as a team member!");

				teamCounter++;

			}
			
			//Add applicant and set stats.
			if (choice == 2) {
				
				applicants[appCounter] = new applicant("",0,0,0,0);;

				System.out.println("Type the applicant's name:");
				applicants[appCounter].setName(input.next());
				System.out.println("Applicant's name is " + applicants[appCounter].retName());
				
				System.out.println("What is your applicant's intellgence from 1-10:");
				applicants[appCounter].setInt(input.nextInt());
				System.out.println("Applicant's intelligence is " + applicants[appCounter].retInt());
				
				System.out.println("What is your applicant's strength from 1-10:");
				applicants[appCounter].setStr(input.nextInt());
				System.out.println("Applicant's strength is " + applicants[appCounter].retStr());
				
				System.out.println("What is your applicant's endurance from 1-10:");
				applicants[appCounter].setEnd(input.nextInt());
				System.out.println("Applicant's endurance is " + applicants[appCounter].retEnd());
				
				System.out.println("What is your applicant's spicy food tolerance from 1-10:");
				applicants[appCounter].setSFT(input.nextInt());
				System.out.println("Applicant's spicy food tolerance is " + applicants[appCounter].retSFT());
				
				System.out.println(applicants[appCounter].retName() + " has been added as a new applicant!");
				
				appCounter++;
			}
			
			//Calculate Compatibility
			if (choice == 3) {
				float avgInt = 0, avgStr = 0, avgEnd = 0, avgSFT = 0, teamAvg = 0, appInt = 0, appStr = 0, appEnd = 0, appSFT = 0, compatibility = 0;
				for (int i=0; i < teamCounter;i++) {
					String name = teamMembers[i].retName();
					System.out.println("Team Member " +  name + ": stats.");
					avgInt += teamMembers[i].retInt();
					System.out.println("Your team member's intelligence is " + teamMembers[i].retInt());
					avgStr += teamMembers[i].retStr();
					System.out.println("Your team member's strength is " + teamMembers[i].retStr());

					avgEnd += teamMembers[i].retEnd();
					System.out.println("Your team member's endurance is " + teamMembers[i].retEnd());

					avgSFT += teamMembers[i].retSFT();
					System.out.println("Your team member's spicy food tolerance is " + teamMembers[i].retSFT());
					
					

				}
				
				avgInt /= teamCounter;
				System.out.println("The team average intelligence is: " + avgInt);
				avgStr /= teamCounter;
				System.out.println("The team average strength is: " + avgStr);
				avgEnd /= teamCounter;
				System.out.println("The team average endurance is: " + avgEnd);
				avgSFT /= teamCounter;
				System.out.println("The team average spicy tolerance level is: " + avgSFT);
				teamAvg = (avgInt + avgStr + avgEnd + avgSFT) / 4;
				System.out.println("The team's average stat score is "+ teamAvg);
				
				
				for (int i=0; i < appCounter;i++) {
					System.out.println("Applicant: " + applicants[i].retName());
					appInt += applicants[i].retInt();
					System.out.println("Applicant's intelligence is " + appInt);
					appStr += applicants[i].retStr();
					System.out.println("Applicant's strength is " + appStr);
					appEnd += applicants[i].retEnd();
					System.out.println("Applicant's endurance is " + appEnd);
					appSFT += applicants[i].retSFT();
					System.out.println("Applicant's spicy food tolerance is " + appSFT);
					
					applicants[i].setAvg(applicants[i].retInt(), applicants[i].retStr(), applicants[i].retEnd(), applicants[i].retSFT());
					
					System.out.println("Applicant's stat average is " + applicants[i].retAvg());

					if(applicants[i].retInt() == 0) {
						compatibility += 0;
						}
					else if (Math.abs(avgInt - appInt) > 8  ) {
						compatibility += .5;
						}
					else if (Math.abs(avgInt - appInt) > 6  ) {
						compatibility += .10;
						}
					else if (Math.abs(avgInt - appInt) > 4  ) {
						compatibility += .15;
						}
					else if (Math.abs(avgInt - appInt) > 2  ) {
						compatibility += .20;
						}
					else if (Math.abs(avgInt - appInt) >= 0  ) {
						compatibility += .25;
						}

					if(applicants[i].retStr() == 0) {
						  compatibility += 0;
						}
					else if (Math.abs(avgStr - appStr) > 8  ) {
						compatibility += .5;
						}
					else if (Math.abs(avgStr - appStr) > 6 ) {
						compatibility += .10;
						}
					else if (Math.abs(avgStr - appStr) > 4  ) {
						compatibility += .15;
						}
					else if (Math.abs(avgStr - appStr) > 2  ) {
						compatibility += .20;
						}
					else if (Math.abs(avgStr - appStr) >= 0 ) {
						compatibility += .25;
						}
					
					if(applicants[i].retEnd() == 0) {
						  compatibility += 0;
						}
					else if (Math.abs(avgEnd - appEnd) > 8  ) {
						compatibility += .5;
						}
					else if (Math.abs(avgEnd - appEnd) > 6  ) {
						compatibility += .10;
						}
					else if (Math.abs(avgEnd - appEnd) > 4 ) {
						compatibility += .15;
						}
					else if (Math.abs(avgEnd - appEnd) > 2  ) {
						compatibility += .20;
						}
					else if (Math.abs(avgEnd - appEnd) >= 0  ) {
						compatibility += .25;
						}
					
					
					if(applicants[i].retSFT() == 0) {
						  compatibility += 0;
						}
					else if (Math.abs(avgSFT - appSFT) > 8  ) {
						  compatibility += .05;
						}
					else if (Math.abs(avgSFT - appSFT) > 6 ) {
						  compatibility += .10;
						}
					else if (Math.abs(avgSFT - appSFT) > 4  ) {
						  compatibility += .15;
						}
					else if (Math.abs(avgSFT - appSFT) > 2  ) {
						  compatibility += .20;
						}
					else if (Math.abs(avgSFT - appSFT) >= 0  ) {
						  compatibility += .25;
						}
					
					System.out.println(applicants[i].retName() + "'s Compatibility score " + compatibility);
					compatibility = 0;
					appInt = 0;
					appStr = 0;
					appEnd = 0;
					appSFT = 0;
					
				}	
				System.out.println("");
				System.out.println("Compatibility Scale:");
				System.out.println(".8 - 1 means the applicant is very compatible");
				System.out.println(".6 - .79 means the applicant is compatible");
				System.out.println(".4 - .59 means the applicant is less compatible");
				System.out.println(".2 - .39 means the applicant is not compatible");
				System.out.println(".1 - .19 means the applicant is incredibly incompatible");
				System.out.println("0 means the applicant's score is unavailable");
				System.out.println("Compatibility has been calculated. Shutting down program.");
				break;
			}
			
			//Exit Program.
			if (choice == 4) {
				break;
			}
		}
		input.close();
	}
}
