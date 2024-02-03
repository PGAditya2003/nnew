/**
 * R2
 */
public class R2 {

    public int Factorial(int n){
        if(n==1)
        return 1;
        int Result = Factorial(n-1)*n;
        return Result;
    }
    public static void main(String[] args) {
        
        R2 obj = new R2();
        System.out.println(obj.Factorial(4));
    }
}