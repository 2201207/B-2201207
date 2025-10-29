import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("국어, 영어, 수학 점수는? ");
        int kor = keyboard.nextInt();
        int eng = keyboard.nextInt();
        int math = keyboard.nextInt();

        double avg = (kor + eng + math) / 3.0;

        char grade = (avg >= 90) ? 'A' :
                (avg >= 80) ? 'B' :
                        (avg >= 70) ? 'C' :
                                (avg >= 60) ? 'D' : 'F';

        String result = (avg >= 80) ? "성적양호" :
                (avg >= 60) ? "노력" : "성적불량";

        System.out.println("================================");
        System.out.printf("%-6s %-6s %-6s %-6s %-4s %-8s%n",
                "국어", "영어", "수학", "평균", "학점", "결 과");
        System.out.printf("%-6d %-6d %-6d %6.2f   %-2c %-8s%n",
                kor, eng, math, avg, grade, result);
        System.out.println("================================");
    }
}