package leetcode;

import java.util.*;

public class Trial {
	
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    // Write your code here
    		Object[] newArr = arr.toArray();
    		
    		Integer[] ar = (Integer[]) newArr;
    		
    		int temp = ar[0];
            for(int i = 0; i < newArr.length - 1; i++)
            {
            	newArr[i] = newArr[i+1];
            }
    		newArr[newArr.length - 1] = temp;
    		
    		List<Integer> arr1 = Arrays.asList();
    		
            return arr1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		//list.add(0,list.get(4));
		
		//System.out.println(list.get(0));
		
		List<Integer> ls = rotateLeft(1, list);
		
		for(int n: ls)
			System.out.println(n);
	}

}
