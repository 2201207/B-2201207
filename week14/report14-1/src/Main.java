import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        Input input = new Input();
        Compute compute = new Compute();
        Output output = new Output();

        String[][][] students = new String[3][][];

        students[0] = new String[][]{
                {"2101234", "홍길동", "남"}, {"2101235", "경복대", "여"},
                {"2101236", "한국인", "남"}, {"2101345", "정상인", "여"}
        };

        students[1] = new String[][]{
                {"2301345", "구자철", "남"}, {"2301435", "이가을", "여"},
                {"2301443", "김광현", "남"}, {"2301678", "박종철", "남"},
                {"2301679", "올시즌", "여"}
        };

        students[2] = new String[][]{
                {"2401234", "한민국", "여"}, {"2401456", "안우진", "남"},
                {"2401789", "이대한", "남"}
        };

        int[][][] scores = new int[students.length][][];
        int[][] totals = new int[students.length][];
        float[][] avgs = new float[students.length][];
        int[][] classranks = new int[students.length][];
        int[][] schoolranks = new int[students.length][];

        for (int i = 0; i < students.length; i++) {
            int len = students[i].length;
            scores[i] = new int[len][4];
            totals[i] = new int[len];
            avgs[i] = new float[len];
            classranks[i] = new int[len];
            schoolranks[i] = new int[len];
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println("*** " + (i + 1) + "반 성적 입력 ***");
            for (int j = 0; j < students[i].length; j++) {

                scores[i][j] = input.inputscore(keyboard, (i + 1), students[i][j][1], students[i][j][2]);
            }
            System.out.println();
        }

        for (int i = 0; i < students.length; i++) {
            compute.calcclasstotal(scores[i], totals[i]);
            compute.calcclassavg(totals[i], avgs[i]);
        }
        compute.calcranks(totals, classranks, schoolranks);

        for (int i = 0; i < students.length; i++) {
            compute.sortbyid(students[i], scores[i], totals[i], avgs[i], classranks[i], schoolranks[i]);
        }

        output.printresult(students, scores, totals, avgs, classranks, schoolranks);
    }
}