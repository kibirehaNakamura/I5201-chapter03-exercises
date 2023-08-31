import java.io.*;

public class ConsTax {
    public static void main(String[]args) throws IOException {
        int money;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("金額を入力してください");
        money = Integer.parseInt(br.readLine());
        money = (int)(money + (money * 0.08));
        System.out.println("税込み￥" + money);
    }
}