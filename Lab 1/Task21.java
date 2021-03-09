import java.util.Scanner;
public class Task21{
  public static void main(String[]args){
    Scanner scan =new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    for(int i =1;i <= a;i++){
      for(int j =1;j <= b;j++){
        if(i==a||j==b||i==1||j==1){
      System.out.print("*");
        }
        else{
         System.out.print(" "); 
        }
      }
       System.out.println();
    }
    
  }
}