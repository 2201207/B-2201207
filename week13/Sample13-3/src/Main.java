//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int[][] data = new int[][] {{1,2,3,4,5}, {6,7,8,9,10}};
        multiple(data);
        display(data);

        for (int i = 0; i < data.length; i++)
            multiple(data[i]);

        System.out.println("*****************************");
        for (int i = 0; i < data.length; i++)
            display(data[i]);
        System.out.println("*****************************");

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = multiple(data[i][j]);
            }
        }

        System.out.println("*******************************");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                display(data[i][j]);
            }
            System.out.println();
        }
        System.out.println("*******************************");
    }

    private static void display(int data) {
        System.out.printf("%3d ", data);
    }

    private static void display(int[] data) {
        System.out.println("*******************************");
        for (int i = 0; i < data.length; i++ ) {
            System.out.printf("%3d ", data[i]);
        }
        System.out.println();
    }

    private static void display(int[][] data) {
        System.out.println("********************************");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%3d ", data[i][j]);
                System.out.println();
            }
            System.out.println("********************************");
        }
    }

    private static void multiple(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] *= 2;
            }
        }
    }

    private static void multiple(int[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i] *= 2;
        }
    }

    private static int multiple(int data) {
        return data * 2;
    }
    }