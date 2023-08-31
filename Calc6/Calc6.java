public class Calc6 {
    public static void main(String[] args) {
        int ans;
        int valA, valB;
                              //0. ans = 不定, valA = 不定, valB = 不定
        valA = 5;             //1. ans = 不定, valA = 5   , valB = 不定
        valB = valA;          //2. ans = 不定, valA = 5   , valB = 5
        ans = valA + valB;    //3. ans = 10  , valA = 5   , valB = 5
        valA = ans * 2;       //4. ans = 10  , valA = 20  , valB = 5
        ans = valA + valB;    //5. ans = 25  , valA = 20  , valB = 5
        ans = ans * 2;        //6. ans = 50  , valA = 20  , valB = 5
        
        System.out.println("ans = " + ans);    //表示される結果は"ans = 50"
    }
}