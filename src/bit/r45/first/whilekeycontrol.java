package bit.r45.first;

import java.io.IOException;

public class whilekeycontrol {

	public static void main(String[] args) {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("----------------------------");
				System.out.println("→.증속 | ←.감속 | ↑.중지 | ↓.종료");
				System.out.println("----------------------------");
				System.out.println("선택: ");
			}
			
			try {
				keyCode = System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (keyCode == 39) {
				speed++;
				System.out.println("현재 속도=" + speed);
			} else if(keyCode == 37) {
				speed--;
				System.out.println("현재속도=" + speed);
			} else if(keyCode == 38) {
				run = false;
			} else if(keyCode == 40) {
				System.out.println("프로그램 종료.");
			}
		}
				

	}

}
