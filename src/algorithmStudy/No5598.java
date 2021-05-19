package algorithmStudy;
import java.io.*;

public class No5598 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char result;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) <= 'C') {
				result = (char)(str.charAt(i) + 23);
			}else {
				result = (char)(str.charAt(i) - 3);
			}
			System.out.print(result);
		}
/*		StringBuilder sb = new StringBuilder();
		for(String obj : s) {
			if(obj.equals("D")){
				obj = "A";
			}else if(obj.equals("E")) {
				obj = "B";
			}else if(obj.equals("F")) {
				obj = "C";
			}
			else if(obj.equals("G")) {
				obj = "D";
			}
			else if(obj.equals("H")) {
				obj = "E";
			}
			else if(obj.equals("I")) {
				obj = "F";
			}
			else if(obj.equals("J")) {
				obj = "G";
			}
			else if(obj.equals("K")) {
				obj = "H";
			}
			else if(obj.equals("L")) {
				obj = "I";
			}
			else if(obj.equals("M")) {
				obj = "J";
			}
			else if(obj.equals("N")) {
				obj = "K";
			}
			else if(obj.equals("O")) {
				obj = "L";
			}
			else if(obj.equals("P")) {
				obj = "M";
			}
			else if(obj.equals("Q")) {
				obj = "N";
			}
			else if(obj.equals("R")) {
				obj = "O";
			}
			else if(obj.equals("S")) {
				obj = "P";
			}
			else if(obj.equals("T")) {
				obj = "Q";
			}
			else if(obj.equals("U")) {
				obj = "R";
			}
			else if(obj.equals("V")) {
				obj = "S";
			}
			else if(obj.equals("W")) {
				obj = "T";
			}
			else if(obj.equals("X")) {
				obj = "U";
			}
			else if(obj.equals("Y")) {
				obj = "V";
			}
			else if(obj.equals("Z")) {
				obj = "W";
			}
			else if(obj.equals("A")) {
				obj = "X";
			}
			else if(obj.equals("B")) {
				obj = "Y";
			}
			else if(obj.equals("C")) {
				obj = "Z";
			}
			
		sb.append(obj);
		}
		String val = sb.toString();
		System.out.println(val);
	}*/
	}
	

}
