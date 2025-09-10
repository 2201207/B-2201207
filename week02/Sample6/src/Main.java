import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;
        char gender;
        String temp;
    System.out.print("당신의 이름은 ?");
    name = keyboard.nextLine();
    System.out.print("홍길동님의 나이는 ?");
    age = keyboard.nextInt();
    System.out.print("홍길동님의 성별 (남 = M, 여 = F) :");
    gender = keyboard.next().charAt(0);
        temp = ((gender == 'M') || (gender == 'm')) ? "남자" : "여자";

    System.out.printf("%s님의 나이는 %d살 입니다.\n",name, age);
    System.out.printf("%s님의 성별은 %c(%s) 입니다.\n" , name, gender, temp);
    }
}