import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("주유 리터 수: ");
        double liters = keyboard.nextDouble();

        System.out.print("리터당 가격(원): ");
        double pricePerLiter = keyboard.nextDouble();

        long subtotal = Math.round(liters * pricePerLiter);
        boolean discountApplies = subtotal >= 50000;
        long discount = discountApplies ? Math.round(subtotal * 0.07) : 0;
        long afterDiscount = subtotal - discount;
        long vat = Math.round(afterDiscount * 0.10);
        long total = afterDiscount + vat;

        System.out.printf("총 금액(할인 전): %,d원%n", subtotal);
        System.out.printf("할인 적용 여부: %s%n", discountApplies ? "적용" : "미적용");
        System.out.printf("할인액: %,d원%n", discount);
        System.out.printf("할인 후 금액: %,d원%n", afterDiscount);
        System.out.printf("부가세(10%%): %,d원%n", vat);
        System.out.printf("최종 지불 금액: %,d원%n", total);

    }
}