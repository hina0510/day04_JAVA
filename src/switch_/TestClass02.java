package switch_;

import java.util.Scanner;

public class TestClass02 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num;
	System.out.println("수 입력 : ");
	num = input.nextInt();
	switch(num%2) {
	case 1:System.out.println("홀수 : "+num);break;
	case 0:System.out.println("짝수 : "+num);break;
	}System.out.println("다음 문장들 실행");
}
}
