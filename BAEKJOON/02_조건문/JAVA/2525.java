// https://www.acmicpc.net/problem/2525
import java.util.*;
import java.text.MessageFormat;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int cookingMinute = sc.nextInt();

		if (minute + cookingMinute >= 60) {
			// calculate hour
			int cookingHourCnt = (minute + cookingMinute) / 60;
			int hourAfterCooking = hour + cookingHourCnt;
			if (hourAfterCooking % 24 == 0) {
				hour = 0;
			} else if (hourAfterCooking > 23) {
				hour = hourAfterCooking - (hourAfterCooking / 24) * 24;
			} else {
				// (hour + cookingHourCnt) <= 23
				hour = hourAfterCooking;
			}

			// calculate minute
			minute = (minute + cookingMinute) - 60 * cookingHourCnt;
		} else {
			minute += cookingMinute;
		}

		System.out.println(MessageFormat.format("{0} {1}", hour, minute));
		// System.out.println(hour + " " + minute);
	}
}

/*
TestCase

minute + cookingMinute > 60
minute + cookingMinute == 60

	hour == 23
	hour != 23

	(hour + cookingHourCnt) % 24 == 0
	(hour + cookingHourCnt) % 24 != 0 && (hour + cookingHourCnt) > 23

minute + cookingMinute < 60
*/