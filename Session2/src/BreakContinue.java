
public class BreakContinue {

	public static void main(String[] args) {
	
		int myFloor = 5;
		
		// One of the Use Cases: An Elevator goes from 1st floor till 10th floor
		for(int floor=1;floor<=10;floor++) {
			
			System.out.println(">> Elevator is at Floor #"+floor);
			
			if(floor == myFloor) {
				System.out.println(">> MyFloor Arrived :)");
				break; // break shall terminate the loop itself
			}
			
		}
		
		System.out.println();
		
		int[] productIds = {101, 201, 301, 401, 111, 601, 701, 801, 901, 333};
		int productIdToLook = 111;
		
		for(int i=0;i<productIds.length;i++) {
			
			System.out.println("Product LookUp "+productIds[i]);
			
			if(productIdToLook == productIds[i]) {
				System.out.println("==Product Found== "+productIds[i]);
				break;
			}
		}

		System.out.println();
		
		for(int i=1;i<=10;i++) {
			if(i<=5) {
				continue; // skip the instructions written below and take the loop in next iteration
			}
			
			System.out.println(">> Product LookingUp "+i);
		}
		
	}

}
