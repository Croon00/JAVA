package java_quiz;

import java.util.Scanner;

public class day3_quiz {

	public static void main(String[] args) {
//		01.  다음 문장들의 출력결과를 예측한 후 직접 프로그래밍하여 결과를 확인하여라. 
//		( 오류가 있는 문장의 경우 오류 표시 )
//
		
		Scanner scanner = new Scanner(System.in);
//
		int x = 2;
		int y = 5;
		char c = 'A'; 
//
		System.out.println(y >= 5 || x < 0 && x > 2);   //true
		System.out.println(y += 10 - x++);  // 13
		System.out.println(x+=2); // 5
		System.out.println( !('A' <= c && c <='Z') ); // false
		// int 형보다 자료형이 작으면 연산을 하면 int 형으로 자동변환
		System.out.println('C'-c); // 2
		System.out.println('5'-'0'); // 5
		System.out.println(c+1); // 66
		System.out.println(++c); // B
		System.out.println(c++); // B
		System.out.println(c); // C
//
		
		
		
		
//
//		02. 정수형으로 변수를 정의하고 백의 자리 이하를 버리고 출력하도록 프로그래밍하여라.
//
//		[ 실행 결과 ]
//		 555 => 500 
//		 239 => 200
//
		int num1 = 555;
		int num2 = 239;
		int num3 = Math.round(num1/100)*100;
		int num4 = Math.round(num2/100)*100;
		System.out.println(num1+ "=>"+ num3 );
		System.out.println(num2+ "=>"+ num4 );

		
//
//
//		03. 바구니에는 10개의 사과를 담을 수 있다. n개의 사과가 있다면 몇개의 바구니가 필요한지 
//		프로그래밍하여라. (조건 연산자 이용)
//
//		[ 실행 결과 ]
//		사과의 수    :  88개
//		바구니의 수 :    9개
//
//
	    System.out.println("사과의 개수를 입력하여라");
		int apple = scanner.nextInt();
		int basket = apple/10 +1;
		System.out.println("사과의 수 : "+apple);
		System.out.println("바구니의 수 :" +basket);
		
				
				
				
//
//
//		04. 숫자를 입력하여 양수, 0, 음수 메세지를 출력하도록 프로그래밍하여라. 
//		(조건 연산자 이용)
//
	  
		
		
				
				
//
//
//		05.  화씨(Fahrenheit) 온도를 섭씨(Celcius) 온도로 변환되도록 프로그래밍 하여라. 
//		(화씨 온도를 섭씨 온도로 변경하는 공식은 인터넷을 이용한다. )
//
//		[ 실행 결과 ]
//
//		화씨(Fahrenheit) : 77 도 
//		섭씨(Celcius)  : 25.0 도 
//
		System.out.println("화씨 온도를 입력하시오.");
		double Fahrenheit = scanner.nextInt();
		double Celcius = Fahrenheit*1.8 +32;
		System.out.println("화씨(Fahrenheit) : "+Fahrenheit+"도" );
		System.out.println("섭씨(Celcius) : "+Celcius+"도" );
		
		
//
//		06.  출력 결과를 참조하여 주문 메뉴에 따라 총합이 출력되도록 프로그래밍 하여라 
//		(돈까스 8000원,  칼국수 6000원,  왕만두 5000원) 
//
//		  [ 실행 결과 ] 
//
//		  돈까스  X  ?  =  ?
//		  칼국수  X  ?  =  ?
//		  왕만두  X  ?  =  ?
//		============
//		  총합 :  ? 
//
		System.out.println("돈까스 주문 수");
		int xx1 = scanner.nextInt();
		System.out.println("칼국수 주문 수");
		int xx2 = scanner.nextInt();
		System.out.println("왕만두 주문 수");
		int xx3 = scanner.nextInt();
		
		int donkas = 8000*xx1;
		int kalguks = 6000*xx2;
		int kingmandu = 5000*xx3;
		int sum = donkas + kalguks + kingmandu;
		
		System.out.println("돈까스 X" +xx1+ donkas);
		System.out.println("칼국수 X"+xx2+ kalguks);
		System.out.println("왕만두 X"+xx3+ kingmandu);
		System.out.println("===========================");
		System.out.println("총합 : " + sum);
		
		
//
//		07.  입력 데이타가 숫자인지 숫자가 아닌지 출력되도록 프로그래밍 하여라. 
//		( 조건연산자, Scanner, charAt(0)) 
//
		System.out.println("입력하시오"););
		String data = scanner.next();
		
