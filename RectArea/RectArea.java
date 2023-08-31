import java.io.*;

public class RectArea {
    public static void main(String[] args) throws IOException {
        int height, width, area;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("縦の長さを入力してください");
        height = Integer.parseInt(br.readLine());
        System.out.println("横の長さを入力してください");
        width = Integer.parseInt(br.readLine());
        
        area = height * width;
        System.out.println("面積は" + area);
    }
}