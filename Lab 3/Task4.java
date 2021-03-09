import java.util.Scanner;
public class Task4{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    String s = scan.nextLine();
    int a=s.length();
    int arr[]=new int[123];
    for(int i=0;i<a;i++){
      int n=s.codePointAt(i);
      arr[n]++;
    }
    for(int i=97; i<=122; i++){
      if(arr[i]!=0){
      System.out.println((char)i+" Which is "+ i + " Has been entered "+arr[i]+" times");
    }
  }
}
}