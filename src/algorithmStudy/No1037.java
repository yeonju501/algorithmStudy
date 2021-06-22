package algorithmStudy;
import java.io.*;

public class No1037 {
	public static void Main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int su = Integer.parseInt(br.readLine());
		String Astr = br.readLine();
		int N;
		String[] Astrarr = Astr.split(" ");
		int[] A = new int[Astrarr.length];
		for(int i = 0; i < Astrarr.length; i++)
			A[i] = Integer.parseInt(Astrarr[i]);
		if(su == 1)
			N = A[0]^2;
		else
			N = A[0] * A[A.length - 1];
		System.out.println(N);
			
	}

}
