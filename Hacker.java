package leetcode;

import java.util.Scanner;


public class Hacker {
	
    static int B,H;
    static boolean flag = true;

static{
    Scanner scan = new Scanner(System.in);
    B = scan.nextInt();
    H = scan.nextInt();
    try {
    if(B <= 0 || H <0)
    {
    	flag=false;
    	scan.close();
        throw new Exception("Breadth and height must be positive");
    }
    }
    catch(Exception e)
    {
    	System.out.println(e);
    }
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}
