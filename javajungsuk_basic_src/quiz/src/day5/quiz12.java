package day5;

import java.util.Arrays;

public class quiz12 {

	public static void main(String[] args) {
//      12. 4 x 4�� 2���� �迭�� 1���� 10���� ������ ���� ���� 16���� �迭�� �����Ͽ���. 
//
//      [ ��� ��� ]
//      8 6 1 1 
//      7 3 6 9 
//      4 5 3 7 
//      9 6 3 1 

      int[][] num_arr2 = new int[4][4];

      for (int i = 0; i < num_arr2.length; i++) {
         for (int j = 0; j < num_arr2[i].length; j++) {
            num_arr2[i][j] = (int)(Math.random()*10+1);
         }
      }
      System.out.println(Arrays.deepToString(num_arr2));
      for (int i = 0; i < num_arr2.length; i++) {
         for (int j = 0; j < num_arr2[i].length; j++) {
            System.out.printf("%4d", num_arr2[i][j]);
         }
         System.out.println();
      }


	}

}
