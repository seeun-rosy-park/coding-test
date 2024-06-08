// https://www.acmicpc.net/problem/2480
import java.util.*;
import java.lang.Math;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int sameNum;
		int prizeMoney = 0;

		if (num1 == num2 && num2 == num3) {
			// 3 same num
			sameNum = num1;
			prizeMoney = 10000 + sameNum * 1000;
		} else if ((num1 == num2)
				|| (num2 == num3) 
				|| (num1 == num3)) {
			// 2 same num
			if (num1 == num2) {
				sameNum = num1;
			} else if (num2 == num3) {
				sameNum = num2;
			} else {
				// num1 == num3
				sameNum = num1;
			}
			prizeMoney = 1000 + sameNum * 100;
		} else {
			// no same num
			int maxNum = Math.max(Math.max(num1, num2), num3);
			// int maxNum = num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
			prizeMoney = maxNum * 100;
		}

		System.out.println(prizeMoney);
	}
}