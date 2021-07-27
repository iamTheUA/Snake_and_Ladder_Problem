package SnakeLadder;

import java.util.Random;

public class SnakeLadder {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game P1 = new Game();
		while(P1.pos<100) {
			int DiceNum = RollDice();
			int Option = Option();
			P1.pos+= DiceNum*Option; 
			
		}
		
	}
	
	public static int RollDice() {
		Random ra = new Random();
		int num = ra.nextInt(6) +1;
		return num;
	}
	
	public static int Option() {
		int op;
		Random boy = new Random();
		int temp= boy.nextInt(3);
		if(temp==0) {
			op=0;
		}
		else if(temp==1) {
			op=1;
		}
		else {
			op=-1;
		}
		return op;
	}
}
class Game{
	int pos=0;
	
	
}