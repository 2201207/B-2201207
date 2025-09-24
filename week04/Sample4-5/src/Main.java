import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int salary, expenses; //data
int save, remain ;
       double money;
float saveRate; // 저축 비율(data)

        System.out.print("당신의 급여액 입력 : ");
        salary = keyboard.nextInt();
        System.out.print("월 저축 비율 (예 20% -> 0.2) : ");
        saveRate = keyboard.nextFloat();
        System.out.print("월 기본 지출 비용을 입력 : ");
        expenses = keyboard.nextInt();

        save = (int) (saveRate * salary);
        remain = salary - (save + expenses);
        money = remain / 30;
        System.out.printf("[예산 계산 결과]\n");
        System.out.printf("월급 : %,d원\n", salary);
        System.out.printf("저축액 : %,d원\n", save);
        System.out.printf("지출액 : %,d원\n", expenses);
        System.out.printf("남은 금액 : %,d원\n", remain);
        System.out.printf("일일 사용 가능 예산 : %,2f원\n", money);
    }
}