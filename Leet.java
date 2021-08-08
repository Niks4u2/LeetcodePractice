package leetcode;

public class Leet {
	
    public static int lengthOfLastWord(String s) {
        
    	if(s.length() == 0) return 0;
        String[] arr = s.split(" ");
        return arr[arr.length - 1].length();
         
    }
    
    public static String addBinary(String a, String b)
    {
    	char[] ca = a.toCharArray();
    	char[] cb = b.toCharArray();
    	char[] result = new char[ca.length];
    	
    	for(int i = 0; i < ca.length; i++)
    	{
    		if(ca[ca.length - i - 1] == '1' && cb[cb.length -i - 1] == '1')
    		{
    			result[result.length - i - 1] = 0;
    		}
    		else if((ca[ca.length - i - 1] == '1' && cb[cb.length -i - 1] == '1')
    				|| (ca[ca.length - i - 1] == '1' && cb[cb.length -i - 1] == '1')) 
    		{
    			result[result.length - i - 1] = 0;
    		}
    	}
    	System.out.println(String.valueOf(cb));
    	return a;
    }
    
    public static int maxProfit(int[] prices) 
    {
        int max = 0, i= prices[0];
        
        for(int j = 1; j < prices.length; j++)
        {
        	int diff=prices[j] - i;
        	
        	if(diff <= 0)
        	{
        		i = prices[j];
        	}
        	else
        	{
        		max = Math.max(max, diff);
        	}
        }
        if(max < 0)
        	return 0;
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		String a = "Hello";
//    	char[] ca = a.toCharArray();
//    	System.out.println(String.copyValueOf(ca));
    	int[] arr = {2,4,1};
    	System.out.println(maxProfit(arr));
	}

}
