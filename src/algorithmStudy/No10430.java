package algorithmStudy;
import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;


public class No10430 {

	/*
	 * public static void main(String[] args) { Scanner in = new Scanner(System.in);
	 * 
	 * int A = in.nextInt(); int B = in.nextInt(); int C = in.nextInt();
	 * 
	 * in.close();
	 * 
	 * System.out.println( (A+B)%C ); System.out.println( (A%C + B%C)%C );
	 * System.out.println( (A*B)%C ); System.out.println( (A%C * B%C)%C ); }
	 * 
	 */
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		System.out.println( (A+B)%C );
		System.out.println( (A%C + B%C)%C );
		System.out.println( (A*B)%C );
		System.out.println( (A%C * B%C)%C );

	}
}