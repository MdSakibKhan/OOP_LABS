import java.util.Scanner;
public class Task9{
  public static void main(String[]args){
    Scanner scan =new Scanner(System.in);
    int a = scan.nextInt();
    for(int i =1;i <= a;i++){
      for(int j =1;j <=i;j++){
        if(j==1||i==a||j==i){
      System.out.print(j);
        }
        else{
          System.out.print(" ");
        }
      }
      System.out. println();
    }
    
  }
}