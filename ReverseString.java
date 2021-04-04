
public class ReverseString {
	
	private static String reverseString(String str) {
		char[] strArray = str.toCharArray();
		
		for(int i = 0, j = strArray.length - 1; i < Math.floor(str.length()/2); i++, j--) {
			char temp = strArray[i];
			strArray[i] = strArray[j];
			strArray[j] = temp;
		}
		return String.valueOf(strArray);
	}
	
	public static void main(String[] args) {
		System.out.println(ReverseString.reverseString("farha"));
	}
}
