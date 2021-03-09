import java.util.Scanner;
public class Task7{
  public static void main(String[] args){
    Scanner scan= new Scanner(System.in);
    String a=scan.nextLine();
    char oldChar=scan.next().charAt(0);
    char newChar= scan.next().charAt(0);
    char[] a1=a.toCharArray();
    for(int k=a1.length-1;k>=0; k--){
      if(a1[k]==oldChar){
        a1[k]=newChar;
        break;
      }
    }
    for(int i=0;i<a1.length; i++)
      System.out.print(a1[i]);
  }
}
