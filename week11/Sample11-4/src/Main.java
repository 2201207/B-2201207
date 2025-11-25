import java.io.IOException;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyborad = new Scanner(System.in);
        String[][] employees = {{"홍길동", "1111"}, {"강민성", "1211"}, {"김명성", "2111"},
                {"박건준", "1441"}, {"오유빈", "1444"}, {"니카타", "1456"},
                {"한정호", "1678"}, {"파마트", "1567"}, {"이예린", "1789"},
                {"제이넵", "1789"}};
       int[] hobong = {1, 4, 5, 3, 2, 1, 3, 4, 3, 2};
        int[][] salays = new int[employees.length][5];
        int i = 0;
        while (i < employees.length) {
            System.out.printf("%s님의 업무수당 입력 : ", employees[i][0]);
            salays[i][1] = keyborad.nextInt();
            if (salays[i][1] >= 0 && salays[i][1] <= 1000000)
                i++;
            else {
                System.err.println("ERROR : 업무 수당은 0 ~ 1,000,000 ");
                System.in.read();
            }

        }
        for (i = 0; i < employees.length; i++) {
            switch (hobong[i]) {
                case 1:
                    salays[i][0] = 1650000;
                    break;
                case 2:
                    salays[i][0] = 1680000;
                    break;
                case 3:
                    salays[i][0] = 1700000;
                    break;
                case 4:
                    salays[i][0] = 1720000;
                    break;
                case 5:
                    salays[i][0] = 1750000;
                    break;
                default:
                    salays[i][0] = 0;
            }
        }

        for (i = 0; i < employees.length; i++) {
            salays[i][2] = salays[i][0] + salays[i][1];
        }

        for (i = 0; i < employees.length; i++) {
            if (salays[i][2] >= 2600000) {
                salays[i][3] = (int) (salays[i][2] * (10.0f / 100));

            } else if (salays[i][2] >= 2000000) {
                if (salays[i][2] >= 2600000) {
                    salays[i][3] = (int) (salays[i][2] * (8.0f / 100));
                } else {
                    salays[i][3] = (int) (salays[i][2] * (5.0f / 100));
                }
            }

            for (i = 0; i < employees.length; i++) {
                salays[i][4] = salays[i][2] - salays[i][3];
            }

            for (i = 0; i < employees.length - 1; i++)
                for (int j = 0; j < employees.length - 1 - i; j++) {
                    if (salays[j][4] > salays[j + 1][4]) {
                        // 값 교환
                        String[] temp = employees[j];
                        employees[j] = employees[j + 1];
                        employees[j + 1] = temp;

                        int temp1 = hobong[j];
                        hobong[j] = hobong[j + 1];
                        hobong[j + 1] = temp1;

                        int[] temp2 = salays[j];
                        salays[j] = salays[j + 1];
                        salays[j + 1] = temp2;
                    }
                }
        }

            System.out.println("***********************************");
            System.out.println(" 이름  사번  호봉  기본급  업무수당  급여액  세금  지급액 ");
            System.out.println("***********************************");

            for (i = 0; i < employees.length; i++) {
                System.out.printf("%4s %5s %1d %,9d %,9d %,9d %,8d %,9d\n", employees[i][0],
                        employees[i][1], hobong[i], salays[i][0], salays[i][1], salays[i][2],
                        salays[i][3], salays[i][4]);
            }
            System.out.println("***********************************");
        }
    }
