import java.util.Scanner;
public class Task9{
  public static void main(String[] args){
  Scanner scan=new Scanner(System.in);
  int []a=new int[10];
  for(int i=0; i<a.length;i++){
    a[i]=scan.nextInt();
  }
  for(int i=0; i<a.length; i+=2){
    System.out.print(a[i]+" ");
   }
  for(int i=1; i<a.length; i+=2){
    System.out.print(a[i]+" ");
  }
  }
}