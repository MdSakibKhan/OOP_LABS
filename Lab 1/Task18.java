import java.util.Scanner;
public class Task18{
  public static void main(String[]args){
    Scanner scan =new Scanner(System.in);
    int a = scan.nextInt();
    for(int i =1;i <= a;i++){
      for(int s = 1;s <= a-i;s++){
       System.out.print(" "); 
      }
      for(int c =1;c <= i;c++){
      System.out.print("*");
      }
      System.out. println();
    }
    
  }
}