import java.util.Scanner;
public class Task4{
  public static void main(String[] args){
    Scanner scan= new Scanner(System.in);
    int n= scan.nextInt();{
      for(int k=1; k<=n; k++){
      int j;
      for(j=1; j<=n-k; j++){
        System.out.print(" ");
      }
      for(int i=j; i<=n; i++){
        System.out.print(i);
      }
      System.out.println();
      }
  }
}
}
