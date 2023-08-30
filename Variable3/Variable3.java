public class Variable3 {
    public static void main(String[] args) {
        int a;
        int b;
        
        System.out.println("a = 5 * 15");
        a = 5 * 15;
        System.out.println("a = " + a);
        
        System.out.println("b = a");
        b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        System.out.println("a = a + b");
        a = a + b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}