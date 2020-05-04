import java.util.*;

public class states {
	static List<String> listOfStates = new ArrayList<>();
	static List<String> listOfCapitals = new ArrayList<>();

	public static void main(String[] args) {
		
		String[][] data = {
				{"Alabama", "Montgomery"}, {"Alaska", "Juneau"}, {"Arizona", "Phoenix"},
				
				{"Arkansas", "Little Rock"}, {"California", "Sacramento"},
				
				{"Colorado", "Denver"}, {"Connecticut", "Hartford"}, 
				
				{"Louisiana", "Baton Rouge"}, {"Wyoming", "Cheyenne"},
				
				{"Maine", "Augusta"}, {"Michigan", "Lansing"}, {"Minnesota", "Saint Paul"}, 
				
				{"Mississippi", "Jackson"}, {"Iowa Des", "Moines"}, 
				
				{"Missouri", "Jefferson City"}, {"Indiana", "Indianapolis"},
				
				{"Montana", "Helena"}, {"Kansas", "Topeka"}, {"Kentucky","Frankfort"},
				
				{"Maryland", "Annapolis"}, {"Nebraska", "Lincoln"}, 
				
				{"Nevada", "Carson City"}, {"New Hampshire", "Concord"}, 
				
				{"New Jersey", "Trenton"}, {"New Mexico", "Santa Fe"}, 
				
				{"New York", "Albany"}, {"North Carolina", "Raleigh"}, 
				
				{"North Dakota", "Bismarck"},{"Ohio", "Columbus"},
				
				{"Oklahoma", "Oklahoma City"}, {"Oregon", "Salem"}, 
				
				{"Pennsylvania", "Harrisburg"}, {"Rhode Island", "Providence"}, 
				
				{"South Carolina", "Columbia"}, {"South Dakota", "Pierre"}, 
				
				{"Tennessee", "Nashville"}, {"Texas", "Austin"}, 
				
				{"Utah", "Salt Lake City"}, {"Vermont", "Montpelier"}, 
				
				{"Virginia", "Richmond"}, {"Washington", "Olympia"}, 
				
				{"West Virginia", "Charleston"}, {"Wisconsin", "Madison"}, 
				
				{"Massachusetts", "Boston"}, {"Delaware", "Dover"}, {"Florida", "Tallahassee"}, 
				
				{"Georgia", "Atlanta"},{"Hawaii", "Honolulu"}, {"Idaho", "Boise"},
				
				{"Illinois", "Springfield"}, 
						
				
				};


			for (int y = 0; y < data.length; y++) {
				
				listOfStates.add(data[y][0]);
				listOfCapitals.add(data[y][1]);
				
			}
			
			long randomgenerator = System.currentTimeMillis();
			
			Collections.shuffle(listOfStates, new Random(randomgenerator));
			Collections.shuffle(listOfCapitals, new Random(randomgenerator));
		

		int count = 0;	
		Scanner guess = new Scanner(System.in);
		
		for (int j = 0; j < listOfStates.size(); j++) {
			
			System.out.print("The capital of " + listOfStates.get(j) + " is?: ");
			String guessforcapital = guess.nextLine();

			if (matchingCheck(listOfCapitals.get(j), guessforcapital)) {
				
				System.out.println("Your answer is correct");
				count++;
				
			}
			else {
				
				System.out.println("Sorry the correct answer was " + listOfCapitals.get(j));
				
			}
			
			}

		System.out.println("Your Score is: " + count);
	}

	
	public static boolean matchingCheck(String c, String a) {
		
		if (c.length() == a.length()) {
			
			for (int x = 0; x < c.length(); x++) {
				if (c.charAt(x) == a.charAt(x)) {
				
					return true;
				
				}
			}
			
		}
		return false;
	}
}
