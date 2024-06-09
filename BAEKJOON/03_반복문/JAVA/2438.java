// info : https://www.acmicpc.net/problem/2438
// tool : https://www.programiz.com/java-programming/online-compiler/
import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int numN = sc.nextInt();

		for(int i = 1; i <= numN; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}