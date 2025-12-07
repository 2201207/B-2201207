import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        final int VOTERS = 16;
        int[] ip = new int[5];
        int nogood = 0;

        System.out.println("1~4번 중 한 후보의 번호를 입력:");

        for (int i = 1; i <= VOTERS; i++) {
            int x = keyboard.nextInt();
            if (1 <= x && x <= 4) ip[x]++;
            else nogood++;
        }

        System.out.println("득표수");
        System.out.printf("1번 : %d표%n", ip[1]);
        System.out.printf("2번 : %d표%n", ip[2]);
        System.out.printf("3번 : %d표%n", ip[3]);
        System.out.printf("4번 : %d표%n", ip[4]);
        System.out.printf("무효표 : %d표%n", nogood);
        System.out.printf("총 %d표%n", VOTERS);

    }
}