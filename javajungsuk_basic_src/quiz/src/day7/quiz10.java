package day7;

import java.util.Scanner;

class Memeber{
	String name;
	String Id;
	int pw;
	int age;
	
	Scanner scanner = new Scanner(System.in);
	
	Memeber(){
		
	}
	
	Memeber(String name, String Id, int pw, int age){
		this.name = name;
		this.pw = pw;
		this.Id = Id;
		this.age = age;
		
	}
	void login(){
		System.out.println("���̵� �Է��Ͻÿ� :");
		String id = scanner.next();
		System.out.println("��й�ȣ�� �Է��Ͻÿ� : ");
		int pwe = scanner.nextInt();
		if(Id.equals(id) && pw == pwe){
		System.out.println("�α��� ����");
		
		
	}else {
		System.out.println("�α��� ����");
	}
	
	
}
}
	
public class quiz10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Memeber mem = new Memeber("������ Ŀ��", "stpcurry", 1234, 31);
		
		mem.login();
	}

}

