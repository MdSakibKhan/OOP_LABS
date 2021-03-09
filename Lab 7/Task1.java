import java.util.Scanner;
public class Task1{
  public static void main(String[] args){
    Scanner scan= new Scanner(System.in);
    String a=scan.nextLine();
    char[] c=a.toCharArray();
    int k=0;
    for(int i=0; i<c.length;i++){
      k++;
      }
    System.out.println(k);
  }
}