package day5;

public class quiz09 {

	public static void main(String[] args) {
		   // 09. 2 ���� �迭 �� ��� ��� ���� ���հ� ����� ����ϵ��� ���α׷����Ͽ���. 
//      int[][] arr = {
//            { 5, 5, 5, 5, 5},
//            {10,10,10,10,10},
//            {20,20,20,20,20},
//            {30,30,30,30,30}
//            };
//
//         [ ���� ��� ] 
//         ������� ... ?
//         �����.... ?

      int[][] arr = {
            { 5, 5, 5, 5, 5},
            {10,10,10,10,10},
            {20,20,20,20,20},
            {30,30,30,30,30}
      };

      int sum = 0;
      double num = 0;  // ��ü ���� 
      for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[i].length; j++) {
            sum += arr[i][j];
            num++;
         }
      }
      System.out.println("������� ... " + sum);
      System.out.println("����� ... " + sum + " / " + num + " = " + sum/num);

      System.out.println("========================");

	}

}
