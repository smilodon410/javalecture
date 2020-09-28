package bit.r45.first;

public class test {
	
	char ch = 'a';
	int v4 = 10;
	
	public static void main(String[] args) {
		
		char a = 'a';
		char b = 'b', c = 'c';
		
		String str ="안녕하세요.";
		System.out.println(str);
		
		printstr();
	}
	
	static void printstr() {
		byte var1 =125;
		int var2 = 125;
		
		for(int i = 0; i <5; i++) {
			var1++;
			var2++;
			System.out.println("var1:" + var1 + "\t" + "var2:" + var2);
		}
	}
	
	
	
	
	void run() {
//		System.out.println(a);
//		System.out.println(str);
		System.out.println(ch);
		
		int v1 = 10, v2 = 0;
				
		if(v1 > 10) {
			v2 =v1 - 5;
		}
		int v3 = v1 + v2 +10; 
		
		v4 = v3 +10;
	}
	
	void myprint() {
		System.out.println(v4);
	}
	
	

}
