package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class LL {

	public static void main(String[] args) 
{
		HashSet<String[][]> map = new HashSet<String[][]>();
	
	Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    scan.nextLine();
    List<Integer> list = new ArrayList<Integer>();
    String s = scan.nextLine();
    String[] sArr = s.split(" ");
    
    for(int i = 0; i < N; i++)
    {
        list.add(Integer.parseInt(sArr[i]));
    }
    int Q = scan.nextInt();
    
    for(int j = 0; j < Q; j++)
    {
        String q = scan.next();
        if(q.equals("Insert"))
        {
            String s1 = scan.nextLine();
            String[] sArr1 = s1.split(" ");
            list.add(Integer.parseInt(sArr1[0]), Integer.parseInt(sArr1[1]));
        }
        else
        {
            String s2 = scan.next();
            list.remove(Integer.parseInt(s2));
        }
    }
    for(int n: list)
        System.out.print(n+" ");
    scan.close();
}

}
