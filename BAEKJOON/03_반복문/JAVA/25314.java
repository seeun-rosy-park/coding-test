// info : https://www.acmicpc.net/problem/25314
// tool : https://www.programiz.com/java-programming/online-compiler/
import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int numN = sc.nextInt();
		sc.close();

		int longCnt = numN / 4;
		String longStr = "";
		// 4 -> long int; 8 -> long long int; 12 -> long long long int
		for(int i = 0; i < longCnt; i++) {
			longStr = longStr.concat("long ");
		}

		System.out.println(longStr + "int");
	}
}