package day5;

import java.util.Scanner;

public class quiz15 {

	public static void main(String[] args) {
		
		int score [];
//		15. 학생수와 각 학생들의 점수를 입력받아 평균 점수를 구하는 프로그램을 작성하여라. 
//
//		[ 실행 결과 ]
//
//		1. 학생수    2. 점수 입력    3. 점수 리스트     4. 평균       5. 종료
//		============================================
//		선택 > 1
//		학생수 >  3
//
//
//		1. 학생수    2. 점수 입력    3. 점수 리스트     4. 평균       5. 종료
//		============================================
//		선택 > 2
//		학생 점수1 >  85
//		학생 점수2 >  56
//		학생 점수3 >  34
//
//
//		1. 학생수    2. 점수 입력    3. 점수 리스트     4. 평균       5. 종료
//		============================================
//		선택 > 3
//		학생 점수1 =  85
//		학생 점수2 =  56
//		학생 점수3 =  34
//
//
//
//		1. 학생수    2. 점수 입력    3. 점수 리스트     4. 평균       5. 종료
//		============================================
//		선택 > 4
//		평균 =   ?
//
//
//		1. 학생수    2. 점수 입력    3. 점수 리스트     4. 평균       5. 종료
//		============================================
//		선택 > 5
//		프로그램이 종료되었습니다. 

		   int choice, numOfStudent;
		      Scanner scanner = new Scanner(System.in);
		      // null로 지정하면 가변 가능 
		      int[] score = null;
		      int sum = 0;
		      
		      do {
		         // 메뉴 출력 
		         System.out.println("1. 학생수    2. 점수 입력    3. 점수 리스트       4. 평균       5. 종료");
		         System.out.println("==============================================================");
		         System.out.print("선택 > ");
		         
		         choice = scanner.nextInt();
		         
		         if (choice == 1) {
		            System.out.print("학생수 >  ");
		            numOfStudent = scanner.nextInt();
		            // 배열 생성 
		            score = new int[numOfStudent];
		         }
		         else if (choice == 2) {
		            for (int i = 0; i < score.length; i++) {
		               System.out.print("학생 점수" + (i+1) + " > "); 
		               score[i] = scanner.nextInt();
		            }
		         }
		         else if (choice == 3) {
		            for (int i = 0; i < score.length; i++) {
		               System.out.println("학생 점수" + (i+1) + " = " + score[i]); 
		            }   
		         }
		         else if (choice == 4) {
		            sum = 0;
		            for (int i = 0; i < score.length; i++) {
		               sum += score[i];
		            }   
		            System.out.println("평균 =   " + (sum/(double)score.length)); 
		         }      
		         
		         else if (choice == 5) {
		            System.out.println("프로그램이 종료되었습니다.");
		            break;
		         }
		      
		      
		      } while(true);
		      

	}

}
