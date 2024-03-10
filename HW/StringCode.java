import java.util.HashSet;
import java.util.Set;

// CS108 HW1 -- String static methods

public class StringCode {

	/**
	 * Given a string, returns the length of the largest run.
	 * A a run is a series of adajcent chars that are the same.
	 * @param str
	 * @return max run length
	 */
	public static int maxRun(String str) {
		int d1 = 1;
		int max = 1;
		if(str == ""){
			return 0;
		}
		for(int i = 1; i < str.length(); ++i){
			if(str.charAt(i) == str.charAt(i-1)){
				d1++;
			}
			else{
				max = Math.max(d1,max);
				d1 = 1;
			}
		}
		max = Math.max(max,d1);
		return max;
    }

	
	/**
	 * Given a string, for each digit in the original string,
	 * replaces the digit with that many occurrences of the character
	 * following. So the string "a3tx2z" yields "attttxzzz".
	 * @param str
	 * @return blown up string
	 */
	public static String blowup(String str) {
		StringBuilder s = new StringBuilder();
		for(int i = 0; i < str.length(); i++){
			if(!Character.isDigit(str.charAt(i))){
				s.append(str.charAt(i));
			}
			else{
				if(i == str.length()-1){
					if(!Character.isDigit(str.charAt(i))){
						s.append(str.charAt(i));
					}
				}
				else {
					int m = Character.getNumericValue(str.charAt(i));
					for (int j = 1; j <= m; j++) {
						s.append(str.charAt(i + 1));
					}
				}
			}
		}
		return s.toString();
	}

	/**
	 * Given 2 strings, consider all the substrings within them
	 * of length len. Returns true if there are any such substrings
	 * which appear in both strings.
	 * Compute this in linear time using a HashSet. Len will be 1 or more.
	 */
	public static boolean stringIntersect(String a, String b, int len) {
		HashSet<String> st = new HashSet<>();
		for (int i = 0; i <= a.length() - len; i++) {
			st.add(a.substring(i, i + len));
		}
		for (int i = 0; i <= b.length() - len; i++) {
			if (st.contains(b.substring(i, i + len))) {
				return true;
			}
		}
		return false;
	}
}
