package day4;

public class quiz04 {

	public static void main(String[] args) {
//		10.  1���� 20������ ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� �� ���� ����ϵ��� ���α׷����Ͽ���. 
//
//
//		[ ���� ��� ]
//
//		�� ����   ?  �Դϴ�
		int sum = 0;
		for (int i=1; i<=20; i++) {
			if(i%2 != 0 && i/3 !=0) {
				sum+=i;
			}
		}
		System.out.println(sum);

	}

}
