package bit.r45.first;

public class 연습장 {

	public static void main(String[] args) {
//		int[] intArray = null;
//		intArray[1] = 10;
		
//		System.out.println(intArray);
		
		
		int[] scores = {100,99,80,90,50};
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			sum += scores[i];
		}
		System.out.println("Avg: " + sum/ 5);
		
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("Avg: " + sum/ scores.length);
		
		
		//문자열 배열
		String[] messages = {
				"안녕하세요",
				"뇽",
				"꾸~~~",
				"Fuxx"
		};
		
		for(int i = 0; i < messages.length; i++) {
			System.out.println(messages[i]);
		}
		
		
		//배열 초기: new
		int[] adder = new int[5];
		for(int i = 0; i < scores.length; i++) {
			adder[i] = scores[i] + 2;
		}
		System.out.println(scores);
		System.out.println(messages);
		System.out.println(adder);
	}

}
