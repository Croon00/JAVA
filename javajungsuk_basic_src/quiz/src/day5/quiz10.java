package day5;

import java.util.Scanner;

public class quiz10 {

	public static void main(String[] args) {
//      10. �¾ �⵵�� �Է��ϸ� �ش� �츦 ����ϴ� ���α׷��� �ۼ��Ͽ���. 
      // �¾�⵵%12 ���� animal �迭�� �ε����� ���� 
//
//      String[] animal = {"������", "��", "��", "����", "��", "��", "ȣ����", "�䳢", "��", "��","��", "��"};
//
//         [ ��� ��� ] 
//         �¾ �⵵ >>   ?
//         ? ���Դϴ�. 
            
      String[] animal = {"������", "��", "��", "����", "��", "��", 
                        "ȣ����", "�䳢", "��", "��","��", "��"};
      
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("�¾ �⵵ >>   ");
      int birth_year = scanner.nextInt();
      
      System.out.println(animal[birth_year%12] + " ���Դϴ�. ");


	}

}
