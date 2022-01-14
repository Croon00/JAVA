package day4;

import java.util.Scanner;

public class quiz18 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		18.  51~100 사이의 정수로 된 임의의 수를 난수를 이용하여 정의한 후  
//		숫자를 입력하여 임의의 수를 맞추도록 프로그래밍 하여라. 
//
//		[ 실행 결과 ]
//
//		 51과 100사이의 정수를 입력하세요. >>  77
//		더 작은 수로 다시 시도해보세요.
//		 51과 100사이의 정수를 입력하세요. >>  60
//		더 큰 수로 다시 시도해보세요.
//		 51과 100사이의 정수를 입력하세요. >>  67
//		더 큰 수로 다시 시도해보세요.
//		 51과 100사이의 정수를 입력하세요. >>  70
//		더 큰 수로 다시 시도해보세요.
//		51과 100사이의 정수를 입력하세요. >>  75
//		정답입니다.

		Scanner scanner = new Scanner(System.in);
		
		int num2 = (int)(Math.random()*100+51);
		int num3 = 1;
		
		while(num3 == 1) {
			System.out.println("숫자를 입력하시오");
			int num = scanner.nextInt();
			if(num2>num) {
				System.out.println("더 큰 수로 다시 시도해보세요.");
			}
			else if(num2<num) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
			}
			else if(num2 == num) {
				System.out.println("정답입니다.");
				break;
			}
		}
	

	}

}
