package leetcode;
// Not Solved
public class Valid {
	
    public static boolean isValid(String s) 
    {
        char[] ch = s.toCharArray();
        boolean isPresent = false;
        for(int i = 0; i < ch.length; i++)
        {
        	if(ch[i] == '(')
        	{
        		for(int j = i+1; j < ch.length - 1; j++)
            		if(ch[j] == ')')
            		{
            			isPresent = true;
            			break;
            		}
            		else
            			isPresent = false;
        	}
        	if(ch[i] == '{')
        	{
        		for(int j = i+1; j < ch.length - 1; j++)
            		if(ch[j] == '}')
                		{
                			isPresent = true;
                			break;
                		}
            		else
            			isPresent = false;
        	}
        	if(ch[i] == '[')
        	{
        		for(int j = i+1; j < ch.length - 1; j++)
            		if(ch[j] == ']')         		
                		{
                			isPresent = true;
                			break;
                		}
            		else
            			isPresent = false;
        	}
        }
        if(isPresent)
        	return true;
        else
        	return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("(){}}{"));
	}

}
