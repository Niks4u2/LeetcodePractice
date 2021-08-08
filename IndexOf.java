package leetcode;

public class IndexOf {
	
	public static int strStr(String haystack, String needle)
	{
		if(haystack.length() == 0) return 0;
		int i = 0;
		char[] hay = haystack.toCharArray();
		char[] ned = needle.toCharArray();
				
		for(i = 0; i < hay.length; i++)
		{
			if(hay[i] == ned[0])
				return i;
		}
		return -1;
	}
	
	public static int strStr2(String haystack, String needle)
	{
		if(haystack.length() == 0) return 0;
		
		int i = haystack.indexOf(needle);
		
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr2("aaa", "aaaa"));
	}

}
