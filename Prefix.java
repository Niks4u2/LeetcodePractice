package leetcode;

public class Prefix 
{
    public static String longestCommonPrefix(String[] strs) 
    {
    	String result="";
    	boolean isPresent=true;
    	int min = strs[0].length();
    	
    	for(String st: strs)
    	{
    		if(st.length() < min)
    			min = st.length();
    	}
    	
    	for(int j = 0; j < min; j++)
    	{
    		String str = String.valueOf(strs[0].charAt(j));
    		for(String s : strs)
    		{
    			if(!str.equals(String.valueOf(s.charAt(j))))
    			{
    				isPresent=false;
    			}
    		}
    		if(isPresent)
    			result+=str;
    		else
    			break;
    	}
        return result;
    }

	public static void main(String[] args) 
	{
		String str = longestCommonPrefix(new String[] {"flower","flow","flight"});
		System.out.println(str);
	}

}
