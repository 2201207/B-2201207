//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        final int HEADS = 37, LEGS = 102;

        int c1 = -1, d1 = -1;
        for (int chicken = 0; chicken <= HEADS; chicken++) {
            int dog = HEADS - chicken;
            if (2 * chicken + 4 * dog == LEGS) { c1 = chicken; d1 = dog; break; }
        }
        System.out.printf("for  닭:%d 개:%d%n", c1, d1);

        int chicken2 = 0, c2 = -1, d2 = -1;
        while (chicken2 <= HEADS) {
            int dog2 = HEADS - chicken2;
            if (2 * chicken2 + 4 * dog2 == LEGS) { c2 = chicken2; d2 = dog2; break; }
            chicken2++;
        }
        System.out.printf("while 닭:%d 개:%d%n", c2, d2);

        int chicken3 = 0, c3 = -1, d3 = -1;
        do {
            int dog3 = HEADS - chicken3;
            if (2 * chicken3 + 4 * dog3 == LEGS) { c3 = chicken3; d3 = dog3; break; }
            chicken3++;
        } while (chicken3 <= HEADS);
        System.out.printf("do   닭:%d 개:%d%n", c3, d3);
    }
}