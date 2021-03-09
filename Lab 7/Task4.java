import java.util.Scanner;
public class Task4{
  public static void main(String[] args){
    Scanner scan= new Scanner(System.in);
    String a=scan.nextLine();
    String b=scan.nextLine();
    char[] a1= a.toCharArray();
    char[] b1= b.toCharArray();
    String result= "false";
    for(int i=a1.length-1; i>=0; i--){
         if(a1[i]==b1[i]){
      result= "true";
    }
         if(b1[i]!=a1[i]){
           result="false";
           break;
    }
      }
    System.out.println(result);
  }
}