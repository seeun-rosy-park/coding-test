// https://www.acmicpc.net/problem/14681
import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int quadrant = 0;

		if (x > 0) {
			if (y > 0){
				quadrant = 1;
			} else {
				quadrant = 4;
			}
		} else {
			if (y > 0){
				quadrant = 2;
			} else {
				quadrant = 3;
			}
		}

		System.out.println(quadrant);
	}
}