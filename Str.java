package leetcode;

import java.util.ArrayList;
import java.util.Scanner;
import java.math.*;

public class Str {
	
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int min=0,max=0;
        String[] list = new String[s.length() - k + 1];
        
        for(int i = 0; i <s.length() - k + 1; i++)
        {
        	list[i] = s.substring(i,k+i);
        }
        
        for(int l = 0; l< list.length; l++)
	    {
	        for(int j = 0; j < list.length; j++)
	        {
	        	int val = list[l].compareTo(list[j]);
	        	if(val < min)
	        	{
	        		min = val;
	        		smallest = list[j];
	        	}
	        	if(val > max)
	        	{
	        		max = val;
	        		largest = list[j];
	        	}	
	        }
        }
        	
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return largest + "\n" + smallest;
    }


    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        String s = "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
        int k = 30;
        //scan.close();
        
        System.out.println(getSmallestAndLargest(s, k));
        
        Scanner scan = new Scanner(System.in);
        BigInteger A = scan.nextBigInteger();
        
        //BigInteger A  = BigInteger.valueOf(a);
        //BigInteger B  = BigInteger.valueOf(b);
        
       // System.out.println(A.add(B));
        //System.out.println(A.multiply(B));
    }

}
