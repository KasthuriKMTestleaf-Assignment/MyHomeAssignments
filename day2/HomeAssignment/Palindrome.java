package week1.day2.HomeAssignment;

public class Palindrome {

	public static void main(String[] args) {
		int numberPal = 1551;
		int temp=numberPal;
		int reversePal = 0;
		while(temp>0)
		{
			reversePal=reversePal*10+temp%10;
			temp=temp/10;
		}
		if(numberPal==reversePal)
		{
			System.out.println(numberPal+" is Palindrome");
		}
		else
		{
			System.out.println(numberPal+" is not Palindrome");
		}
	}

}
