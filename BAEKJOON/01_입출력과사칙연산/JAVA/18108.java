// https://www.acmicpc.net/problem/18108
import java.util.*;
public class Main{
	public static void main(String args[]){
		// 불기와 서기의 차이 = 2541 - 1998 = 543;
		Scanner sc = new Scanner(System.in);
		int buddhistCalendarYear= sc.nextInt();
		sc.close();
		System.out.println(buddhistCalendarYear - 543);
	}
}