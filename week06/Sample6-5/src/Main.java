import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int MPS = 340;
    float fighter;
    float temp;
    int result;
    System.out.printf("전투기의 스피는 입력 : ");
    fighter = keyboard.nextFloat();

    temp = fighter * 365 * 24 * 60 * 60 * MPS;
    result = (int) (temp / 1000);

    System.out.printf("마하 %.1f인 전투기의 1년간 간 거리는 %,d Km 입니다.\n", fighter, result);



    }
}