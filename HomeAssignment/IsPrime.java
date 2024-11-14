package week1.day1.HomeAssignment;

public class IsPrime {

	public static void main(String[] args) {
		int n=98;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println(n+" is not prime number");
				break;
			}
			else
			{
				System.out.println(n+" is prime number");
				break;
			}
			
		}


	}

}
