package java_quiz;

import java.util.Scanner;

public class day1_quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 자바 퀴즈 1

//		01. 한 줄에 한 글자씩 자신의 이름을 출력하도록 3가지 방식으로 프로그래밍하여라. 
//
//		[ 실행 결과 ] 
//		홍
//		길
////		동
//		System.out.printf("홍&n");
//		System.out.println("길");
//		System.out.print("동");
//		
//		
////
////
////		02. 2개의 변수 x, y의 합과 차를 계산식과 결과가 출력되도록 2가지 방식으로 프로그래밍 하여라. 
////
////		[ 실행 결과 ]
////		82 + 17 = 99
////		82 - 17 = 65
////		
//		int x = 82;
//		int y = 17;
//		int sum = x + y;
//		int minus = x - y;
//		System.out.println("82 + 17 =" + sum);
//		System.out.println("82 - 17 =" + minus);
//		
////
////		03. 2개의 변수 x, y의 합과 평균이 출력되도록 2가지 방식으로 프로그래밍 하여라. 
////
////		[ 실행 결과 ]
////		x 값은 ? 입니다. 
////		y 값은 ? 입니다.
////		합계는 ? 입니다. 
////		평균은 ? 입니다. 
////		
//		   System.out.println("x 값은 " + x + " 입니다.");
//		   System.out.println("y 값은 " + y + " 입니다.");
//		   System.out.println("합계는 " + (x+y) + " 입니다.");
//		   System.out.println("평균은 " + ((x+y)/2) + " 입니다.");
//		   System.out.println("=================");
//		   System.out.printf("x 값은 %.1f 입니다.%n", x);
//		   System.out.printf("y 값은 %.1f 입니다.%n", y);
//		   System.out.printf("합계는 %.2f 입니다.%n", x+y);
//		   System.out.printf("평균은 %.2f 입니다.%n", (x+y)/2);
//		
////
////
////		04. 삼각형의 밑변과 높이를 실수형 변수로 정의하고 삼각형의 넓이가 출력되도록 프로그래밍 하여라. 
////
////		[ 실행 결과 ]
////		삼각형의 밑변 = ? 
////		삼각형의 높이 = ?
////		삼각형의 넓이 = ?
////		
//		float byn = 20f;
//		float height = 20f;
//		float nubi = byn * height;
//		System.out.println("삼각형의 밑변" + byn);
//		System.out.println("삼각형의 높이" + height);
//		System.out.println("삼각형의 넓이" + nubi);
//		
//		
////
////
////		05. 3개의 변수 x, y, z를 정의하고 변수 값을 서로 변경하여 출력되도록 프로그래밍 하여라. 
////
////		[ 실행 결과 ]
////
////		변경 전 >
////		x = 1    y = 2    z = 3
////
////		변경 후 >
////		x = 2    y = 3    z = 1
////
////
////
////
////
////		06. 상수 형태로 원주율을 정의하고 반지름에 따라 원의 넓이가 출력되도록 프로그래밍 하여라. 
////		// PI = 3.1416
////
////		[ 실행 결과 ]
////
////		반지름 : 12.5
////		넓이 : 1963.4999999
////
//		final double PI = 3.1416;
//		float zirm = 12.5f;
//		double nubi2 = zirm*zirm*PI;
//		
//		System.out.println("반지름 :" +zirm);
//		System.out.println("넓이 :" +nubi2);
//		
//		
////
////
////
////
////		07. 분식집의 메뉴 가격은 아래와 같다. 
////
////		떡볶이 : 2500원
////		튀김 : 700원
////		순대 : 3000원 
////
////		친구들과 떡볶이 2인분, 튀김 8개, 순대 1인분을 주문하였을때 총 금액이 얼마인지
////		출력되도록 프로그래밍 하여라. 
////
////		[ 실행 결과 ]
////		떡볶이 2인분, 튀김 8개, 순대 1인분의 가격은   ?   입니다. 
////		
//		int duckbokki = 2500;
//		int twkim = 700;
//		int sundae = 3000;
//		int sum2 = duckbokki + twkim + sundae;
//		
//		System.out.println("떡볶이 2인분, 튀김 8개, 순대 1인분의 가격은"+ sum2 );
//		
////
////		08. printf() 를 이용하여 상품명과 가격을 변수로 정의하고 출력되도록 프로그래밍 하여라. 
////		(가격은 오른쪽 기준으로 출력되도록 한다) 
////
////		품명 : 한우 꽃등심         가격 :    80000
////		품명 : 로봇 청소기         가격 :   550000
////		품명 : 맥심 모카            가격 :      7000
////
////
//		String a = "한우 꽃등심";
//		String b = "로봇 청소기";
//		String c = "맥심 모카";
//		
//		int x1 = 80000;
//		int x2 = 550000;
//		int x3 = 7000;
//		
//		System.out.printf("품명 : %s         가격 : %10d",a, x1);
//		
//		 String item;
//	      int price;
//	      
//	      item = "한우 꽃등심";
//	      price = 80000;
//	      System.out.printf("품명 : %-9s가격 :%10d%n", item, price);
//	      item = "로봇 청소기";
//	      price = 550000;
//	      System.out.printf("품명 : %-9s가격 :%10d%n", item, price);
//	      item = "맥심 모카";
//	      price = 7000;
//	      System.out.printf("품명 : %-9s가격 :%10d%n", item, price);
////		09. 임의의 10진수 정수 값이 2진수, 8진수, 16진수로 출력되도록 프로그래밍 하여라. 
////		(10 진수를 2진수로 표시할 경우 Integer.toBinaryString(n) 이용)
////
////		[ 실행 결과 ]
////		10진수   16
////		  2진수   10000
////		  8진수    020
////		16진수    0x10
////
////
//		
//		
////
////		10. 키보드에서 입력한 고객의 성과 이름을 이용하여 
////		    메세지가 출력되도록 프로그래밍 하여라. 
////
////		[ 실행 결과 ]
////		성은?     홍 
////		이름은?  길동
////
////		축하드립니다. 홍길동 고객님. 이벤트에 당첨되셨습니다.
////
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("성은?");
//		String sung = scanner.nextLine();
//		
//		System.out.println("이름은 ?");
//		String name = scanner.nextLine();
//		
//		System.out.println("축하드립니다." +sung+name+"고객님. 이벤트에 당첨되셨습니다.");
//		
//	     String data;
//	      Scanner scanner = new Scanner(System.in);
//	      System.out.print("성은?      ");
//	      data = scanner.next();
//	      System.out.print("이름은?   ");
//	      data += scanner.next();
//	        System.out.printf("%n%n축하드립니다. %s 고객님. 이벤트에 당첨되셨습니다.", data);
//		
////
////		11. 수강생명, 수학, 과학, 영어 점수를 키보드로 입력받아 
////		     아래와 같이 출력되도록 프로그래밍 하여라. 
////
////		[ 실행 결과 ]
////		수학 : 96
////		과학 : 88
////		영어 : 80
////		총점 :  ?
////		평균 :  ?
////
////		홍길동님!!! 수고하셨습니다. 
////
////
////
////		12. 키보드에서 입력한 정수 값에 10을 더한 값과 10을 뺀 값이 
////		     출력되도록 프로그래밍 하여라. 
////
////		[ 실행 결과 ]
////		정수값 : 7
////
////		10을 더한 값은 17 입니다.
////		10을 뺀 값은 -3 입니다. 
////
////	
//		int num2 = 10;
//		int num1 = scanner.nextInt();
//		int num3 = num1 + num2;
//		int num4 = num1 - num2;
//		
//		System.out.println(num2+"을 더한 값은" + num3);
//		System.out.println(num2+"을 뺀 값은" + num4);
////
////
////		13. 키보드에서 실수를 입력받아 소숫점 이하 둘째 자리까지 출력하도록 프로그래밍 하여라. 
////
////		[ 실행 결과 ]
////		입력 =>  1.59254
////		출력 =>  1.59
////
//		float num5 = scanner.nextInt();
//		
//		System.out.printf("입력 =>%f",num5);
//		System.out.printf("출력 =>%.2f",num5);
//
////
//
//		14. 다음 문장들의 출력결과를 예측한 후 직접 프로그래밍하여 결과를 확인하여라. 
//		( 오류가 있는 문장의 경우 오류 표시 )
//
	      System.out.println("1" + "2"); // 12
	      System.out.println(true + ""); // true
	      // 문자 + 문자 => 정수 + 정수 
	      System.out.println('A' + 'B'); // 131    65 + 66 유니코드 값이 더해짐
	      // 문자 + 정수 => 정수 + 정수 
	      System.out.println('1' + 2); // 51    49 + 2 유니코드 값이 더해짐
	      System.out.println('1' + '2'); //99  49 + 50
	      // 문자 + 문자열 => 문자열 + 문자열 
	      System.out.println('J' + "ava"); // Java
//	      System.out.println(true + null); // 오류 
	      
//	      문자열 + any type → 문자열 + 문자열 → 문자열
//	      any type + 문자열 → 문자열 + 문자열 → 문자열
//	      문자와 문자의 덧셈연산의 결과는 형 정수값이 된다 왜냐하면 형보다 작은 int . int
//	      타입 은 형으로 변환된 후에 덧셈연산이 진행되기 때문이다 







	}

}
