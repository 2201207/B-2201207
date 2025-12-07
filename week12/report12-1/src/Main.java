import java.util.Scanner;
public class Main {
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }
    public static int max4(int a, int b, int c, int d) {
        return max(max(a, b), max(c, d));
    }
    public static void main(String[] args) {
        Scanner keyborad = new Scanner(System.in);

        System.out.println("4개의 정수를 입력하세요:");
        int n1 = keyborad.nextInt();
        int n2 = keyborad.nextInt();
        int n3 = keyborad.nextInt();
        int n4 = keyborad.nextInt();

        System.out.println("가장 큰 수는: " + max4(n1, n2, n3, n4));
    }
}