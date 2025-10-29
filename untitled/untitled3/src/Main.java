//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        System.out.print("**** 세금 계산 프로그램 ****\n");
        double buy = 1015000;
                double profit = 0.3;
                double tax = 0.1;

                double price = buy * (1 + profit);
                double taxout = price * tax;
                double taxin = buy * tax;
                double taxpay = taxout - taxin;

                System.out.printf("정가 : %.0f%n", price);
                System.out.printf("매출세액 : %.0f%n", taxout);
                System.out.printf("매입세액 : %.0f%n", taxin);
                System.out.printf("납부세액 : %.0f%n", taxpay);
            }
        }