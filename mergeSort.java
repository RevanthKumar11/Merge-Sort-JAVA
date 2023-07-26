package leecodes;
import java.util.Arrays;
public class mergeSort {

	public static void main(String[] arg)
	{
		int nums1[] = {1,2,3,0,0,0};
		int m = 3;
		int nums2[] = {2,5,6};
		int n = 3;
		int k = 0;
		
		int[] num3 = new int[nums1.length + nums2.length];
		int[] num4 = new int[m + n];
		System.arraycopy(nums1, 0, num3, 0, nums1.length);
		System.arraycopy(nums2, 0, num3, nums1.length, nums2.length);
		Arrays.sort(num3);
		
		
		for(int i =0; i<=num3.length - 1; i++)
		{
			if(num3[i] != 0)
			{
				num4[k] = num3[i];
				k++;
			}
		}
		
		System.out.println(Arrays.toString(num4));
		
	
		
	}
	
}



