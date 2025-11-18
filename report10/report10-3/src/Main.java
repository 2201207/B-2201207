import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    static final double W_MID = 0.15;
    static final double W_FIN = 0.15;
    static final double W_QZ  = 0.10;
    static final double W_HW  = 0.40;
    static final double W_ATT = 0.20;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int N = 10;

        String[] id   = new String[N];
        String[] name = new String[N];
        int[] mid = new int[N], fin = new int[N], quiz = new int[N], hw = new int[N], att = new int[N];
        double[] w = new double[N];

        for (int i = 0; i < N; i++) {
            int no = i + 1;
            System.out.println("===== " + no + "번째 학생 입력 =====");
            System.out.print("학번: ");
            id[i] = keyboard.next();
            System.out.print("이름: ");
            name[i] = keyboard.next();

            mid[i]  = readScore(keyboard, "중간(0~100): ");
            fin[i]  = readScore(keyboard, "기말(0~100): ");
            quiz[i] = readScore(keyboard, "퀴즈(0~100): ");
            hw[i]   = readScore(keyboard, "과제(0~100): ");
            att[i]  = readScore(keyboard, "출석(0~100): ");

            w[i] = mid[i]*W_MID + fin[i]*W_FIN + quiz[i]*W_QZ + hw[i]*W_HW + att[i]*W_ATT;
            System.out.println();
        }

        for (int i = 0; i < N - 1; i++) {
            int best = i;
            for (int j = i + 1; j < N; j++) if (w[j] > w[best]) best = j;
            swap(id, i, best); swap(name, i, best);
            swap(mid, i, best); swap(fin, i, best); swap(quiz, i, best);
            swap(hw, i, best);  swap(att, i, best); swap(w, i, best);
        }

        System.out.println("*************************************************");
        System.out.printf("%-8s %-6s %4s %4s %4s %6s %4s %6s%n",
                "학번","이름","중간","기말","퀴즈","레포트","출석","점수");
        System.out.println("*************************************************");
        for (int i = 0; i < N; i++) {
            System.out.printf("%-8s %-6s %4d %4d %4d %6d %4d %7.2f%n",
                    id[i], name[i], mid[i], fin[i], quiz[i], hw[i], att[i], w[i]);
        }
        System.out.println("*************************************************");

        keyboard.close();
    }

    static int readScore(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                int v = sc.nextInt();
                if (0 <= v && v <= 100) return v;
            } else {
                sc.next(); // 잘못된 토큰 소비
            }
            System.err.println("ERROR: 0~100 사이로 다시 입력하세요.");
        }
    }

    static void swap(String[] a, int i, int j){ String t=a[i]; a[i]=a[j]; a[j]=t; }
    static void swap(int[] a, int i, int j){ int t=a[i]; a[i]=a[j]; a[j]=t; }
    static void swap(double[] a, int i, int j){ double t=a[i]; a[i]=a[j]; a[j]=t; }
    }
