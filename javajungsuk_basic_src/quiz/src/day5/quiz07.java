package day5;

import java.util.Arrays;

public class quiz07 {

	public static void main(String[] args) {
//		07. ���ĺ� �빮�ڷ� ������ �迭�� �����ϰ� Math.random()�� �̿��Ͽ� 
//	     7�ڷ� ������ ��й�ȣ�� �迭�� �̿��Ͽ� �����Ͽ���.
//	(�ߺ� ��밡��) 
//
//	[ ���� ��� ] 
//
//	alpha_arr = [ 'A', .... 'Z']
//	��й�ȣ = ??????
		   char[] alpha_arr = new char[26];   
		      for (int i = 0; i < alpha_arr.length; i++) {
		         alpha_arr[i] = (char)('A'+i); // 65, 66 ....
		         // alpha_arr[i] = (char)('Z'-i); // 90, 89
		      }
		      
		      
		      System.out.println(Arrays.toString(alpha_arr));
		      
		      // ��й�ȣ ���� ���� 
		      String pwd = "";
		      // ���� ���� 0~25 ���� ����
		      int n;
		      for (int i = 0; i < 7; i++) {
		         n = (int)(Math.random()*26);
		         System.out.println(n);
		         pwd += alpha_arr[n];
		      }
		      
		      System.out.println("��й�ȣ = " + pwd);

	}

}
