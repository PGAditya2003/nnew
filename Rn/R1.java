
public class R1 {
    public int Factorial(int n){
       if(n==1)
       return 1;
       int result = Factorial(n-1)*n;
       return result;
       }
    
    public static void main(String[] args) {
       R1 ojb = new R1();
       
        System.out.println(ojb.Factorial(5));
    }
    
}
