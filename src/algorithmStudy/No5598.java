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
			System.out.print(result); //���⼭ �������� ���� ���ڰ� �߰�����
			br.close();
		}
	}
}