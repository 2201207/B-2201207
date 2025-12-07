import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("식권 개수: ");
        int qty = keyboard.nextInt();

        System.out.print("식권 1장 가격(원): ");
        long unit = keyboard.nextLong();

        double rate = (qty >= 30) ? 0.20
                : (qty >= 20) ? 0.15
                : (qty >= 10) ? 0.10
                : 0.0;

        long total    = unit * qty;
        long discount = Math.round(total * rate);
        long pay      = total - discount;

        System.out.printf("총금액: %,d원%n", total);
        System.out.printf("할인율: %.0f%%%n", rate * 100);
        System.out.printf("할인액: %,d원%n", discount);
        System.out.printf("지불금액: %,d원%n", pay);
    }
}