package algorithmStudy;
import java.io.*;

public class No5598 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char result;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) <= 'C') {
				result = (char) (str.charAt(i) + 23);
			}else {
				result = (char) (str.charAt(i) - 3);
			}
			System.out.print(result); //여기서 출력해줘야 다음 글자가 추가가능
			br.close();
		}
	}
}