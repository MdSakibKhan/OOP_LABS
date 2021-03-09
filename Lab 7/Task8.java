import java.util.Scanner;
public class Task8{
  public static void main(String[] args){
    Scanner scan= new Scanner(System.in);
    String a=scan.nextLine();
    char[] a1=a.toCharArray();
    int code;
    for(int i= 0; i<a1.length; i++){
      if(a.codePointAt(i)>=65 && a.codePointAt(i)<=123){
      code= a.codePointAt(i);
      a1[i]=(char)(code+32);
    }
    }
    System.out.print(a1);
  }
}
      
