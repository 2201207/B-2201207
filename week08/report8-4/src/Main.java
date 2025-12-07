import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
                Scanner keyboard = new Scanner(System.in);
        System.out.print("**** 구의 부피와 표면적 계산 프로그램 ****\n");
                final double PI = 3.141592;

                System.out.print("반지름 입력 : ");
                int r =  keyboard.nextInt();

                double v = (4.0 / 3.0) * PI * r * r * r;
                double s = 4 * PI * r * r;

                System.out.printf("구의 부피 : %.2f%n", v);
                System.out.printf("구의 표면적 : %.2f%n", s);

            }
        }