package day4;

import java.util.Scanner;

public class quiz20 {

	public static void main(String[] args) {
//		20. 숫자맞추기 게임을 프로그래밍하여라. 
//
//		1 과 100 사이의 값을 반복적으로 입력해서  
//		컴퓨터가 생각한 값을 맞추면 게임이 끝난다 .
//		사용자가 값을 입력하면 
//		컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다.
//		사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 
//		몇 번 만에 숫자를 맞췄는지 알려준다.  
//
Scanner scanner = new Scanner(System.in);
		
		int num2 = (int)(Math.random()*100+1);
		int count =0;
		while(true) {
			System.out.println("숫자를 입력하시오");
			int num = scanner.nextInt();
			if(num2>num) {
				System.out.println("더 큰 수로 다시 시도해보세요.");
				count++;
			}
			else if(num2<num) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
				count++;
			}
			else if(num2 == num) {
				System.out.println("정답입니다.");
				System.out.println("시도 횟수는 ="+count);
				break;
			}
		}
	     /*

	      // 
	      int input  = 0,  answer = 0, count = 0 ;
	      // 컴퓨터에서 지정한 난수 
	      answer = (int)(Math.random() * 100 + 1); // 1~100
	      
	      Scanner scanner = new Scanner(System.in);

	      do {
	         System.out.print("1과 100사이의 정수를 입력하세요. >>");
	         input = scanner.nextInt();
	         count++;

	         if(input > answer) {
	            System.out.println("더 작은 수로 다시 시도해보세요.");   
	         } else if(input < answer) {
	            System.out.println("더 큰 수로 다시 시도해보세요.");         
	         }
	      } while(input!=answer);

	      System.out.println("정답입니다.");
	      System.out.printf("시도횟수는 %d 번입니다  ", count);
	      
	      */
		
//
//		[ 실행 결과 ]
//
//		1 과 100 사이의 값을 입력하세요 => 50
//		더 큰 수를 입력하세요.
//		1 과 100 사이의 값을 입력하세요   => 75
//		더 큰 수를 입력하세요.
//		1 과 100 사이의 값을 입력하세요  => 87
//		더 작은 수를 입력하세요.
//		1 과 100 사이의 값을 입력하세요  => 80
//		더 작은 수를 입력하세요.
//		1 과 100 사이의 값을 입력하세요   => 77 
//		더 작은 수를 입력하세요.
//		1 과 100 사이의 값을 입력하세요   => 76
//		맞췄습니다.
//		시도횟수는 6 번입니다  


	}

}
