//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        final int DEPTH = 300, UP = 55, DOWN = 13;
        int day = 0, pos = 0;

        while (pos < DEPTH) {
            day++;
            pos += UP;
            if (pos >= DEPTH) break;
            pos -= DOWN;
        }
        System.out.printf("%d일째 낮에 탈출 (최종 %dcm)%n", day, pos);
        }
    }