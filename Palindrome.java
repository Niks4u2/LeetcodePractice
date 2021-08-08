package leetcode;

public class Palindrome {
	
	public static boolean isPalindrome(int x) 
	{
		boolean isTrue = false;
		if(x < 0)
			return false;
        Integer n = x;
        String str = n.toString();
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == str.charAt(str.length() - i - 1))
            	isTrue = true;
            else
            	return false;
        }
        if(isTrue)
        	return true;
        else
        	return false;
    }
	
	public static boolean validPalindrome(String s)
	{
        if(s.equals(" ") || s.equals("."))
        	return true;
        String[] str = s.split("[^A-Za-z0-9]");
        
        String st = String.join("", str).toLowerCase();
        
		boolean isTrue = false;
		if(st.length() <= 0)
			return false;
        for(int i = 0; i < st.length(); i++)
        {
            if(st.charAt(i) == st.charAt(st.length() - i - 1))
            	isTrue = true;
            else
            	return false;
        }
        if(isTrue)
        	return true;
        else
        	return false;
    }

	
	public static void main(String[] args) {
	 	//System.out.println(isPalindrome(0));
		//MaxSubArr mx = new MaxSubArr();
		//int[] arr = {-5, 8, -14, 2, 4, 12};
		int[] arr = {10, 5, 2, 7, 1, 9};
		//MaxSubArr.kadane();
		//MaxSubArr.slidingWindow(arr, 4);
//		int[] re = MaxSubArr.longestSubarraySum2(arr, 15);
//		for(int r: re)
//		System.out.println(r);
		
		MaxSubArr.kSmallest();
		
		boolean b = validPalindrome(".");
		System.out.println(b);
	}
}
