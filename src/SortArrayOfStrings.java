import java.util.Arrays;
import java.util.Scanner;


public class SortArrayOfStrings {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		String[] towns = new String[n];
		for (int i = 0; i < towns.length; i++) {
			towns[i] = input.next();
		}
		
		Arrays.sort(towns);
		
		for (String town : towns) {
			System.out.println(town);
		}
		
		input.close();
	}

}
