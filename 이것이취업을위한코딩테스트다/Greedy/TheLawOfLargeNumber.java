/*
문제 설명
- 큰 수의 법칙은 N개의 수로 이루어진 배열이 있을 때, 주어진 수들을 M번 더하여 가장 큰 수를 만드는 법칙이다.
- 단, 배열의 특정한 인덱스에 해당하는 수가 연속해서 K번을 초과하여 더해질 수 없다.

입력 조건
- 첫째 줄에 1 이상 1000 이하인 자연수 N, M, K가 주어지며, 각 자연수는 공백으로 구분한다.
- 둘째 줄에 N개의 자연수가 공백으로 구분되어 주어진다.

출력 조건
- 첫째 줄에 큰 수의 법칙에 따라 더해진 답을 출력한다.
*/
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N, M, K를 공백을 기준으로 구분하여 입력 받기
        int arrayLength = sc.nextInt(); // N 배열 길이
        int addCount = sc.nextInt(); // M 더할 횟수
        int repitationMaxCount = sc.nextInt(); // K 연속 가능한 최대 횟수

        // N개의 수를 공백을 기준으로 구분하여 입력 받기
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // 입력 받은 수들 정렬하기
        int first = arr[arrayLength - 1]; // 가장 큰 수
        int second = arr[arrayLength - 2]; // 두 번째로 큰 수

        // 가장 큰 수가 더해지는 횟수 계산
        int cnt = (addCount / (repitationMaxCount + 1)) * repitationMaxCount;
        cnt += addCount % (repitationMaxCount + 1);

        int result = 0;
        result += cnt * first; // 가장 큰 수 더하기
        result += (addCount - cnt) * second; // 두 번째로 큰 수 더하기

        System.out.println(result);
    }

}