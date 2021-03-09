import java.util.Scanner;
public class Task12{
  public static void main(String[]args){
    Scanner scan =new Scanner(System.in);
    int a = scan.nextInt();
    for(int i =1;i <= a;i++){
      for(int s = 1;s <= a-i;s++){
       System.out.print(" "); 
      }
      for(int c = 1;c <= 2*i-1;c++){
      if(c==1||c==2*i-1){
      System.out.print(c);
        }
        else{
          System.out.print(" ");
        }
      }
      System.out. println();
    }
    for(int i = 1;i <= a-1;i++){
      for(int s = 1;s <= i;s++){
       System.out.print(" "); 
      } 
       for(int c = 1;c <= 2*(a-i)-1;c++){
          
      if(c==1||c==2*(a-i)-1){
      System.out.print(c);
        }
        else{
          System.out.print(" ");
        }
      }
       System.out. println(); 
    }
  }
}