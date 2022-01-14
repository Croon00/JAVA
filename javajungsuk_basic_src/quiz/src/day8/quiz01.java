package day8;

import java.util.Scanner;

class Address {
	String name;
	String tel;
	String address;
	
	Address(String name, String tel, String address){
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void info() {
		System.out.println(name + tel + address);
	}
}
public class quiz01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("인원수 >>");
		int num = scanner.nextInt();
		String names;
		Address address [] = new Address[num];
		for (int i = 0; i < address.length; i++) {
			System.out.println("이름, 전화번호, 주소 입력 >>");
			names = scanner.next();
			String tel = scanner.next();
			String addressed = scanner.next();
			address[i] = new Address(names, tel, addressed);
			}
		while(true) {
			System.out.println("검색할 이름 >>");
			String name = scanner.next();
			
			for (int i=0; i<num; i++) {
				if(name.equals(address[i].getName())) {
					System.out.println("이름이 있음");
				
				}
				else {
					System.out.println("이름 없음");
				}
			if(name.equals("그만")) {
				break;
			}
				
		}
		
		}
	}

}

/*
01. 주소록과 관련된 Address 클래스를 정의하고 실행 결과를 참조하여 테스트하시오. 

필드: 
이름, 전화번호, 주소 

메서드: 
생성자 
필드 출력 


[실행 결과]
인원수 >> 3

이름, 전화번호, 주소 입력>> 오로라 010-777-7777 전주
이름, 전화번호, 주소 입력>> 마동탁 010-333-3333 마산
이름, 전화번호, 주소 입력>> 김석진 010-666-9999 천안
저장되었습니다...

검색할 이름 >> 홍길동
홍길동이 없습니다.

검색할 이름 >> 김석진
전화번호 : 010-666-9999
주소 : 천안 

검색할 이름 >>그만
프로그램을 종료합니다. 



// */
//
//
//class Address {
//   String name;
//   String tel;
//   String addr;
//
//   Address(String name, String tel, String addr) {
//      this.name = name;
//      this.tel = tel;
//      this.addr = addr;
//   }
//   String getName() {
//      return name;
//   }
//   String getTel() {
//      return tel;
//   }
//   String getAddr() {
//      return addr;
//   }
//}
//
//
//
//public class Quiz7_01 {
//   public static void main(String[] args) {
//
//      Scanner sc = new Scanner(System.in);
//      
//      // 객체 배열 선언 
//      Address phone[];
//      int i;
//      System.out.print("인원수 >> ");
//      int num = sc.nextInt();
//      phone = new Address[num];
//
//      for(i=0; i<phone.length; i++) {
//         System.out.print("이름, 전화번호, 주소 입력 >>");
//         String name = sc.next();
//         String tel = sc.next();
//         String addr = sc.next();
//         phone[i] = new Address(name, tel, addr);
//      }
//
//      System.out.println("저장되었습니다...");
//      
//      System.out.println("\n\t [ 검색기능 ] ");
//      
//      while(true) {
//         
//         System.out.print("검색할 이름 >> ");
//         String name = sc.next();
//         
//         for(i=0; i<num; i++) {
//            if(name.equals(phone[i].getName())) {
//               System.out.println(name+"의 번호는 " + 
//                        phone[i].getTel()+phone[i].getAddr()+" 입니다.");
//               i--;
//               break;
//            }
//         }
//         if(name.equals("그만")) break;
//         if (i == num) System.out.println(name+"이 없습니다.");
//      }
//
//      sc.close();
//
//   }
//}
