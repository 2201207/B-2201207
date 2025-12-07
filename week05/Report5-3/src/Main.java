import java.util.Scanner;//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("전체 초 입력: ");
        long total = keyboard.nextLong();

        long hours = total / 3600;
        long remain = total % 3600;
        long minutes = remain / 60;
        long seconds = remain % 60;

        System.out.printf("%d 초 = %d 시간 %d 분 %d 초%n", total, hours, minutes, seconds);
        }
    }

