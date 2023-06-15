package for_;

public class TestClass01 {
public static void main(String[] args) {
	/*
		for(초기값;조건식;증감식){
			종속문장
		}
		다음문장
		-------------------------
		반복문
		동일한 코드를 여러번 동작하고자 하는 경우
		규칙적으로 값이 변한다면 반복문을 사용할 수 있다
	 */
	int sum = 0;
	for(int i=1;i<10;i++) {
		sum = sum+i;
	}
}
}
