
public class ReverseInteger {
	
	public static int reverseInteger(int x) {
		 try{
	        if (x == 0) {
	          return 0;
	        }
		    String str = "";
		    boolean isNegative = x < 0? true : false;
		    x = Math.abs(x);
		    
		    while(x>0) {
	            int tmp = x%10;
	            x = x/10;
	            str+=tmp;
		    }
		    x = Integer.parseInt(str);
		    if(isNegative) {
		      x = -x;
		    }
		    return x;
		 } 
		 catch (NumberFormatException e) {
		      return 0;
		 }         
	}
	
	public static void main(String[] args) {
		System.out.println(ReverseInteger.reverseInteger(964632435));
	}

}

