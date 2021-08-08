package leetcode;

public class MaxSubArr {
	
	public static void kadane()
	{
        int[] arr = new int[] {-2, -3, 4, -1, -2, 1, 5, -3};
        int sum = 0, ans = Integer.MIN_VALUE, len = 0, res = 0;
        for(int i = 0; i < arr.length; i++)
        {
        	if(sum + arr[i] > 0)
        	{
        		sum += arr[i];
        		len++;
        	}
        	else
        	{
        		sum = 0;
        		len = 0;
        	}
        	if(sum > ans)
        	{
        		res = len;
        		ans = sum;
        	}
        }
        System.out.println(ans);
        System.out.println(res);
	}
	
	public static void kSmallest()
	{
        int[] arr = new int[] {7, 10, 4, 20, 15};
        int min = arr[0], len = 1, k = 4, res = 0;
        for(int i = 1; i < arr.length; i++)
        {
        	if(arr[i] < min)
        	{
        		min = arr[i];
        	}
        }
        for(int j = 0; j < arr.length; j++)
        {
        	//if(arr[i] => min)
        }
        System.out.println(min);
	}
	
	public static void slidingWindow(int[] arr, int k)
	{
		int windowSum = 0, maxSum = Integer.MIN_VALUE;
		for(int i = 0; i < k; i++)
			windowSum += arr[i];
		for(int j = k; j < arr.length; j++)
		{
			windowSum += arr[j] - arr[j - k];
			maxSum = Math.max(windowSum, maxSum);
		}
		System.out.println(maxSum);
	}
	
	public static int[] longestSubarraySum2(int[] arr, int k)
	{
		int[] result = new int[] {-1};
		
		int sum = 0;
		int left = 0;
		int right = 0;
		
		while(right < arr.length)
		{
			sum += arr[right];
			while(left < right && sum > k)
				sum -= arr[left++];
			if(sum == k && (result.length == 1 || result[1] - result[0] < right - left))
				result = new int[] {left, right};
			right++;
		}
		return result;
	}

	
	public static int longestSubarraySum(int[] arr, int sum)
	{
		int result = 0;
		int windowSum = 0, k = 0, i;
		for(i = 0; i < arr.length; i++)
		{
			windowSum += arr[i];
			if(windowSum == sum)
				break;
		}
		result = i + 1;
		k = result;
		for(int j = k; j < arr.length; j++)
		{
			if(windowSum == sum)
			{
				windowSum += - arr[j - k];
				result--;
			}
			if(windowSum < sum || windowSum == sum)
			{
				windowSum += arr[j];
				result++;
			}
		}
		return result;
	}
	// -5, 8, -14, 2, 4, 12
	// 10, 5, 2, 7, 1, 9
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       // Scanner scan = new Scanner(System.in);
        //int n = scan.nextInt();
    	int n = 5;
        int[] arr = new int[] {1, -2, 4, -5, 1};
        int count = 0;
//        for(int i = 0; i < n; i++)
//        {
//            arr[i] = scan.nextInt();
//        }
        //for(int a : arr)
        //   System.out.println(a);
        
        
        for(int sub_arr_size = 1; sub_arr_size <= n; sub_arr_size++)
        {
        	for(int start_index = 0; start_index < n; start_index++)
        	{
        		if(start_index + sub_arr_size > n)
        			break;
        		int sum = 0;
        		for(int i = start_index; i < (sub_arr_size+start_index); i++)
        		{
        			sum += arr[i];
        		}
        		if(sum < 0)
        			count++;
        	}
        }
        
        System.out.println(count);
    }

}
