package for_;

import java.util.Scanner;

public class TestClass03 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int repeat;
	System.out.print("반복 횟수 입력 : ");
	repeat = input.nextInt();
	for(int i = 0; i<repeat;i++) {
		System.out.println(i+"번 반복");
	}System.out.println("다음 문장 실행");
}
}
