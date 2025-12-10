import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
int radius;
double boxArea;
double circleArea;
double area;


System.out.println("원의 반지름:");
        radius = keyboard.nextInt();

        circleArea = Math.PI * radius * radius;
        boxArea = radius * 2 * radius * 2;
        area = boxArea - circleArea;

        System.out.printf("원의 반지름: %d\n", radius);
        System.out.printf("정사각형 면적: %.2f Cm2\n", boxArea);
        System.out.printf("원의 면적: %.2f Cm2\n", circleArea);
        System.out.printf("구하는 면적: %.2f Cm2\n", area);
        }
    }
