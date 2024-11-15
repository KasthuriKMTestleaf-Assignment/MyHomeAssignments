package week1.day2.HomeAssignment;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int numberArray[]= {1,4,3,2,8, 6,7};
		int index=1;
		Arrays.sort(numberArray);
		int length = numberArray.length;
		for (int i=0;i<length;i++)
		{
			
			if(index!=numberArray[i])
			{
				System.out.println("Missed Element: "+index);
				break;				
			}
			index++;
			
		}

	}

}
