import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("판매금액(원): ");
        long total = keyboard.nextLong();

        long amount = total * 10 / 11;
        long tax    = total - amount;

        System.out.printf("금액: %,d원%n", amount);
        System.out.printf("세금: %,d원%n", tax);
    }
}