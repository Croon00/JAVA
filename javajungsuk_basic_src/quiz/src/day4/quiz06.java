package day4;

public class quiz06 {

	public static void main(String[] args) {
//		16. 아래의 계산 결과가 출력되도록 프로그래밍 하여라. 
//
//		[ 실행 결과 ]
//
//		1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) 
//
//		결과 =  ?
		int i;
		int j;
		int num = 0;
		int count = 0;
		for (i=0; i<=10; i++) {
			for (j=0; j<=i; j++) {
				num += j;
			}
			
		}
		System.out.println(num);
		
		 int sum = 0;
	      int totalSum = 0;
	      for( i=1; i <=10; i++) {
	         sum += i;
	         totalSum += sum;
	         System.out.println(i + "  "  + sum + "  " + totalSum);
	      }
	      System.out.println("totalSum=" + totalSum);
	}

}
