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
		System.out.println("아이디를 입력하시오 :");
		String id = scanner.next();
		System.out.println("비밀번호를 입력하시오 : ");
		int pwe = scanner.nextInt();
		if(Id.equals(id) && pw == pwe){
		System.out.println("로그인 성공");
		
		
	}else {
		System.out.println("로그인 실패");
	}
	
	
}
}
	
public class quiz10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Memeber mem = new Memeber("스테판 커리", "stpcurry", 1234, 31);
		
		mem.login();
	}

}

