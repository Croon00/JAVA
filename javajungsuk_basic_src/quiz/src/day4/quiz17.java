package day4;

import java.util.Scanner;

public class quiz17 {

	public static void main(String[] args) {
//		17.  입력받은 숫자의 각 자리의 합이 출력되도록 프로그래밍 하여라. 
//
//		[ 실행 결과 ]
//
//		숫자를 입력하세요 ....   1234
//
//		1 + 2 + 3 + 4 = 10

		  int num = 0, sum = 0;
	      System.out.print("숫자를 입력하세요.(예:12345)>");

	      Scanner scanner = new Scanner(System.in);
	      num = scanner.nextInt();      

	      while(num!=0) {    
	         // num을 10으로 나눈 나머지를 sum에 더함
	         sum += num%10;    // sum = sum + num%10;
	         System.out.printf("sum=%3d num=%d%n", sum, num);

	         num /= 10;   // num = num / 10;  num을 10으로 나눈 값을 다시 num에 저장
	      }

	      System.out.println("각 자리수의 합:"+sum);




	}

}
