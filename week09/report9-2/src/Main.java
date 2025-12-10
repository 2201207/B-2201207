//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        final int C500 = 500, C100 = 100;
        final int N500 = 10,  N100 = 10;
        final int MONTHS_PER_YEAR = 12;
        final int YEARS = 30;

        int month = C500 * N500 + C100 * N100;
        int amount = month * MONTHS_PER_YEAR * YEARS;

        System.out.printf("한 달 저금액: %,d원%n", month);
        System.out.printf("총 저금액(30년): %,d원%n", amount);

        }
    }