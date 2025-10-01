import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int date = 0;
        String result = "";

        System.out.print("양의 정수 입력 : ");
        date = keyboard.nextInt();

        result = date % 2 == 0 ? "짝수" : "홀수";

        System.out.printf("%d는 %s이다. \n", date, result);
    }
}