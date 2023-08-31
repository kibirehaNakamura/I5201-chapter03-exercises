import java.io.*;

public class Circle {
    public static void main(String[] args) throws IOException {
        int r;
        double circ, area;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("半径を整数で入力してください");
        r = Integer.parseInt(br.readLine());
        circ = r * 2 * 3.141592;
        System.out.println("円周は" + circ);
        area = r * r * 3.141592;
        System.out.println("面積は" + area);
    }
}