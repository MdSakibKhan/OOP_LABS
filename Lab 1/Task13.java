import java.util.Scanner;
public class Task13{
  public static void main(String[]args){
    Scanner scan =new Scanner(System.in);
    int a = scan.nextInt();
    for(int i =1; i <= a;i++){
      System.out.print(i);
    }
    for(int j = a-1;j >=1;j--){
      System.out.print(j); 
    }
    
  }
}