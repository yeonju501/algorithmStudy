package algorithmStudy;
import java.util.Arrays;
import java.util.Scanner;

public class No1037 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] A = new int[num];
		for(int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		int N = A[0] * A[num - 1];
		sc.close();
		System.out.println(N);
	}

}
