import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("3개의정수: ");
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = keyboard.nextInt();


        int max = a, min = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (b < min) min = b;
        if (c < min) min = c;
        int mid = a + b + c - max - min;

        System.out.printf("입력받은%d, %d, %d를크기순으로나열하면%d, %d, %d 입니다%n",
                a, b, c, min, mid, max);
    }
}