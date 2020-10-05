package bit.r45.first;

public class forpractice {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			sum = sum + i;
		}
		System.out.println("1부터 100까지의 합 : " + sum);
		
		int sum1 = 0;
		for(int i = 2; i <= 20; i += 2) {
			sum1 = sum1 + i;
		}
		System.out.println("1부터 20까지 2씩 더한 값 : " + sum1);
		
		int sum2 = 0;
		for(int i = 1; i <= 100; i++) {
			if(i == 85)	break;
			sum2 = i + sum2;
		}
		System.out.println("정답은 : " + sum2);
		
	}
	
}
