package day5;

public class quiz09 {

	public static void main(String[] args) {
		   // 09. 2 차원 배열 에 담긴 모든 값의 총합과 평균을 출력하도록 프로그래밍하여라. 
//      int[][] arr = {
//            { 5, 5, 5, 5, 5},
//            {10,10,10,10,10},
//            {20,20,20,20,20},
//            {30,30,30,30,30}
//            };
//
//         [ 실행 결과 ] 
//         모든합은 ... ?
//         평균은.... ?

      int[][] arr = {
            { 5, 5, 5, 5, 5},
            {10,10,10,10,10},
            {20,20,20,20,20},
            {30,30,30,30,30}
      };

      int sum = 0;
      double num = 0;  // 전체 갯수 
      for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[i].length; j++) {
            sum += arr[i][j];
            num++;
         }
      }
      System.out.println("모든합은 ... " + sum);
      System.out.println("평균은 ... " + sum + " / " + num + " = " + sum/num);

      System.out.println("========================");

	}

}
