import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("구매금액(원): ");
        int amount = keyboard.nextInt();

        System.out.print("멤버십 회원입니까? (Y/N): ");
        char m = keyboard.next().charAt(0);
        boolean isMember = (m == 'Y' || m == 'y');

        boolean free = (amount >= 50000) || (isMember && amount >= 30000);

        System.out.printf("무료배송 가능여부: %s%n", free ? "적용" : "미적용");

    }
}