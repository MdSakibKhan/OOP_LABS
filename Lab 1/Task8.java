import java.util.Scanner;
public class Task8{
  public static void main(String[]args){
    Scanner scan =new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    for(int i =1;i <= a;i++){
      for(int c =1;c <= b;c++){
        if(i==a||c==b||i==1||c==1){
          System.out.print(c);
        }
        else{
          System.out.print(" "); 
        }
      }
      System.out.println();
    } 
  }
}