import java.util.ArrayList;

public class RemoveDuplicates {
	
	public int removeDuplicates(int[] nums) {
		ArrayList<Integer>newArr = new ArrayList();
		int a = nums[0];
		newArr.add(a);
		for(int i: nums) {
			if(i!=a) {
				newArr.add(i);
			}
			a = i;
		}
		System.out.println(newArr);
	    return newArr.size();
	}
	
	
	public static void main(String[] args) {
		RemoveDuplicates rd = new RemoveDuplicates();
		int[] nums = {1,1,2};
		System.out.println(rd.removeDuplicates(nums));	
	}
}
