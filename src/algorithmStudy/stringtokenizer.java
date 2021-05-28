package algorithmStudy;

import java.util.*;

public class stringtokenizer {
	public static void main(String[] args) {
		String a1 = "H/E/L/L/O";
		StringTokenizer st = new StringTokenizer(a1, "/");
		StringBuffer sb = new StringBuffer();
		while(st.hasMoreTokens()) {
			sb.append(st.nextToken());
		}
		char a2[] = sb.toString().toCharArray();
		System.out.print(a2);
		String a3 = null;
		a3 = "kgkgk";
		String[] array2 = a3.split("g");
		System.out.print(Arrays.toString(array2));
		
	}

}
