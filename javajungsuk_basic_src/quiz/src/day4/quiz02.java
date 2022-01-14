package day4;

import java.util.Scanner;

public class quiz02 {

	public static void main(String[] args) {

//07.  369게임. 1~99까지의 정수를 입력받고 정수에 3, 6, 9 중 하나가 있는 경우는 
//"박수짝"을 출력하고 두 개 있는 경우는 "박수짝짝"을 출력되도록 프로그래밍하여라. 
// 예를 들면  입력된 수가 13인 경우 "박수짝"을, 
// 36인 경우 "박수짝짝"을 출력하면 된다.
//
//[ 실행 결과 ]  
//1~99 사이의 정수를 입력하시오  >>  36
//박수짝짝
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1에서 99까지의 숫자를 입력하시오.");
		int num = scanner.nextInt();
		
		if(1<=num && num<=99) {
			if(num<=10) {
				if(num/3 ==0 && num !=0) {
					System.out.println("박수짝");
				}
			}else if(num/10 == 3 || num/10 ==6 || num/10 == 9 ) {
				System.out.printf("박수짝");
				if(num%10 == 3 || num%10 ==6 || num%10 == 9) {
					System.out.printf("짝");
				}
			}else {
				System.out.println("3,6,9가 안들어있다.");
			}
		}else {
			System.out.println("1부터 99까지의 수를 입력하시오.");
		}

	}
//	 System.out.print("1~99 사이의 정수를 입력하시오  >>  ");
//     Scanner scanner = new Scanner(System.in);
//
//     int num = scanner.nextInt();
//     int q, r; // 10~99 일의 자리, 10의 자리 
//     
//     if (num<10 && num%3==0 && num!=0) { // 일의 자리 
//        System.out.println("\n박수짝");
//     } else if (num>=10){ 
//        // 10~99
//        q = num/10;  // 10의 자리 
//        r = num%10;  // 1의 자리 
//        System.out.printf("%d  %d  %d%n", num, q, r);
//        if ( q%3 == 0 &&  r%3 == 0 && q!=0 && r!=0) 
//              System.out.print("박수짝짝");
//        else if (q==3 || q==6 || q==9 || r==3 || r==6 || r==9) 
//           System.out.print("박수짝");
//     } 
//  System.out.println("\n====================");   

  

//}

}

