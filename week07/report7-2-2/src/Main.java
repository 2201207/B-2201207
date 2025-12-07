import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        final int BASE = 10_000;

        System.out.print("나이: ");
        int age = keyboard.nextInt();

        System.out.print("관람시간(조조=Y, 일반=N): ");
        char t = keyboard.next().charAt(0);
        boolean early = (t == 'Y' || t == 'y');

        double ageRate =
                (age >= 65) ? 0.40 :
                        (age >= 8  && age <= 18) ? 0.30 : 0.0;

        double earlyRate = early ? 0.20 : 0.0;

        double rate = Math.max(ageRate, earlyRate);

        int discount = (int)Math.round(BASE * rate);
        int pay = BASE - discount;

        System.out.printf("기본요금: %,d원%n", BASE);
        System.out.printf("적용 할인율: %.0f%%%n", rate * 100);
        System.out.printf("할인액: %,d원%n", discount);
        System.out.printf("결제금액: %,d원%n", pay);
    }
}