		char ch = data.charAt(0);
		
		System.out.println(('0' <= ch && ch <='9')? "숫자이다":"숫자가 아니다");

//
//
//		08. 다음의 문장들을 조건식으로 표현하라.
//
//		1. int 형 변수 x 가 10 보다 크고 20 보다 작을 때  true인 조건식
//		2. char 형 변수 ch 가 공백이나 탭(\t)이 아닐 때  true인 조건식
//		3. char  형 변수 ch 가 'x' 또는 'X' 일 때  true인 조건식
//		4. char 형 변수 ch 가 숫자(‘0’~‘9’)일 때  true인 조건식 true
//		5. char 형 변수 ch 가 영문자(대문자 또는 소문자) 일 때  true 인 조건식
//		6. boolean 형 변수 powerOn 이  false 일 때 true 인 조건식
//		7. 문자열 참조변수 str 이 "yes" 일 때 true 인 조건식
//
		
		
		
		
		
//
//
//		09. 534 자루의 연필을 30명의 학생들에게 똑같은 수로 나누어 줄때 
//		학생 당 몇 개를  가질 수 있고 최종적으로 몇개가 남는지 프로그래밍하여라. 
//
//		  [ 실행 결과 ] 
//		  
//		  학생 당 가질 수 있는 연필 수는  ? 개 입니다.   
//		  남은 연필 수는  ? 개 입니다.    
//
		
		
		
		
//
//		10. 입력 받은 숫자가 2의 배수 또는 3의 배수이지만 6의 배수가 아닌 경우 
//		     "Hello world!!!" 가 출력되도록 프로그래밍 하여라. 
//		(조건 연산자 이용)
//
//		[ 실행 결과 ] 
//
//		  정수 입력  >>  33
//
//		  Hello world!!!
//
		
		
		
//
//
//		11. 2자리의 정수(10~99사이)를 입력받고, 10의 자리와 1의 자리가 같은지 
//		     판별하여 출력되도록 프로그래밍 하여라.
//		(조건 연산자 이용)
//
//
		
		int a1 = scanner.nextInt();
		 if (a1>=10 && a1<=99) {
			 
		 }
		
		
		
//		  [ 실행 결과 ] 
//		   
//		  2자리 정수 입력(10~99) >>	  78
//
//		  결과 => 같지 않다. 
//
		
		
		
		
		
//
//		12. 정수로 된 돈의 액수를 입력받아 오만 원권, 만 원권, 천 원권, 500짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전 각 몇 개로 변환되는지 프로그래밍 하여라.
//
//		[ 실행 결과 ] 
//
//		금액을 입력하시오 >> 65376
//
//		오만원권 1 매
//		만원권 1 매
//		천원권 5 매
//		백원 3 개
//		오십원 1 개
//		십원 2 개
//		일원 6 개
//
		
		
		
//
//
//		13. 원화를 입력받아 달러로 바꾸어 출력되도록 프로그래밍 하여라.
//		( 환율 $1=1100원으로 가정.  소숫점 처리는 3번째 자리에서 반올림)
//
//		[ 실행 결과 ] 
//
//		원화를 입력하세요(단위 원) >> 3300
//
//		3300원은 $3.00 입니다.
//
		 System.out.println("원화를 입력하시오.");
		 double won = scanner.nextDouble();
		 double dollar = Math.round(won/100)*100.00;
		 
		 System.out.println(won+"원은  $"+dollar+"입니다.");
		 
		 
//
//		14.  삼각형의 변의 길이를 나타내는 정수를 3개 입력받고 
//		  이 3개의 수로 삼각형을 만들 수 있는지 프로그래밍하여라. 
//		 ( 삼각형이 되려면 두변의 합이 다른 한 변의 합보다 커야 한다. )
//		(조건 연산자 이용)
//
//
		 System.out.println("변의 길이를 입력하시오.");
		 int byn1 = scanner.nextInt();
		 int byn2 = scanner.nextInt();
		 int byn3 = scanner.nextInt();
		 
		 String ch1;
		 ch1 = (byn1+byn2>byn3 || byn1+byn3>byn2 || byn2+ byn3 > byn1) ?"삼각형이 됩니다.":"삼각형이 안됩니다.";
		 
		 
		 
		 
//		[ 실행 결과 ] 
//
//		변의 길이1 >> 4
//		변의 길이2 >> 3
//		변의 길이3 >> 5
//
//		삼각형이 됩니다.

	}

}
