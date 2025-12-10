import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        final int price1 = 56000;

        System.out.print("면적(평): ");
        double py = keyboard.nextDouble();

        long price2 = (long)(py * price1);
        long finalPrice = (price2 / 1000) * 1000;

        System.out.printf("주택지 가격: %,d 원", finalPrice);

    }
}