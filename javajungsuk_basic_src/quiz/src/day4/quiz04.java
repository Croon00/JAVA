package day4;

public class quiz04 {

	public static void main(String[] args) {
//		10.  1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총 합을 출력하도록 프로그래밍하여라. 
//
//
//		[ 실행 결과 ]
//
//		총 합은   ?  입니다
		int sum = 0;
		for (int i=1; i<=20; i++) {
			if(i%2 != 0 && i/3 !=0) {
				sum+=i;
			}
		}
		System.out.println(sum);

	}

}
