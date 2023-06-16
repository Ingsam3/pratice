package pratice;

import java.util.Scanner;
/*11021 A+B-7*/

public class pra05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int A ,B, i = 0;
		
		System.out.println(T);		
			for(i=1; i<T; i++) {
				A = sc.nextInt();
				B = sc.nextInt();
				if(A>=0 && B<=10) {
					for(i=1; i<T; i++) {
						System.out.println("Case #"+i+" : " + (A+B));
				 }
			  }	
			}
			
		}
	}


