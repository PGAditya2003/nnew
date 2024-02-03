import java.util.Scanner;

public class test {

   public void nums(int num){
      if (num == 0) {
         return;
      }
      System.out.println(num);
      nums(num-1);
      System.out.println(num);   
   
   }

   void printPASS(){ 
      for(int i = 0;i<10000 ;i++)
         System.out.println(i); 
   } 

   void PASS(){
      String p = "";
      System.out.println(p);
      for(int i = 0;i<1000; i++){
         p = Integer.toString(i);
      System.out.println("0"+ Integer.toString(i));
      }
      for(int i = 1000; i<10000 ; i++){
         System.out.println(Integer.toString(i));
      }
   }   

   void Hypotenuse(){
      int n = 10;
      int m = 50;
      int a = (int)Math.ceil((double)n/2);
      int b = (int)Math.ceil((double)m/2);
      System.out.println(a*b);
   }
 
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    test ob = new test();
    ob.Hypotenuse();
    scan.close();
   }
    
}
