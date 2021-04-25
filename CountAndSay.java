
public class CountAndSay {
	public String countAndSay(int n) {
		if(n == 1) {
			 return "1";
		}
		return convertToSay(countAndSay(n-1));
	 }
	  
	 public String convertToSay(String n) {
		 String output = "";
		 
		 char[] chars = n.toCharArray();
		 char base = chars[0];
		 int count = 1;
		 for(int i = 1; i < chars.length; i++) {
			 if(chars[i] == base) {
				 count++;
			 }
			 else {
				 output+=Integer.toString(count)+base;
				 count = 1;
				 base = chars[i];
			 }
		 }
	     return output+Integer.toString(count) + base;
	 }
}
