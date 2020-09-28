package bit.r45.first;

public class typecasting {

	public static void main(String[] args) {
		byte b1 = 10;
		int a = b1;  // int <----- byte
		System.out.println(a);
		
		char ch1 = '가';
		a = ch1;
		System.out.println("가:" + a);
		
		//
		a = (int)b1;

	}
	
	
	
	public void checkvaluebefore() {
		int i = 128;
		
		if ( ( i < Byte.MAX_VALUE) || ( i > Byte.MAX_VALUE) ) {
			System.out.println("Cant cast to byte");
		} else {
			byte b  = (byte)i;
			System.out.println(b);
		}
	}
	
	


}
