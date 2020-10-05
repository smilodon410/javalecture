package bit.r45.first;

public class iftest {

	public static void main(String[] args) {
		int num = -9;
		
		if(num > 0) {
			System.out.println("양수입니다.");
		} else if(num == 0) {
			System.out.println("0입니다.");
		} else {
			System.out.println("음수입니다.");
		}
		
		
		char c1 = 'A';
		char c2 = 'A' + 1;
		
		System.out.println("A:" +c1 + "           B:" + c2);
		
		
	    System.out.println( 1 << 3);
	    
	    if((1 << 3) == 8 ) {
	    	System.out.println( "1 left shift 3");
	    }
		
	    System.out.println( -8 >> 3);
	    
	    if((-8 >> 3) == -1 ) {
	    	System.out.println( "-8>>3 => -1");
	    }
	    
	    
	    int score = 95;
	    char grade = (score > 90) ? 'A' : (score > 80 ? 'B' : 'C' );
	    System.out.println(score + "점은" + grade + "등급입니다.");
	}

}
