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
		System.out.println("�ο��� >>");
		int num = scanner.nextInt();
		String names;
		Address address [] = new Address[num];
		for (int i = 0; i < address.length; i++) {
			System.out.println("�̸�, ��ȭ��ȣ, �ּ� �Է� >>");
			names = scanner.next();
			String tel = scanner.next();
			String addressed = scanner.next();
			address[i] = new Address(names, tel, addressed);
			}
		while(true) {
			System.out.println("�˻��� �̸� >>");
			String name = scanner.next();
			
			for (int i=0; i<num; i++) {
				if(name.equals(address[i].getName())) {
					System.out.println("�̸��� ����");
				
				}
				else {
					System.out.println("�̸� ����");
				}
			if(name.equals("�׸�")) {
				break;
			}
				
		}
		
		}
	}

}

/*
01. �ּҷϰ� ���õ� Address Ŭ������ �����ϰ� ���� ����� �����Ͽ� �׽�Ʈ�Ͻÿ�. 

�ʵ�: 
�̸�, ��ȭ��ȣ, �ּ� 

�޼���: 
������ 
�ʵ� ��� 


[���� ���]
�ο��� >> 3

�̸�, ��ȭ��ȣ, �ּ� �Է�>> ���ζ� 010-777-7777 ����
�̸�, ��ȭ��ȣ, �ּ� �Է�>> ����Ź 010-333-3333 ����
�̸�, ��ȭ��ȣ, �ּ� �Է�>> �輮�� 010-666-9999 õ��
����Ǿ����ϴ�...

�˻��� �̸� >> ȫ�浿
ȫ�浿�� �����ϴ�.

�˻��� �̸� >> �輮��
��ȭ��ȣ : 010-666-9999
�ּ� : õ�� 

�˻��� �̸� >>�׸�
���α׷��� �����մϴ�. 



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
//      // ��ü �迭 ���� 
//      Address phone[];
//      int i;
//      System.out.print("�ο��� >> ");
//      int num = sc.nextInt();
//      phone = new Address[num];
//
//      for(i=0; i<phone.length; i++) {
//         System.out.print("�̸�, ��ȭ��ȣ, �ּ� �Է� >>");
//         String name = sc.next();
//         String tel = sc.next();
//         String addr = sc.next();
//         phone[i] = new Address(name, tel, addr);
//      }
//
//      System.out.println("����Ǿ����ϴ�...");
//      
//      System.out.println("\n\t [ �˻���� ] ");
//      
//      while(true) {
//         
//         System.out.print("�˻��� �̸� >> ");
//         String name = sc.next();
//         
//         for(i=0; i<num; i++) {
//            if(name.equals(phone[i].getName())) {
//               System.out.println(name+"�� ��ȣ�� " + 
//                        phone[i].getTel()+phone[i].getAddr()+" �Դϴ�.");
//               i--;
//               break;
//            }
//         }
//         if(name.equals("�׸�")) break;
//         if (i == num) System.out.println(name+"�� �����ϴ�.");
//      }
//
//      sc.close();
//
//   }
//}
