import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] name = {"홍길동", "이순신", "강민성", "김지민", "이예린"};

        int[][] score = Input.inputData(name);

        Compute.process(score);
        Output.display(name, score);
    }
}