import java.io.*;

public class InputVariable {
    public static void main(String[] args) throws IOException {
        String name;
        int age;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("名前を入力してください");
        name = br.readLine();
        
        System.out.println(name + "さんは、何歳ですか？");
        age = Integer.parseInt(br.readLine());
        
        System.out.println(name + "さんは、若く見えますね");
        System.out.println((age - 5) + "歳くらいだと思いました");
    }
}