package switch_;

public class TestClass01 {
public static void main(String[] args) {
	/*
	switch(식){
		case 1:내용;break;
		case 2:내용;break;
		...
		default:내용;break;
	 */
	int sel = 1;
	switch(sel) {
	case 1:System.out.println("1입력");break;
	case 2:System.out.println("2입력");break;
	default:System.out.println("1, 2를 제외한 다른 값");break;
	}System.out.println("다음 문장들 실행");
}
}
