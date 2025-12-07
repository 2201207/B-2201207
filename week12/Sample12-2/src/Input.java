import java.util.Scanner;

public class Input {
    public static double readData(){
        Scanner keyboard = new Scanner(System.in);
        double temp;
        System.out.print("썹씨 온도 입력 : ");
        temp = keyboard.nextInt();

        return temp;
    }
}

