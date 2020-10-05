package bit.r45.first;
import java.util.Scanner;
public class 정올final {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int attempts;
		
		attempts = 1;
			
		while(attempts <= 9) {
			int result = flip(num);
			int result1 = sum(num);
	 		System.out.println(result + " " + result1);	
			
			num = sc.nextInt();
			attempts += 1;
			
			if(num == 0) {
				System.out.println("종료!");
				break;
			}					
			
	 		
		}
              
    }
    
		
    public static int flip(int num){
        int result = 0;
        
        while(num != 0){
            result= result * 10 + num % 10;
            num /= 10;
        }
        return result;
    }
    
    public static int sum(int num) {
	    int result1 = 0;
	    	 
	    while(num != 0) {
			result1 += num % 10;
			num /= 10;
		}
		return result1;
    
    }
    
}     
    


	

