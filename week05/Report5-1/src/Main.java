import java.io.IOException;

public class Main {
    public static void main(String[] args)  throws IOException {
        int ch, result;
        boolean flag;
        char origin;
        char convert;
        String message;
        System.out.print("\n 하나의 문자 입력 : ");
        ch = System.in.read();
        flag = ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
                ? true : false;
        origin = (ch >= 'a' && ch <= 'z') ? '소' : '대';
        convert = (ch >= 'a' && ch <= 'z') ? '대' : '소';
        result = (ch >= 'a' && ch <= 'z') ? (ch + 'A' - 'a') : (ch + 'a' - 'A');
        message = flag == true ?
                String.format("\n 입력문자 %c는 %c문자이고, %c문자로 변경하면 %c 입니다.\n",
                        ch, origin, convert, result) :
                String.format("\n 입력 오류 입니다.");
        System.out.printf(message);

    }
}