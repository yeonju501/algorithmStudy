package algorithmStudy;
import java.io.*;
public class No2576 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		int min = 0;
		int su;
		for(int i = 0; i < 7; i++) {
			su = Integer.parseInt(br.readLine());
			if (su%2 == 1) {
				sum += su;
				if(min == 0) {
					min = su;
				}else if(su < min) {
					min = su;		
				}
			}
		}
		if(sum == 0) {
			System.out.println("-1");
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
		br.close();
	}

}
