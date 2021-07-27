package SnakeLadder;

import java.util.Random;

public class SnakeLadder {
	
	int DiceNum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int RollDice() {
		Random ra = new Random();
		int num = ra.nextInt(6) +1;
		return num;
	}
}
class Game{
	Game(){
		int Pos=0;
		
	}
}