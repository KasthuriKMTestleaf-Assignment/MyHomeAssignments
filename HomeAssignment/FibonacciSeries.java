package week1.day1.HomeAssignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		int fibRange=8;
		int firstNumber=0;
		int secondNumber=1;
		int toTal;
		System.out.println(firstNumber);
		for(int i=1;i<=fibRange-1;i++)
		{
			toTal=secondNumber+firstNumber;
			System.out.println(secondNumber);
			firstNumber=secondNumber;
			secondNumber=toTal;
		}

	}

}
