import java.util.Scanner;
public class Task6{
   public static void main(String[]args){
      Scanner scan= new Scanner(System.in);
      String a=scan.nextLine();
      System.out.println(a);
      System.out.println(a.concat("==THE END=="));
      System.out.println(a);
      scan.close();
   }
}