package day4;

public class quiz19 {

	public static void main(String[] args) {
//		19.  �� ���� �ֻ����� ������ �� ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϵ��� 
//		���α׷��� �Ͽ���. 
//
//		[ ���� ��� ]
//		1+5=6
//		2+4=6
//		3+3=6
//		4+2=6
//		5+1=6


		for(int i = 1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i+j == 6) {
					int sum = i+j;
					System.out.println(i+"+"+j+"="+sum);
					sum =0;
				}
			}
		}

	}

}
