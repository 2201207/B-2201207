//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
    final  int Year = 365; // 1년
    final int SPEED = 300000; //빛 1초 가는 거리
int second;
long result;

second = Year * 24 * 60 * 60;
        result = (long) second * SPEED;
        System.out.printf("빛은 1초에 %,d Km를 이동합니다.\n", SPEED);
        System.out.printf("%d일은 %,d 초 입니다.\n", Year, second);
        System.out.printf("빛이 %d일동안 이동한 거리는 %,d Km 입니다.\n", Year, result);

    }
}