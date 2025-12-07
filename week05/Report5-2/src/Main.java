import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int score;
        int grade;
        char plus;
        System.out.print(" 당신의 JAVA 점수 입력 : ");
        score = keyboard.nextInt();
        grade = 'A' * ((score >= 90) ? 1 : 0) +
                'B' * ((score >= 80 && score <= 89) ? 1 : 0) +
                'C' * ((score >= 70 && score <= 79) ? 1 : 0) +
                'D' * ((score >= 60 && score <= 69) ? 1 : 0) +
                'F' * ((score < 60) ? 1 : 0);
        plus = (score == 100 || score % 10 >= 5) ? '+' : '0';
        System.out.printf("\n 입력 점수 : %d", score);
        System.out.printf("\n 학점 : %c%c\n", grade, grade == 'F' ? ' ' : plus);

    }
}