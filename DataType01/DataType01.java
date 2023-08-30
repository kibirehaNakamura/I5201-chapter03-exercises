public class DataType01 {
    public static void main(String[] args) {
        byte byteVal;
        short shortVal;
        int intVal;
        long longVal;
        
        longVal = 2147483648;
        longVal = 2147483648L;
        
        byteVal = 128;
        
        shortVal = 256;
        intVal = shortVal;
        shortVal = intVal;
        shortVal = (short)intVal;
    }
}