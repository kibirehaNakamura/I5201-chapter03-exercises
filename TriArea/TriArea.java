import java.io.*;

public class TriArea {
    public static void main(String[] args) throws IOException {
        int base, height, area;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("底辺の長さを入力してください");
        base = Integer.parseInt(br.readLine());
        System.out.println("高さを入力してください");
        height = Integer.parseInt(br.readLine());
        
        area = base * height / 2;
        System.out.println("面積は" + area);
    }
}