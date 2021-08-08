package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetEasy {
	
    public static int majorityElement(int[] nums) 
    {
        int count = 0;
        int elem = nums[0];
        
        for(int i = 0; i < nums.length; i++)
        {
        	if(elem == nums[i])
        	{
        		count++;
        	}
        	if(count > nums.length / 2)
        		return count;
        }
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char A = 'A';
		int i = (int)A - 64;
		System.out.println(i);
		
		int j = 25;
		char c = (char)(j + 64);
		System.out.println(c);
		
        List<Integer> list = new ArrayList<Integer>();
        
	}

}
