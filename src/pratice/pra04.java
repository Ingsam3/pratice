package pratice;

import java.util.Scanner;
/*백준 25314*/
public class pra04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num=sc.nextInt();
		String Long = "long";
		String Int = "int";
		
		if(num>=4 && num<=1000 ) {
			int cnt = num/4;
			for(int i=0; i<cnt; i++) {
			System.out.println(Long);
					
			}System.out.println(Int);
		}
	}
}
