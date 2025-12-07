import java.io.IOException;
public class Main {
        public static void main(String[] args) throws IOException {
            String[][] customers = new String[][] {{"1111","홍길동","1",""},{"2222","문예영","2",""},{"3333","홍길동","3",""},{"4444","홍길동","4",""},{"5555","홍길동","5",""},
                    {"6666","홍길동","2",""},{"7777","홍길동","4",""},{"8888","홍길동","3",""},{"9999","홍길동","5",""},{"1010","홍길동","1",""}};

            int[][] money = new int[customers.length][3];
            Input.preProcess(customers);
            float[] used = Input.readData(customers);
            for (int i = 0; i < money.length; i++) {
                Compute.pay(money[i], customers[i], used[i]);
            }

            Compute.tax(customers, money);

            for (int i = 0; i < money.length; i++) {
                //Compute.total(money[i]);
            }

            Output.display(customers, money, used);
    }
}