package week3.week3day2HomeAssignmentList;

import java.util.ArrayList;
import java.util.List;

public class ListIntersection {

	public static void main(String[] args) {
		//creating list of 2 integer arraylist 
		int[] array1 = {3, 2, 11, 4, 6, 7};//declaring array
		int[] array2 = {1, 2, 8, 4, 9, 7};
		List<Integer> arr1 = new ArrayList<>();
		for(int i=0;i<array1.length;i++)
		{
			arr1.add(array1[i]);//adding array elements into list
		}
		System.out.println("The first list is:"+arr1);
		List<Integer> arr2 = new ArrayList<>();
		for(int j=0;j<array2.length;j++)
		{
			arr2.add(array2[j]);
		}
		System.out.println("The second list is:"+arr2);
		System.out.println("Intersection values are:");
		for(int i=0;i<arr1.size();i++)
		{
			for(int j=0;j<arr2.size();j++)
			{
				if(arr1.get(i)==arr2.get(j))
				{
					System.out.println(arr1.get(i));
				}
			}
		}
	}

}
