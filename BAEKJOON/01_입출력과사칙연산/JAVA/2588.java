// https://www.acmicpc.net/problem/2588
import java.util.*;
public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int firstNum= sc.nextInt();
		int secondNum= sc.nextInt();
		sc.close();

		int oneDigit = secondNum % 10;
		int tenDigit = secondNum % 100 / 10;
		int hundredDigit = secondNum / 100;

		System.out.println(firstNum * oneDigit);
		System.out.println(firstNum * tenDigit);
		System.out.println(firstNum * hundredDigit);
		System.out.println(firstNum * secondNum);
	}
}