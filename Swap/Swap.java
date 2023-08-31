public class Swap {
    public static void main(String[] args) {
        int valX, valY;
        int temp;
        
        valX = 1000;
        valY = 500;
        System.out.println("入れ替え前");
        System.out.println("Xは " + valX);
        System.out.println("Yは " + valY);
        
        temp = valX;
        valX = valY;
        valY = temp;
        
        System.out.println("入れ替え後");
        System.out.println("Xは " + valX);
        System.out.println("Yは " + valY);
    }
}