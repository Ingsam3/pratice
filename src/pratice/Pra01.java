package pratice;

import java.util.Scanner;

public class Pra01 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int H=0 , M=0;
	int BH=23, BM=45;
	int CM=0 , reM=0; // 
	//시간 입력 = - 45분  
	
	
	System.out.println("시간을 입력하시오");
	H = sc.nextInt();
	if(0<=H && H<=23) {
		System.out.println("분을 입력하시오");
		M=sc.nextInt();
		if(0<=M && M<=59) {	
			
			if(M >= BM) {
				//M < BM - 입력 분이 59분 보다 작을 때  (일반적)
				reM = M- BM;
				System.out.println("알람 예정 시간은 "+H+"시 "+reM+"분 입니다.");
			}else if(M < BM) {
				// M > BM - 입력 분이 59분 보다 클 때  (시간도 줄여야함)
				reM=0;
				H= H-1;
				CM = M - BM; 
				int result = CM+60;
				 // 예) 입력 시간 11시 20분 => 10시 35분
				System.out.println("알람 예정 시간은 "+H+"시 "+result+"분 입니다.");
			}else {
				System.out.println("다시입력해주세요");
			}
			
			
		}else {
			System.out.println("분을 다시입력하시오");
		}
		
		
	}else {
		System.out.println("시간을 다시 입력하시오");
	}
	
	
}
}

/*
 답안
 public class Main {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
		
		int H = in.nextInt(); // 시
		int M = in.nextInt(); // 분
		in.close();
		
		if(M < 45) {
			H--;		// 시(hour) 1 감소
			M= 60 - (45 - M); 	// 분(min) 감소
			if(H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		}
		else {
			System.out.println(H + " " + (M - 45));
		}
	}
}
  
  
 */
