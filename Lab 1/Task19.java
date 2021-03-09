import java.util.Scanner;
public class Task19{
  public static void main(String[]args){
    Scanner scan =new Scanner(System.in);
    int a = scan.nextInt();
    for(int i =1;i<= a;i++){
      for(int j = 1;j <= a-i;j++){
       System.out.print(" "); 
      }
      for(int c = 1;c <= 2*i-1;c++){
      System.out.print("*");
      }
      System.out. println();
    }
    
  }
}