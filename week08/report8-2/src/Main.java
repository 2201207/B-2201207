import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("**** 시간 변환 프로그램 ****\n");
        System.out.print("시간 입력 : ");
        double time = keyboard.nextDouble();

        int day = (int) (time / 24);
        int hour = (int) (time % 24);
        int minute = (int) ((time - day * 24 - hour) * 60);
        int second = (int) ((((time - day * 24 - hour) * 60) - minute) * 60);

        System.out.printf("%.2f 시간은 %d 일 %d 시간 %d 분 %d 초 입니다.%n",
                time, day, hour, minute, second);

    }
}