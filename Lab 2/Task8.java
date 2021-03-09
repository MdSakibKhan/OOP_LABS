import java.util.Scanner;
public class Task8{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int a[]= new int [10];
    for(int i=0; i<a.length; i++){
      int n=scan.nextInt();
      for(int j=0; j<=i; j++){
        if(n==a[j]){
          System.out.println("Number already exist,enter another number");
          int k=scan.nextInt();
          n=k;
        }
      }
      a[i]=n;
    }
    for(int g=0; g<a.length; g++){
      System.out.print(a[g]+" ");
    }
  }
}