import java.io.IOException;
import java.util.Scanner;

public class Input {
    public int[] inputscore(Scanner keyboard, int classnum, String name, String gender) throws IOException {
        int[] onestudentscore = new int[4];
        String[] subjects = {"국어", "영어", "수학", ""};

        if (gender.equals("남")) {
            subjects[3] = "기술";
        } else {
            subjects[3] = "가사";
        }
        for (int k = 0; k < 4; k++) {
            while (true) {
                System.out.print(classnum + "반 학생 " + name + "의 " + subjects[k] + " 점수 입력 : ");
                if (keyboard.hasNextInt()) {
                    int score = keyboard.nextInt();
                    keyboard.nextLine();

                    if (score >= 0 && score <= 100) {
                        onestudentscore[k] = score;
                        break;
                    } else {
                        System.out.println("ERROR : 점수는 0에서 100 사이여야 합니다. 다시 입력하세요.");
                    }
                } else {
                    keyboard.nextLine();
                    System.out.println("ERROR : 숫자로 입력하세요.");
                    System.in.read();
                }
            }
        }
        return onestudentscore;
    }
}
