import java.util.Scanner;//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("나이: ");
        int age = keyboard.nextInt();

        System.out.print("교통카드 사용(Y/N): ");
        char c = keyboard.next().charAt(0);
        boolean card = (c == 'Y' || c == 'y');

        System.out.print("탑승 시간(시, 0~23): ");
        int hour = keyboard.nextInt();

        final int ADULT_CARD = 1250, ADULT_CASH = 1350;
        final int TEEN_CARD  =  750, TEEN_CASH  =  850;
        final int CHILD_CARD =  450, CHILD_CASH =  450;

        int base =
                (age >= 19) ? (card ? ADULT_CARD : ADULT_CASH) :
                        (age >= 13) ? (card ? TEEN_CARD  : TEEN_CASH ) :
                                (age >=  6) ? (card ? CHILD_CARD : CHILD_CASH) :
                                        0;

        boolean late = (hour >= 22 || hour <= 5);
        int surcharge = late ? (int)Math.round(base * 0.20) : 0;

        int total = base + surcharge;

        System.out.printf("기본요금: %,d원%n", base);
        System.out.printf("심야추가: %,d원%n", surcharge);
        System.out.printf("총 요금: %,d원%n", total);
    }
}