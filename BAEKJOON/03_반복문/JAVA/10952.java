// info : https://www.acmicpc.net/problem/10952
// tool : https://www.programiz.com/java-programming/online-compiler/
import java.util.*;

public class Main{
	public static void main(String args[]){
		ArrayList<Integer> numAList = new ArrayList<>();
		ArrayList<Integer> numBList = new ArrayList<>();

		int currentNumA = 0;
		int currentNumB = 0;

		Scanner sc = new Scanner(System.in);
		do {
			currentNumA = sc.nextInt();
			currentNumB = sc.nextInt();

			numAList.add(currentNumA);
			numBList.add(currentNumB);
		} while(currentNumA != 0 && currentNumB != 0);
		sc.close();

		int listSize = numAList.size();
		for(int i = 0; i < listSize - 1; i++) {
			System.out.println(numAList.get(i) + numBList.get(i));
		}

	}
}