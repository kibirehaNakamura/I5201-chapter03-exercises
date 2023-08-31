public class ExamString {
    public static void main(String[] args) {
        String str1;
        str1 = "Hello!";
        System.out.println("1. str1 = " + str1 + "\n");
        
        String str2 = str1;
        System.out.println("2. str1 = " + str1);
        System.out.println("2. str2 = " + str2 + "\n");
        
        str1 = "How you doing?";
        System.out.println("3. str1 = " + str1);
        System.out.println("3. str2 = " + str2);
    }
}