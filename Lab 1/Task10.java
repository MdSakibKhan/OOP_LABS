import java.util.Scanner;
public class Task10{
  public static void main(String[]args){
    Scanner scan =new Scanner(System.in);
    int a = scan.nextInt();
    for(int i =1;i <= a;i++){
      for(int j = 1;j <= a-i;j++){
       System.out.print(" "); 
      }
      for(int k =a-i+1;k <= a;k++){
        if(k==a||k==a-i+1||i==a){
         
      System.out.print(k);
        }
        else{
          System.out.print(" ");
        }
      }
      System.out. println();
    }
    
  }
}