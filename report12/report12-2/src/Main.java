import java.util.Scanner;
public class Main {
    public static boolean leapYearEven(int year) {
        // 4로 나누어 떨어지고, 100으로 안 나눠지거나 400으로 나눠지면 윤년 [cite: 25, 26, 27]
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
    public static int leapYearOdd(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner keyborad = new Scanner(System.in);
        System.out.print("년도 : ");
        int year = keyborad.nextInt();

        if (leapYearEven(year)) {
            System.out.println(year + "년은 윤년입니다.");
        } else {
            System.out.println(year + "년은 윤년이 아닙니다.");
        }
    }
}