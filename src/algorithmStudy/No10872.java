package algorithmStudy;
import java.io.*;

public class No10872 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int fac = 1;
		if(N == 0) {
			fac = 1;
		}else {
			while(N != 0) {
				fac = fac * N;
				N--;
			}
		}
		System.out.println(fac);
	}

}
