import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyborad = new Scanner(System.in);
        float litter = 0.0f;
        float Km = 0.0f;
        float result = 0.0f;

        System.out.printf("소비된 연료 량 입력 ");
        litter = keyborad.nextFloat();
        System.out.printf("운행한 거리 입력 ");
        Km = keyborad.nextFloat();
        result = Km / litter;

        System.out.printf("자동차 소비된 연료 : %.1f Litter\n", litter);
        System.out.printf("자동차 운행 거리 : %.1f Km\n", Km);
        System.out.printf("연비 :  %.2f%c\n", result, '\u339e');
    }
}