
public class MyAtoi {
	
	 public int myAtoi(String s) {
		 
		 boolean isPositive = true;
		 boolean isNotDigit = true;
		 char[] chars = s.toCharArray();
		 String output = "";
		 int num = 0;
		 
		 for(char c: chars) {
			 if(Character.isDigit(c)) {
				 isNotDigit = false;
				 output+=c;
			 }
			 else if(c == '-' && isNotDigit) {
				 isPositive = false;
				 isNotDigit = false;
			 }
			 else if(c == '+' && isNotDigit) {
				 isPositive = true;
				 isNotDigit = false;
			 }
			 else if(c == ' ') {
				 continue;
			 }
			 else {
				 break;
			 } 
		 }
		 try {
			 num = output.length() > 0? Integer.parseInt(output) : num;
		 }
		 catch (NumberFormatException e) {
			 if(isPositive) {
				 num = Integer.MAX_VALUE;
			 }
			 else {
				 num = Integer.MIN_VALUE;
			 }
		 }   
		 
		 if(!isPositive) {
			 num = -num;
		 }
		 return num;
	 }
	 
	 public static void main(String[] args) {
		 MyAtoi ma = new MyAtoi();
		 System.out.println(ma.myAtoi("+-12"));
	 }

}
