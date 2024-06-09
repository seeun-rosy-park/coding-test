// info : https://www.acmicpc.net/problem/25304
// tool : https://www.programiz.com/java-programming/online-compiler/
import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int receiptTotal = sc.nextInt();
		int objectTypeCnt = sc.nextInt();

		int calculatedTotal = 0;

		for(int i = 0; i < objectTypeCnt; i ++) {
			int objectPriceA = sc.nextInt();
			int objectCntB = sc.nextInt();

			calculatedTotal += objectPriceA * objectCntB;
		}
		sc.close();

		String result = "";
		if (receiptTotal == calculatedTotal) {
			result = "Yes";
		} else {
			result = "No";
		}

		System.out.println(result);
	}
}