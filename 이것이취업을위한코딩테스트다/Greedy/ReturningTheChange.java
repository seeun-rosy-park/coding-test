/*
거스름돈을 입력받고, 거슬러줄 동전의 최소 개수를 반환하라.
거스름돈은 항상 10의 배수다.
동전 단위는 500원, 100원, 50원, 10원으로 총 4가지다.
각 동전은 무한히 존재한다.
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int change = sc.nextInt();
        int cnt = 0;

        int[] coinTypes = {500, 100, 50, 10};

        for (int i = 0; i < 4; i++) {
            int coinType = coinTypes[i];
            cnt += change / coinType;
            change %= coinType;
        }

        System.out.println(cnt);
    }
}