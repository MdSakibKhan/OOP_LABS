import java.util.Scanner;
public class Task2{
  public static void main(String[] args){
    Scanner scan= new Scanner(System.in);
    String a=scan.nextLine();
    char[] c=a.toCharArray();
    int k=scan.nextInt();
    if(k<=c.length){
      System.out.println(c[k-1]);
  }
     if(k>c.length || k<0){
      System.out.println("Invalid index");
  }
}
}