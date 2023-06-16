package pratice;

import java.util.Scanner;
/*백준 8393*/
public class Pra02 {
	public static void main(String[] args) {
		//모든 합 구하기
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		
		if(n>=1 && n <=10000) {
			for(int i=1; i<=n; i++ ) {
				sum+=i;
			}
			System.out.println(sum);
		}
		
}
}
