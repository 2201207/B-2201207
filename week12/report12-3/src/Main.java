import java.util.Scanner;
public class Main {
    static String[] numHan = {"", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
    // 4자리 안에서의 단위
    static String[] unitSmall = {"", "십", "백", "천"};
    // 4자리마다 붙는 큰 단위
    static String[] unitBig = {"", "만", "억", "조"};
    public static String convertHangul(long money) {
        if (money == 0) return "영원";

        String result = "";
        int bigUnitIndex = 0;

        while (money > 0) {
            long part = money % 10000;

            if (part > 0) {
                String partStr = convertPart((int)part);
                result = partStr + unitBig[bigUnitIndex] + " " + result;
            }

            money /= 10000;
            bigUnitIndex++;
        }


        return result + "원";
    }
    private static String convertPart(int num) {
        String str = "";
        int smallUnitIndex = 0;

        while (num > 0) {
            int digit = num % 10;
            if (digit > 0) {
                str = numHan[digit] + unitSmall[smallUnitIndex] + str;
            }
            num /= 10;
            smallUnitIndex++;
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("금액 입력 : ");
        long money = keyboard.nextLong();

        System.out.println(convertHangul(money));
    }
}