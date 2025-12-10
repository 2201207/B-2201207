public class Compute {
    public void calcclasstotal(int[][] classscores, int[] classtotals) {
        for (int i = 0; i < classscores.length; i++) {
            int sum = 0;
            for (int s : classscores[i]) {
                sum += s;
            }
            classtotals[i] = sum;
        }
    }

    public void calcclassavg(int[] classtotals, float[] classavgs) {
        for (int i = 0; i < classtotals.length; i++) {
            classavgs[i] = (float) classtotals[i] / 4.0f;
        }
    }

    public void calcranks(int[][] totals, int[][] classranks, int[][] schoolranks) {
        for (int i = 0; i < totals.length; i++) {
            for (int j = 0; j < totals[i].length; j++) {

                int rank = 1;
                for (int k = 0; k < totals[i].length; k++) {
                    if (totals[i][k] > totals[i][j]) rank++;
                }
                classranks[i][j] = rank;

                int srank = 1;
                for (int x = 0; x < totals.length; x++) {
                    for (int y = 0; y < totals[x].length; y++) {
                        if (totals[x][y] > totals[i][j]) srank++;
                    }
                }
                schoolranks[i][j] = srank;
            }
        }
    }

    public void sortbyid(String[][] st, int[][] sc, int[] to, float[] av, int[] cr, int[] sr) {
        int n = st.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (st[j][0].compareTo(st[j+1][0]) > 0) {
                    swapstringarr(st, j, j+1);
                    swapintarr(sc, j, j+1);
                    swapint(to, j, j+1);
                    swapfloat(av, j, j+1);
                    swapint(cr, j, j+1);
                    swapint(sr, j, j+1);
                }
            }
        }
    }

    private void swapstringarr(String[][] arr, int i, int j) { String[] temp = arr[i]; arr[i] = arr[j]; arr[j] = temp; }
    private void swapintarr(int[][] arr, int i, int j) { int[] temp = arr[i]; arr[i] = arr[j]; arr[j] = temp; }
    private void swapint(int[] arr, int i, int j) { int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp; }
    private void swapfloat(float[] arr, int i, int j) { float temp = arr[i]; arr[i] = arr[j]; arr[j] = temp; }
}
