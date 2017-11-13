package SearchingAndSortingAlgorithms;

import static org.junit.Assert.assertEquals;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int i = 0; i < eggs.size(); i++) {
			
			String a = eggs.get(i); 
			System.out.println(a);
			if(a.equals("cracked")) {
				return i;
			}
		}
		 //<- this needs changing
		return 0;
		
	}
	
	//Add other methods here
}