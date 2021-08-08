package leetcode;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
        String A="hello";
        String B="java";
        
        int sum = A.length() + B.length();
        System.out.println(sum);
        int comp = A.compareTo(B);
        if(comp < 0)
        	System.out.println("No");
        else
        	System.out.println("Yes");
        String a = A.substring(0,1).toUpperCase() + A.substring(1);
        String b = B.substring(0,1).toUpperCase() + B.substring(1);
        
        System.out.println(a + " " + b);

	}

}
