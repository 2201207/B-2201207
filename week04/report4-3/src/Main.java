import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("dollar 개수: ");
        long dollar = keyboard.nextLong();
        System.out.print("half(50c) 개수: ");
        long half = keyboard.nextLong();
        System.out.print("quarter(25c) 개수: ");
        long quarter = keyboard.nextLong();
        System.out.print("dime(10c) 개수: ");
        long dime = keyboard.nextLong();
        System.out.print("nickel(5c) 개수: ");
        long nickel = keyboard.nextLong();
        System.out.print("penny(1c) 개수: ");
        long penny = keyboard.nextLong();

        long totalCents = dollar*100 + half*50 + quarter*25 + dime*10 + nickel*5 + penny;
        long dollars = totalCents / 100;
        long cents   = totalCents % 100;

        System.out.printf("총 금액(센트): %,d cent%n", totalCents);
        System.out.printf("총 금액(달러): %d.%02d dollar%n", dollars, (int)cents);
    }
}