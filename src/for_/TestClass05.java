package for_;

import java.util.Scanner;

public class TestClass05 {
public static void main(String[] args) {
	int num, mon = 0, mon2, su;
	/*
	 while(true) {
		Scanner input = new Scanner(System.in);
		System.out.println("1. 입금");
		System.out.println("2. 구입");
		System.out.println("3. 현재 금액 확인");
		System.out.println("4. 잔돈 반환");
		System.out.println("5. 종료");
		System.out.print(">>>");
		num = input.nextInt();
		switch(num) {
		case 1: 
			System.out.print("입금 : ");
			mon2 = input.nextInt();
			mon += mon2;
			break;
		case 2:
			System.out.println("1. 커피(2500원)");
			System.out.println("2. 코코아(2000원)");
			System.out.println("3. 아이스티(1500원)");
			su = input.nextInt();
			if(su == 1 && mon>=2500) {
				System.out.println("커피가 나왔습니다.");
				mon-=2500;
				System.out.println("남은 금액 : "+mon+"원");
			}else if(su == 2 && mon>=2000) {
				System.out.println("코코아가 나왔습니다.");
				mon-=2000;
				System.out.println("남은 금액 : "+mon+"원");
			}else if(su == 3 && mon>=1500) {
				System.out.println("아이스티가 나왔습니다.");
				mon-=1500;
				System.out.println("남은 금액 : "+mon+"원");
			}else {
				System.out.println("금액이 부족합니다.");
			}
			break;
		case 3: 
			System.out.println("현재 금액 : "+mon+"원");
			break;
		case 4: 
			System.out.println(mon+"원을 반환합니다.");
			mon = 0;
			break;
		case 5: 
			System.out.println("종료");
			break;
		default : 
			System.out.println("다시 입력");
			break;
	}	
	*/
	/*
	int sum=0;
	Scanner input = new Scanner(System.in);
	System.out.print(">>>");
	num = input.nextInt();
	for(int i=1;i<=num;i++) {
		sum+=i;
	}
	System.out.println(sum);
	*/
	/*
	for(int i=2;i<10;i++) {
		for(int j=1;j<10;j++) {
			System.out.println(i+"X"+j+"="+i*j);
		}
	}
	*/
	/*
	int i, m=2, f=1000000;
	for (i=1;0<f;i++) {
		if(i%7==0) {
			m*=2;
		}
		f-=m*100;
	}
	i-=1;
	System.out.println(m+"마리, "+i+"일");
	*/
	/*
	String season = "겨울";
	Scanner input = new Scanner(System.in);
	System.out.print("1~12월 : ");
	num = input.nextInt();
	if(num>0 && num<=12) {
		switch(num/3) {
		case 1 : 
			season = "봄";
			break;
		case 2 : 
			season = "여름";
			break;
		case 3 : 
			season = "가을";
			break;
		}
	}
	System.out.println(season);
	*/
	/*
	String season = "겨울";
	Scanner input = new Scanner(System.in);
	System.out.print("1~12월 : ");
	num = input.nextInt();
	if(num>=3 && num<=6) {
		System.out.println("봄");
	}else if(num>=6 && num<=8) {
		System.out.println("여름");
	}else if(num>=9 && num<=11) {
		System.out.println("가을");
	}else if(num==12 || num<=2) {
	System.out.println("겨울");
	}
	*/
	/*
	int su1=0, su2=0;
	Scanner input = new Scanner(System.in);
	System.out.print("수 : ");
	num = input.nextInt();
	for(int i=1;i<=num;i++) {
		if(i%2==0) {
			su1+=i;
		}else {
			su2+=i;
		}
	}System.out.println("짝수의 합 : "+su1);
	System.out.println("홀수의 합 : "+su2);
	*/
	/*
	Scanner input = new Scanner(System.in);
	System.out.print("수 : ");
	num = input.nextInt();
	for (int i=0;i<=num;i++) {
		if(i%2==0) {
			System.out.print(i+" ");
		}
	}
	*/
	/*
	su=0;
	Scanner input = new Scanner(System.in);
	System.out.print("수 : ");
	num = input.nextInt();
	if(num>0 && num<=50) {
		for(int i=0;i<num;i++) {
			if(i%3==0) {
				su +=1;
			}
		}
	}System.out.println(su);
	*/
	/*
	Scanner input = new Scanner(System.in);
	System.out.print("수 : ");
	num = input.nextInt();
	while(true) {
		for(int j=1;j<10;j++) {
			System.out.println(num+"X"+j+"="+num*j);
		}
	}
	*/
	/*
	Scanner input = new Scanner(System.in);
	System.out.print("수 : ");
	num = input.nextInt();
	for (int i=0;i<=num;++i) {
		for (int j=i;0<j;--j) {
			System.out.print("*");
		}System.out.println("");
	}
	*/
}
}
