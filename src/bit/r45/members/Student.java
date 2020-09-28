package bit.r45.members;


public class Student {
	
	//멤버들: 필드(속성), method(함수)
	
	/* 필드 */
	int age;
	int color; // 1: red, 2: blue, 3: black
	
	/* method */
	public void run() {
		int x = 1;
		int y = 2;
		
		int result = x + y;
		
		System.out.println(x + "+" + y + "=" + result);
		System.out.println("Student Age:"+ "=" + this.age);
	}

	
	//this
	public void setAge(int age) {
		this.age = age;
	}


}
