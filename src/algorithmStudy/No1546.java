package algorithmStudy;
import java.io.*;
public class No1546 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sub = Integer.parseInt(br.readLine());
		int score;
		int max = 0;
		String [] scoreStr = br.readLine().split(" ");
		double[] jumsu = new double[sub];
		for(int i = 0; i < sub; i++) {
			score = Integer.parseInt(scoreStr[i]);
			jumsu[i] = score;
			if(max == 0) {
				max = score;
			}else if(score > max) {
				max = score;
			}
		}
		double [] jumsu2 = new double[sub];
		double sum = 0;
		for(int i = 0; i < sub; i++) {
			jumsu2[i] = jumsu[i]/max*100;
			sum += jumsu2[i];
		}
		System.out.println(sum/sub);
		br.close();
	}

}
