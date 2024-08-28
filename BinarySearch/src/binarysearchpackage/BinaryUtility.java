package binarysearchpackage;

public class BinaryUtility {

	
	public static int BinarySearch(int[] arr,int key)
	{
		int low=0;
		//int mid;
		int high=arr.length-1;
		
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			System.out.println("Mid is "+arr[mid]);
			if(arr[mid]==key)
			{
				return mid;
			}
			
			if(key<arr[mid])
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
			//return 1;
			
		}
		return -1;
	}

	
}
