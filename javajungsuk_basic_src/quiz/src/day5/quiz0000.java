package day5;

import java.util.Arrays;

public class quiz0000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // �߰� ���� : 2���� �迭 ���� 
	      // 1~20 �� ������ ������ 4�� 5�� �迭 ������ ��� 
	      // [������] 
	      /*  1 2 3 4 5
	       *  6 7 8 9 10
	       *  11 12 13 14 15
	       *  16 17 18 19 20
	       * 
	       */
	      int cnt = 1;
	      int[][] num_arr1 = new int[4][5];
	      
	      for (int i = 0; i < num_arr1.length; i++) {
	         for (int j = 0; j < num_arr1[i].length; j++) {
	            // �� ���� 
	            num_arr1[i][j] = cnt;
	            cnt++;
	         }
	      }
	      System.out.println(Arrays.deepToString(num_arr1));

	      for (int i = 0; i < num_arr1.length; i++) {
	         for (int j = 0; j < num_arr1[i].length; j++) {
	            System.out.printf("%4d", num_arr1[i][j]);
	         }
	         System.out.println();
	      }      

	      System.out.println("========================");

	}

}
