import java.util.Scanner;
public class Task23{
  public static void main(String[]args){
    Scanner scan =new Scanner(System.in);
    int a = scan.nextInt();
    for(int i =1;i <= a;i++){
      for(int j = 1;j <= a-i;j++){
       System.out.print(" "); 
      }
      for(int c =a-i+1;c <= a;c++){
        if(c==a||c==a-i+1||i==a){
         
      System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out. println();
    }
    
  }
}