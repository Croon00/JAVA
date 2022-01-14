package day12;

import java.util.Scanner;

public class quiz05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String Id = "smhyun128";
		String Pw = "smj0494";
		
		System.out.println("아이디를 입력하시오:");
		String id = scanner.next();
		System.out.println("비밀번호를 입력하시오");
		String pw = scanner.next();
		
		try {

			
			if (Id != id) {
				throw new Exception("아이디가 존재하지 않음");
			}
			if (Pw != pw) {
				throw new Exception("비밀번호가 맞지 않음");
			}
		} catch (Exception e) {
			 System.out.println("에러 메시지 : " + e.getMessage());		}
	}

}
