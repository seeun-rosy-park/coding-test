// https://www.acmicpc.net/problem/10998
import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double firstNum = sc.nextDouble();
		double secondNum = sc.nextDouble();
		sc.close();
		
		System.out.println(firstNum / secondNum);
	}
}