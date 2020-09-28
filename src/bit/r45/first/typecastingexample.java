package bit.r45.first;

public class typecastingexample {

	public static void main(String[] args) {
		byte b1 = 10;
		byte b2 = 20;
		//byte b3 = b1 + b2;
		int i1 = b1 + b2;
		System.out.println(i1);
		
		char c1 = 'A';
		char c2 = 1;
		//char c3 = c1 + c2; //컴파일 에러
		int i2 = c1 + c2;
		System.out.println("유니코드=" + i2);
		System.out.println("출력문자=" + (char)i2);

	}

}
