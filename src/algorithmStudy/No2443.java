package algorithmStudy;
import java.io.*;

public class No2443 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i = 1; i <= n; i++) {
			for(int x = 1; x < i; x++) {
				System.out.print(" ");
			}
			for(int j = 2*(n-1)+1; j >= 2*(i-1)+1; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
