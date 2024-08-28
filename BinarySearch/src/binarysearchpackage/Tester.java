package binarysearchpackage;

public class Tester {

	public static void main(String[] args) {
		int[] arr= {11,22,33,44,55,66,77,88,99,100,120};
		
		int found=BinaryUtility.BinarySearch(arr,456786);

		if(found==-1)
		{
			System.out.println("Data does not exists!!");
		}
		else
		{
			System.out.println("Data found in an array!!");
		}
	}

}
