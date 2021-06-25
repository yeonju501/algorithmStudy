package algorithmStudy;
import java.io.*;

public class No1330 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] nums = str.split(" ");
		int A = Integer.parseInt(nums[0]);
		int B = Integer.parseInt(nums[1]);
		if(A > B) {
			System.out.println(">");
		}else if(A < B) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
		br.close();
		
	}

}
