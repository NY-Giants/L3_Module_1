package SearchingAndSortingAlgorithms;

import static org.junit.Assert.assertEquals;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int i = 0; i < eggs.size(); i++) {
			
			String a = eggs.get(i); 
		
			if(a.equals("cracked")) {
				return i;
			}
		}
		 //<- this needs changing
		return 0;
		
	}

	public static Object countPearls(List<Boolean> oysters) {
		int numtrue = 0;
		for(int i = 0; i < oysters.size(); i++) {
			boolean b = oysters.get(i); 
			
			if(b) {
				numtrue++;
				
			}
			
		}
		return numtrue;
	}

	public static double findTallest(List<Double> peeps) {
	double horseheight = 0;
		for(int i = 0; i < peeps.size(); i++) {
			double c = peeps.get(i); 
			
			if(c > horseheight) {
				horseheight = c;
				
			}
			
		}
		return horseheight;
	}

	public static Object findLongestWord(List<String> words) {
		String longestword = "";
		for(int i = 0; i < words.size(); i++) {
			String d = words.get(i); 
			
			if(d.length() > longestword.length()) {
				longestword = d;
				
			}
			
		}
		return longestword;
	}

	public static Boolean containsSOS(List<String> message1) {
		String sos = " ... --- ... ";
		for(int i = 0; i < message1.size(); i++) {
			String e = message1.get(i); 
			
			if(e.equals(sos) ) {
				return true;
				
			}
			
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		for(int i = 0; i < results.size(); i++) {
			for(int j = i+1; j < results.size(); j++){
				if(results.get(i) > results.get(j)) {
					Double temp = results.get(j);
					results.set(j, results.get(i));
					results.set(i,temp);
				}
			}
			
	
			
		}
		return results;
	}
	
	//Add other methods here
}