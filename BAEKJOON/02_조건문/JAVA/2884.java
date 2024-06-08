// https://www.acmicpc.net/problem/2884
import java.util.*;
import java.text.MessageFormat;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int ealryMinute = 45;

		if (minute < ealryMinute) {
			hour = hour == 0 ? 24 - 1 : hour - 1;
			minute = 60 - (ealryMinute - minute);
		} else {
			minute -= ealryMinute;
		}
		
		System.out.println(MessageFormat.format("{0} {1}",hour,minute));
		
		// System.out.println(hour + " " + minute );
		// System.out.printf("%d%s%d\n", hour, " ", minute);
	}
}