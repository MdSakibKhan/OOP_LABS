import java.util.Scanner;
public class Task20{
  public static void main(String[]args){
    Scanner scan =new Scanner(System.in);
    int a = scan.nextInt();
    for(int i =1;i <= a;i++){
      for(int j = 1;j <= a-i;j++){
       System.out.print(" "); 
      }
      for(int k = 1;k <= 2*i-1;k++){
      System.out.print("*");
      }
      System.out. println();
    }
    for(int i = 1;i <= a-1;i++){
      for(int j = 1;j <= i;j++){
       System.out.print(" "); 
      } 
       for(int k = 1;k <= 2*(a-i)-1;k++){
      System.out.print("*");
      }
       System.out. println(); 
    }
  }
}