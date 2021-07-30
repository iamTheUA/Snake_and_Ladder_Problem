package SnakeLadder;

import java.util.Random;

public class SnakeLadder {
	static int positionOf1, positionOf2, turn = 0;
	static int endPoint=100;

	public static void main(String[] args) {
		while (positionOf1 < endPoint && positionOf2 < endPoint) {
			positionOf1 = play(positionOf1);
			System.out.println("Position Player1: " + positionOf1);
			positionOf2 = play(positionOf2);
			System.out.println("Position Player2: " + positionOf2);
			System.out.println("");
			turn += 1;
		}
		System.out.println("Number Of Turns : " + turn);
		
		if(positionOf1 == positionOf2) {
			System.out.println("Player 1 Won first!");
		}
		else if(positionOf1 > positionOf2) {
			System.out.println("Player 1 Won!");
		}
		else
			System.out.println("Player 2 Won!");
	}

	public static int play(int pos) {
		int DiceNum = rollDice();
		int option = option();
		int move = DiceNum * option;
		if (move + pos <= endPoint) {
			pos += move;
		}
		if (pos < 0) {
			pos = 0;
		}
		if (option == 1) {
			return play(pos);
		}

		return pos;
	}

	public static int option() {
		int op;
		Random Random = new Random();
		int temp = Random.nextInt(3);
		if (temp == 0) {
			op = 0;
		} else if (temp == 1) {
			op = 1;
		} else {
			op = -1;
		}
		return op;
	}

	public static int rollDice() {
		Random random = new Random();
		int num = random.nextInt(6) + 1;
		return num;
	}

}
