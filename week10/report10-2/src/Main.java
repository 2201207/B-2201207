import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int N = 10;
        int[] score = new int[N];

        System.out.println("10개의 정수 데이터 입력");
        for (int i = 0; i < N; i++) {
            System.out.printf("%d : ", i + 1);
            score[i] = keyboard.nextInt();
        }

        int total = 0, max = score[0], min = score[0];
        for (int s : score) {
            total += s;
            if (s > max) max = s;
            if (s < min) min = s;
        }
        float average = (float) total / N;
        System.out.println("출력 결과");
        System.out.printf("합계  : %d%n", total);
        System.out.printf("평균  : %.2f%n", average);
        System.out.printf("최대값: %d%n", max);
        System.out.printf("최소값: %d%n", min);

    }
}