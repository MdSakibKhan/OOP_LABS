import java.util.Scanner;
public class Task6{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int a[]=new int[10];
    for (int i=0; i<15; i++){
     int n=scan.nextInt();
      a[n]++;
    }
    for(int i=0; i<a.length; i++){
      if(a[i]!=0){
      System.out.println( i +"has been entered"+ a[i] + "times");
    }
  }
}
}