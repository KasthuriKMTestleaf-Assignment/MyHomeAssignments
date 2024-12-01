package week3.week3day2HomeAssignmentList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		List<Integer> series = new ArrayList<>();
		int[] array = {1,2,3,4,10,6,8};
		for(int i=0;i<array.length;i++)
		{
			series.add(array[i]);
		}
		//finding size
		int size = series.size();
		//sorting list
		Collections.sort(series);
		System.out.println("The sorted list: "+series);
		System.out.println("The missing elements are:");
		for(int i=1;i<=10;i++)
		{
			if(!series.contains(i))
			{
				System.out.println(i);
			}
			
		}

	}

}
