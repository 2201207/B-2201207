import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {

    public static void main(String[] args) {
        final int BASIC = 1200, N = 10;
        final int[] RATE = {0,40,55,78,35,20};
        final double[] TAXR = {0,5.0,3.5,2.5,1.5,0.0};
        final String[] NAME = {"","가정용","영업용","공장용","관공서","군기관"};

        Scanner keyborad = new Scanner(System.in);
        String[] no = new String[N], nm = new String[N], note = new String[N];
        int[] code = new int[N], useAmt = new int[N], tax = new int[N], pay = new int[N];
        double[] usedRaw = new double[N];
        int[] used = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("\n=== " + (i+1) + "번째 데이터 입력 ===");
            System.out.print("번호(4자리): "); no[i] = keyborad.next();
            System.out.print("이름: "); nm[i] = keyborad.next();
            System.out.print("수도코드(1~5): "); code[i] = keyborad.nextInt();
            System.out.print("사용양(소수1자리): "); usedRaw[i] = keyborad.nextDouble();

            used[i]   = (int)Math.round(usedRaw[i]);              // 사사오입
            useAmt[i] = used[i] * RATE[code[i]];                  // 사용금액
            if (code[i] == 5) { tax[i] = 0; note[i] = "일괄징수"; }
            else {
                int ti = (int)((BASIC + useAmt[i]) * TAXR[code[i]] / 100.0);
                tax[i] = ti - (ti % 10);                            // 1의 자리 절사
                note[i] = "";
            }
            pay[i] = BASIC + useAmt[i] + tax[i];
        }

        System.out.println("\n------------------------------------------------------------");
        System.out.printf("%-6s %-6s %-6s %8s %10s %6s %10s %-6s%n",
                "번호","이름","구분","사용양","사용금액","TAX","납부액","비고");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < N; i++) {
            System.out.printf("%-6s %-6s %-6s %8.1f %,10d %,6d %,10d %-6s%n",
                    no[i], nm[i], NAME[code[i]], usedRaw[i], useAmt[i], tax[i], pay[i], note[i]);
        }
    }
    }
