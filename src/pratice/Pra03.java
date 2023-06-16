package pratice;

import java.util.Scanner;
/*백준 25304*/
public class Pra03 {
	public static void main(String[] args) {
		/*
		   첫째 줄에는 영수증에 적힌 총 금액 
			X가 주어진다.
			
			둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 
			N이 주어진다.
			
			이후 
			N개의 줄에는 각 물건의 가격 
			a와 개수 
			b가 공백을 사이에 두고 주어진다.
					  
		  구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다. 
		  일치하지 않는다면 No를 출력한다.
		  
		 */
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();//총 가격
		int N = sc.nextInt();//총 개수
		
		for(int i=0; i<N; i++) { //총 물건의 갯수 만큼 
			int a = sc.nextInt();
			int b = sc.nextInt();//가격 + 갯수 물어봄
			
			X = X -(a*b); // 총 액 - (가격*개수) 반복
		
		}
		if(X == 0) { // X가 0이 되면 영수증 값이 맞음
			System.out.println("Yes");
			
		}else {
			System.out.println("No");
		}
		
		
		
		
		
		
		 
		
		
	}
}
