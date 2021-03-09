import java.util.Scanner;
public class Task7{
  public static void main(String[] args){
    Scanner scan= new Scanner(System.in);
    int n= scan.nextInt();
    {
      for(int k=1; k<=n; k++){
      for(int j=1; j<=n-k; j++){
        System.out.print(" ");
      }
      for(int i=1; i<=2*k-1; i++){
        System.out.print(i);
      }
      System.out.println();
      }
  }
    int stop=2*n-3;
    for(int k=1; k<=n-1; k++){
      for(int j=1; j<=k; j++){
        System.out.print(" ");
      }
      for(int i=1; i<=stop; i++){
        System.out.print(i);
      }
      System.out.println();
      stop-=2;
    }
}
}