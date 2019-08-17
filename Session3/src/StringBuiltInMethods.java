
public class StringBuiltInMethods {

	public static void main(String[] args) {
		
		String salutation = "Mr. ";
		String fname = "John ";
		String lname = "Watson";
		
		//String name = salutation + fname + lname;
		String name = salutation.concat(fname).concat(lname); // concat which will merge 2 strings to create a new string
		System.out.println("name is: "+name);
		
		// Strings are IMMUTABLE i.e. You cannot do a modification in it.
		// Modification on String will give a new String in memory !!
		String names = "John, Jennie, Jim, Jack, Joe"; // indexed -> 0 to n-1 weher n is size of string
		String newNames = names.toUpperCase();
		
		System.out.println(">> names is: "+names); // no change in names
		System.out.println(">> newNames is: "+newNames); // change in names
		
		char ch = names.charAt(3);
		System.out.println(">> ch is: "+ch);
		
		int size = names.length(); // 28
		System.out.println(">> size of names is: "+size);
		
		ch = names.charAt(size-1);
		System.out.println(">> ch now is: "+ch);
		
		char[] letters = names.toCharArray();
		for(char c : letters) {
			System.out.print(c+" ");
		}
		System.out.println();
		
		//String subStr = names.substring(6); // from index 6 to last index
		String subStr = names.substring(6, 12); // from index 6 to less than 12
		System.out.println(">> subStr is: "+subStr);
		
		//int idx = names.indexOf('o');
		//int idx = names.lastIndexOf('o');
		int idx = names.indexOf("Jennie");
		System.out.println(">> idx is: "+idx);
		
		String replacedNames = names.replace('J', 'K');
		System.out.println(">> replacedNames: "+replacedNames);
		
		String email = "john@example.com";
		
		if(email.contains("@") && email.contains(".")) {
			System.out.println(">> Valid Email :)");
		}else{
			System.out.println(">> Invalid Email :(");
		}
		
		if(email.endsWith(".com")) { // startsWith
			System.out.println(">> Valid Email :)");
		}else {
			System.out.println(">> Invalid Email :(");
		}
		
		// contains, startsWith and endsWith is majorly to perform search
		
		String quote = "Search the candle rather than cursing the darkness";
		String[] words = quote.split(" ");
		System.out.println(">> Total Number of Words: "+words.length);
		
		for(String word : words) {
			System.out.println(word);
		}
			
		String password = " pass 123 "; // leading and trailing spaces
		System.out.println(">> password is: "+password);
		System.out.println(">> password with trim is: "+password.trim());
				

	}

}
