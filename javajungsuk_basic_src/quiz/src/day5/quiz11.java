package day5;

import java.util.Arrays;

public class quiz11 {

	public static void main(String[] args) {

//11. 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 출력하는 프로그램을 
//작성하여라. 
//
//[ 실행 결과 ] 
//    ???

		   int[] ballArr = {1,2,3,4,5,6,7,8,9};
		      int[] ball3 = new int[3];
		      
		      // ballArr . 배열 의 임의의 요소를 골라서 위치를 바꾼다
		      for(int i=0; i< ballArr.length;i++) {
		         int j = (int)(Math.random() * ballArr.length);
		         // 값 교체 
		         int tmp = 0;
		         tmp = ballArr[i];
		         ballArr[i] = ballArr[j];
		         ballArr[j] = tmp;
		      }
		      // 배열 복사 
		      // 배열1에서 배열2로 시작인덱스~마지막인덱스-1 복사 
		      // System.arraycopy(배열1, 시작인덱스, 배열2, 시작인덱스, 마지막인덱스);
		      
		      System.arraycopy(ballArr,0, ball3,0,3);
		      System.out.println(Arrays.toString(ballArr));
		      System.out.println(Arrays.toString(ball3));
		      
		      for(int i=0;i<ball3.length;i++) {
		         System.out.print(ball3[i]);
		      }
		      System.out.println();
		      
		      for(int i=0;i<3;i++) {
		         System.out.print(ballArr[i]);
		      }

	}

}
