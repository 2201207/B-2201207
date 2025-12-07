import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("현재 온도(정수): ");
        int temp = keyboard.nextInt();

        if (temp >= 35) {
            System.out.println("폭염경보");
        } else if (temp >= 30) {
            System.out.println("폭염주의보");
        } else if (temp >= -10) {
            System.out.println("정상온도");
        } else {
            System.out.println("한파경보");
        }

    }
}