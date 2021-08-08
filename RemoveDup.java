package leetcode;

public class RemoveDup {
	
	public static int removeDuplicate(int[] nums)
	{
		int k = 0;
		int i = nums[0];
		
		for(int j = 1; j < nums.length; j++)
		{
			if(nums[j] != i)
			{
				k++;
				nums[k] = nums[j];
				i = nums[k];
			}
		}
		
		for(int n:nums)
		{
			System.out.print(n+ " ");
		}
		System.out.println();	
		return k+1;
	}
	
	public static int removeElement(int[] nums, int val)
	{
		int k = 0;
		
		for(int j = 0; j < nums.length; j++)
		{
			if(nums[j] != val)
			{
				nums[k] = nums[j];
				k++;
			}
		}
		return k;
	}

	public static void main(String[] args) {
		int[] arr = {0,1,2,2,3,0,4,2};
		System.out.println(removeElement(arr, 2));
	}

}
