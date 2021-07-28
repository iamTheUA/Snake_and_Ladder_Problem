package SnakeLadder;

import java.util.Random;

public class SnakeLadder {
	static int PositionOf1, PositionOf2, turn = 0;
	static int EndPoint=100;

	public static void main(String[] args) {
		while (PositionOf1 < EndPoint && PositionOf2 < EndPoint) {
			PositionOf1 = Play(PositionOf1);
			System.out.println("Position Player1: " + PositionOf1);
			PositionOf2 = Play(PositionOf2);
			System.out.println("Position Player2: " + PositionOf2);
			System.out.println("");
			turn += 1;
		}
		System.out.println("Number Of Turns : " + turn);
	}

	public static int Play(int pos) {
		int DiceNum = RollDice();
		int Option = Option();
		int move = DiceNum * Option;
		if (move + pos <= EndPoint) {
			pos += move;
		}
		if (pos < 0) {
			pos = 0;
		}
		if (Option == 1) {
			return Play(pos);
		}

		return pos;
	}

	public static int Option() {
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

	public static int RollDice() {
		Random Random = new Random();
		int num = Random.nextInt(6) + 1;
		return num;
	}

}
