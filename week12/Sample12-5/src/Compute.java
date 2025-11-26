public class Compute {
    public static void standard(String[][] students, int[] height, float[][] weight){
        for(int i = 0; i < height.length; i++){
            if (students[i][1].equals("남")){
                weight[i][1] = (height[i]-100) * 0.9f;
            }else{
                weight[i][1]= (height[i] - 100) * 0.8f;
            }
        }
    }

    public static void bmi(String[][] students, int[] height, float[][] weight) {
        for(int i = 0; i < height.length; i++){
            if (students[i][1].equals("남")){
                weight[i][1] = (height[i]-100) * 0.9f;
            }else{
                weight[i][1]= (height[i] - 100) * 0.8f;
            }
        }
    }

    public static void check(String[][] students, int[] height, float[][] weight) {
    }
}
