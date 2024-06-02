// https://www.acmicpc.net/problem/10869
import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int firstNum, secondNum;
		firstNum = sc.nextInt();
		secondNum = sc.nextInt();
		sc.close();
		System.out.println(firstNum + secondNum);
		System.out.println(firstNum - secondNum);
		System.out.println(firstNum * secondNum);
		System.out.println(firstNum / secondNum);
		System.out.println(firstNum % secondNum);
	}
}