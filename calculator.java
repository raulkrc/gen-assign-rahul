
import java.util.Scanner;
public class SumAverage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int sum = 0;
		for(int i=0; i<size; i++) {
			System.out.println("Enter Number " + (i+1));
			int temp = sc.nextInt();
			arr[i] = temp;
			sum += temp;
		}
		System.out.println("Sum = " + sum);
	}

}
