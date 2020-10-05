package bit.r45.first;
import java.util.Scanner;
public class numberreverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	        int num=sc.nextInt();
	        System.out.println(flip(num));
	    }
	    
	    public static int flip(int num){
	        int result=0;
	        while(num!=0){
	            result= result * 10 + num % 10;
	            num /= 10;
	        }
	        return result;
	    }
	
	}
