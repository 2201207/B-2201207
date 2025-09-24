//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
    int time = 1000;
    int work = 5;
    int day = 7;
    int money = 25000;
    money = ((time * work) * day);
        System.out.printf("나의 시급 : %d %c\n", time, '\uffe6');
        System.out.printf("하루의 일한 시간 : %d 시간\n", work);
        System.out.printf("며칠 일했나요 : %d 일\n", day);
        System.out.printf("나의 지갑에 돈 : %,d %c\n", money, '\uffe6');

    }
}