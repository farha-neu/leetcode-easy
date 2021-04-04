//	remove all white spaces 
//	convert the string to lower or upper case
//	initialize three variables: i = 0, j = length of the string-1, isPalindrome = false
//	start iterating over the given string with those initialized values of i and j
//		if value of i is non-numeric 
//			increase i
//		if value of j is non-numeric 
//			decrease j
//		if values of i and j are equal:
//		   isPalindrome = true
//		   increase i and decrease j by 1
//  stop iteration:
//	 if i - j <=1 and return isPalidrome value

public class ValidPalindrome {
	
	public static boolean isPalindrome(String s) {
		s = s.replaceAll("\\s", "").toLowerCase();
		
		int i = 0, j = s.length() - 1;
		boolean isPalindrome = true;
		
		char[] charArray = s.toCharArray();
		while(j>i) {
			if(!Character.isLetterOrDigit(charArray[i])) {
				i++;
				continue;
			}
			if(!Character.isLetterOrDigit(charArray[j])) {
				j--;
				continue;
			}
			if(charArray[i] == charArray[j] && j>i){
				isPalindrome = true;
			}
			else {
				isPalindrome = false;
				break;
			}
			i++;
			j--;
		}
		System.out.println(isPalindrome);
        return isPalindrome;
    }
	
	public static void main(String[] args) {
		ValidPalindrome.isPalindrome("*mahmu$du$%l@##lu**d**** u    mham**");
		
	}
}

