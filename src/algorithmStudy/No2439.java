package algorithmStudy;
import java.io.*;

public class No2439 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i = 1; i <= n; i++) {
			for(int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int x = 1; x <= i; ++x) {
				System.out.print("*");
			}
			System.out.println("");
		}
		br.close();
		
	}

}
