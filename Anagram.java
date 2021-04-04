import java.util.HashMap;

public class Anagram {
	
	public static boolean isAnagram(String s, String t) {
		 if(s.length()!=t.length()) {
			 return false;
		 }
		 HashMap<Character, Integer>anagram1 = buildHashmap(s);
		 HashMap<Character, Integer>anagram2 = buildHashmap(t);
		 if(anagram1.equals(anagram2)){
			 return true; 
		 }
	     return false;   
	}
	
	public static HashMap<Character, Integer> buildHashmap(String s) {
		HashMap<Character, Integer>anagram = new HashMap();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			anagram.put(c, anagram.getOrDefault(c, 0)+1);
		}
		return anagram;
	}
	 
	public static void main(String[] args) {
		System.out.println(Anagram.isAnagram("rat", "cat"));
	}
}

