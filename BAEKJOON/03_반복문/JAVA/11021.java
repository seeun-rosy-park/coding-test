// info : https://www.acmicpc.net/problem/11021
// tool : https://www.programiz.com/java-programming/online-compiler/
import java.util.*;
import java.text.MessageFormat;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int testCnt = sc.nextInt();
		int[] results = new int[testCnt];

		for(int i = 0; i < testCnt; i++) {
			int numA = sc.nextInt();
			int numB = sc.nextInt();

			results[i] = numA + numB;
		}
		sc.close();

		for(int i = 0; i < testCnt; i++) {
			System.out.println(MessageFormat.format("Case #{0}: {1}", i + 1, results[i]));
		}
	}
}