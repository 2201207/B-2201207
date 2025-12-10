public class Output {
    public void printresult(String[][][] st, int[][][] sc, int[][] to, float[][] av, int[][] cr, int[][] sr) {

        float schooltotalsum = 0;
        int schoolstudentcount = 0;

        for (int i = 0; i < st.length; i++) {
            System.out.println("\n*** " + (i + 1) + "반 성적표 ***");
            System.out.println("****************************************************************************************");
            System.out.println("학번 이름 국어 영어 수학 선택 총점 평균 반석차 학년석차 기타");
            System.out.println("****************************************************************************************");

            float classtotalsum = 0;
            for (float avg : av[i]) {
                classtotalsum += avg;
            }
            float classavg = classtotalsum / st[i].length;

            for (int j = 0; j < st[i].length; j++) {
                schooltotalsum += av[i][j];
                schoolstudentcount++;

                String note = "";
                if (av[i][j] < classavg) {
                    note = "반평균 미만";
                }

                System.out.printf("%s %s %d %d %d %d %d %.2f %d %d %s\n",
                        st[i][j][0], st[i][j][1],
                        sc[i][j][0], sc[i][j][1], sc[i][j][2], sc[i][j][3],
                        to[i][j], av[i][j], cr[i][j], sr[i][j], note
                );
            }
            System.out.println("****************************************************************************************");
            System.out.printf("%d반 전체 평균: %.2f\n", (i+1), classavg);
            System.out.println("----------------------------------------------------------------------------------------");
        }

        System.out.printf("학년 전체 평균: %.2f\n", (schooltotalsum / schoolstudentcount));
    }
}
