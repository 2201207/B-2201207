public class Output {
    public static void display(String[] name, int[][] score) {
        display();
        System.out.println("이름, 국어, 영어, 수학, 총점");
        display();
        for (int i = 0; i < name.length; i++){
            System.out.printf("%3s, %3d, %3d, %3d, %3d\n", name);
        }
    }
    private static void display() {
        System.out.println("***************************************************************");
    }
    }
