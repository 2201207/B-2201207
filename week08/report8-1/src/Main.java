import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("**** 체육관 입장료 계산 ****\n");
        System.out.print("나이를 입력하세요: ");
        int age = keyboard.nextInt();

        int ticket = (age >= 18) ? 4000 :
                (age >= 13) ? 3000 :
                        (age >= 7)  ? 1000 : 0;

        System.out.println("입장료는 " + ticket + "원 입니다.");
    }
}