package leetcode;

import java.text.NumberFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

public class Remove {
	
    public static int removeDuplicates(int[] nums) 
    {
    	int k = nums.length;
    	HashSet<Integer> set = new HashSet<Integer>();
    	
    	for(int i = 0; i < nums.length; i++)
    	{
    		set.add(nums[i]);
    	}
        return k;
    }
    
    public static void main(String[] args) {
		//System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
		double num = 12324.134;
    	 NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.FRENCH);
    	 String d = nf.format(num);
    	 System.out.println(d);
	}
    Scanner s = new Scanner(System.in);
    
    String n = "nifty";
    
    
}
