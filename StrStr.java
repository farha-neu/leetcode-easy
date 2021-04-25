
public class StrStr {
	
	public int strStr(String haystack, String needle) {
		int index = haystack.indexOf(needle);
		
        return index;
    }
	
	public static void main(String[] args) {
		StrStr st = new StrStr();
		System.out.println(st.strStr("hello", "ll"));
		
	}

}
