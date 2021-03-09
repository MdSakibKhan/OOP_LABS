import java.util.Scanner;
public class tester {

	  public static void main(String[] args){
	    Scanner scan= new Scanner(System.in);
	    System.out.println("Enter a String variable / String 1");
	    String b1=scan.next();
	    myString a= new myString(b1);
	    a.len();// length of a string /task1
	    System.out.println("Enter char position for string 1");
	    int p = scan.nextInt();// index no input
	    a.position(p);// it will show the character in the given index /task2 
	    System.out.println("Enter 2nd String");
	    String b2 = scan.next();
	    a.start(b2);// comparing the 2 given String , startsWith or not /task3
	    a.end();// comparing the 2 given String , endsWith or not/ task4
	    System.out.println("Enter a String for changing char");
	    String s1= scan.next();
	    System.out.println("Enter oldChar for changing char");
	    char oldChar= scan.next().charAt(0); // taking old char for 1st String
	    System.out.println("Enter newChar for changing char");
	    char newChar= scan.next().charAt(0); // taking new char  for 1st String
	    a.change1st(oldChar,newChar,s1);// replacing the 1st char only in 1st String / task5
	    a.changeAll(oldChar,newChar,s1);// replacing all the matching char in 1st String / task6
	    a.changeLast(oldChar,newChar,s1);// replacing the last matching char / task7
	    System.out.println("Enter a upper case word that you want to see in lower case");
	    String u1=scan.next(); // upper case input
	    a.chotoWord(u1); // change to lower case / task 8
	    System.out.println("Enter a lower case word that you want to see in upper case");
	    String u2=scan.next(); // lower case input
	    a.boroWord(u2); // change to upper case / task 9
	    System.out.println("Enter 2 new String for checking equality");
	    String e1= scan.next();
	    String e2= scan.next();
	    a.shoman(e1,e2);// equality check for 2 strings /task 10
	    a.caseChara(e1,e2);// Ignore case equality check for 2 strings /task 11
	    System.out.println("Enter 2 new String for comparing = ");
	    String e4= scan.next();
	    String e5= scan.next();
	    a.tulona(e4,e5);// comparing task 12
	    scan.close();
	  }
}
