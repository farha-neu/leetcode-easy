import java.util.ArrayList;

public class RemoveDuplicatesInPlace {
	
	public int removeDuplicates(int[] nums) {
		
		int init = nums[0];
		ArrayList<Integer>indexList = new ArrayList();
		indexList.add(0);
		//find out the index of the duplicate numbers and keep that in an array
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] != init) {
				indexList.add(i);
			}
			init = nums[i];
		}
		System.out.println(indexList);
		for(int i = 1; i < indexList.size(); i++) {
			nums[i] = nums[indexList.get(i)];
		}
		
//		System.out.println(indexList);
		for(int i: nums) {
			System.out.println(i);
		}
		return 0;
	}
	
	public static void main(String[] args) {
		RemoveDuplicatesInPlace rd = new RemoveDuplicatesInPlace();
		int[] nums = {1,1,1,2,2,3,4,4,5};
		rd.removeDuplicates(nums);	
	}
}
//  1,2,4,7
//	3,5,6
//1,2,3