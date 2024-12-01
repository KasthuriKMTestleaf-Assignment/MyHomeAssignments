package week3.day1HomeAssignment;

public class ReverseOddWords {

	public static void main(String[] args) {
		String test = "I am a software Tester";
		String[] split = test.split(" ");
		for(int i=0;i<split.length;i++)
		{
			if(i%2!=0)
			{
				char[] charArray = split[i].toCharArray();//a,m
				for(int k=charArray.length-1;k>=0;k--)
				{
					System.out.print(charArray[k]+"");
				}
				System.out.print(" ");
			}
			else
			{
				System.out.print(split[i]+" ");
			}
				
		}
		
	}

}
