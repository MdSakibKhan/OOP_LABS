import java.util.Scanner;
public class Task5{
  public static void main(String[] args){
    Scanner scan= new Scanner(System.in);
    String a=scan.nextLine();
    char oldChar=scan.next().charAt(0);
    char newChar= scan.next().charAt(0);
    char[] a1=a.toCharArray();
    for(int k=0; k<a1.length; k++){
      if(a1[k]==oldChar){
        a1[k]=newChar;
        break;
  }
    }
    for(int i=0;i<a1.length; i++)
    System.out.print(a1[i]);
  }
}
