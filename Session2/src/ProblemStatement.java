
public class ProblemStatement {

	public static void main(String[] args) {
		
		// Representing data in SVC's can be complex when we have huge data
		/*
		int repArizona = 126;
		int repTexas = 226;
		
		int demArizona = 252;
		int demTexas = 111;
		*/
		
		// Data for 2 Different Political Parties
		int[] repVoteCounts = {126, 32, 230, 21, 200};
		int[] demVoteCounts = {152, 85, 121, 215, 93};
		
		int[][] voteCounts = {
							   {126, 32, 230, 21, 200}, // 0 -> Republican Party
							   {152, 85, 121, 215, 93}  // 1 -> Democratic Party
						   };
		
		int repVoteCount = 0;
		int demVoteCount = 0;
		
		for(int i=0;i<5;i++) {
			repVoteCount = repVoteCount + repVoteCounts[i];
			demVoteCount = demVoteCount + demVoteCounts[i];
		}
		

		if(repVoteCount > demVoteCount) {
			System.out.println(">> Republican Party Won by "+(repVoteCount - demVoteCount)+" Votes");
		}else {
			System.out.println(">> Democratic Party Won by "+(demVoteCount - repVoteCount)+" Votes");
		}
		
		
	}

}
