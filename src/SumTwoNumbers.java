import java.util.Scanner;


public class SumTwoNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int firstNumber = input.nextInt();
		int secondNumber = input.nextInt();
		long sum = (long)firstNumber+secondNumber;
		System.out.println(sum);
		input.close();

	}

}
