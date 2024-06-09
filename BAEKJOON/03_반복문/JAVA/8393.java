// info : https://www.acmicpc.net/problem/8393
// tool : https://www.programiz.com/java-programming/online-compiler/
import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		sc.close();

		int sum = 0;

		for(int i = 1; i <= inputNum; i++) {
			sum += i;
		}

		System.out.println(sum);
	}
}