// info : https://www.acmicpc.net/problem/10950
// tool : https://www.programiz.com/java-programming/online-compiler/
import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		while(sc.hasNextInt()){
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a+b);
		}	
		sc.close();
	}
}