package leetcode;

public class ReverseInt {
	
	public static int reverse(int x) 
	{
        if(x > (int) Math.pow(2, 31) - 1){
            return 0;
        }
        int y = 0;
        if( x < 0){
            y = x;
            x = Math.abs(x);
        }
        int rev = 0;
        Integer n = x;
        String s = n.toString();
        n = s.length();
        int i = 1;
        while(x > 0)
        {
        	int rem = x % 10;
            double multiplier = Math.pow(10, n-i);
            rem *= multiplier;
            if(rem >= Math.pow(2, 31) - 1)
            	return 0;
            rev += rem;
            i++;
            x = x / 10;
            if(rev >= Math.pow(2, 31) - 1)
            	return 0;
        }
        if(y < 0){
            return -rev;
        }
        if(rev > (int) Math.pow(2, 31) - 1){
            return 0;
        }
        return rev;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(1563847412));
	}

}
