package day5;

import java.util.Arrays;

public class quiz07 {

	public static void main(String[] args) {
//		07. 알파벳 대문자로 구성된 배열을 생성하고 Math.random()을 이용하여 
//	     7자로 구성된 비밀번호를 배열을 이용하여 생성하여라.
//	(중복 허용가능) 
//
//	[ 실행 결과 ] 
//
//	alpha_arr = [ 'A', .... 'Z']
//	비밀번호 = ??????
		   char[] alpha_arr = new char[26];   
		      for (int i = 0; i < alpha_arr.length; i++) {
		         alpha_arr[i] = (char)('A'+i); // 65, 66 ....
		         // alpha_arr[i] = (char)('Z'-i); // 90, 89
		      }
		      
		      
		      System.out.println(Arrays.toString(alpha_arr));
		      
		      // 비밀번호 저장 변수 
		      String pwd = "";
		      // 랜덤 정수 0~25 난수 정수
		      int n;
		      for (int i = 0; i < 7; i++) {
		         n = (int)(Math.random()*26);
		         System.out.println(n);
		         pwd += alpha_arr[n];
		      }
		      
		      System.out.println("비밀번호 = " + pwd);

	}

}
