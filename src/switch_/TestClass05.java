package switch_;

import java.util.Scanner;

public class TestClass05 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num;
	System.out.print("날짜 입력 : ");
	num = input.nextInt();
	switch(num%7) {
	case 1 : System.out.println("월");break;
	case 2 : System.out.println("화");break;
	case 3 : System.out.println("수");break;
	case 4 : System.out.println("목");break;
	case 5 : System.out.println("금");break;
	case 6 : System.out.println("토");break;
	case 0 : System.out.println("일");break;
	}
	
	String add = null, com = null;
	while(true) {
		System.out.println("1. 우리집 등록");
		System.out.println("2. 회사 등록");
		System.out.println("3. 등록 보기");
		System.out.print(">>>");
		num = input.nextInt();
		switch(num) {
		case 1 : 
			System.out.print("우리집 : ");
			add = input.next();
			break;
		case 2 : 
			System.out.print("회사 : ");
			com = input.next();
			break;
		case 3 : 
			System.out.println("우리집 : "+add);
			System.out.println("회사 : "+com);
			break;
		}
	}
}
}
