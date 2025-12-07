public class Output {
    public static void display(int[] data, int result){
        display("*");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("data[%d] = %d\n", i, data[i]);
        }
        System.out.printf(" 합계 : %,d\n",result);
        display("+");
    }
    private static <string> void display(string temp){
        for (int i = 0; i<30; i++)
            System.out.print(temp);
        System.out.println();
    }
}
