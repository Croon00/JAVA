package day10;
import java.util.Scanner;

abstract class beverage{
	int won;

	public int getWon() {
		return won;
	}

	public void setWon(int won) {
		this.won = won;
	}
	abstract void cal();
	
}

class colar extends beverage{
	int co = 800;

	@Override
	void cal() {
		super.won = super.won - co;
		System.out.println("���� �ݾ� = " + super.won);
	}
}

class water extends beverage{
	int wa = 500;

	@Override
	void cal() {
		super.won = super.won - wa;
		System.out.println("���� �ݾ� = " + super.won);
		
	}
}

class bitaminwater extends beverage{
	int bi = 1500;

	@Override
	void cal() {
		super.won = super.won - bi;
		System.out.println("���� �ݾ� = " + super.won);
		
	}
}

public class quiz10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			int n = 0;
			System.out.println("�޴��� ���ÿ�");
			System.out.println("1.�ݶ�(800), 2.����(500), 3.��Ÿ�ο���(1500)");
			int num = scanner.nextInt();
			if(num == 1) {
				n = 800;
				}
				
			else if(num == 2) {
				n= 500;
			}
			else if(num == 3) {
				n = 1500;
			}
			else if(num == -1) {
				break;
			}
			System.out.println("�ݾ��� �Է��Ͻÿ�");
			int coin = scanner.nextInt();
			if(coin < n) {
				System.out.println("�ݾ��� �����մϴ�.");
			}
			
		}
		
	}

}
