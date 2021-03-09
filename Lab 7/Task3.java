import java.util.Scanner;
public class Task3{
  public static void main(String [] args){
    Scanner scan= new Scanner(System.in);
    String a=scan.nextLine();
    String b=scan.nextLine();
    char[] a1= a.toCharArray();
    char[] b1= b.toCharArray();
    String result= "true";
    for(int i=0;i<a1.length; i++){
      if(a1[i]!=b1[i]){
        result="false";
        break;
      }
    }
    System.out.println(result);
  }
}