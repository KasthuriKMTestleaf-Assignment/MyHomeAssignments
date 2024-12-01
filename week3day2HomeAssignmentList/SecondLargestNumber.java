package week3.week3day2HomeAssignmentList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		//creating and adding array list
		List<Integer> array = new ArrayList<>();
		array.add(3);
		array.add(2);
		array.add(11);
		array.add(4);
		array.add(6);
		array.add(7);
		//sorting using Collection.sort()
		Collections.sort(array);
		System.out.println("After sorted the list: "+array);
		//finding array list size using size()
		int size = array.size();
		System.out.println("The second largest number is: "+array.get(size-2));

	}

}
