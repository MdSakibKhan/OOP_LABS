public class Task7{
public static void main(String[]args){
char[] array = {'a', 'b', 'c', 'd', 'e', 'f','g' };
String c= "Hello!!!!";
System.out.println(c.compareTo("Hello!"));
System.out.println(c.compareToIgnoreCase("HELLO!!"));
System.out.println(c.startsWith("HO"));
System.out.println(c.endsWith("!!"));
System.out.println(c.equals("HELLO!!"));
System.out.println(c.equalsIgnoreCase("HELLO!!!!"));
System.out.println(c.indexOf('!'));
System.out.println(c.lastIndexOf('H'));
System.out.println(c.length());
System.out.println(c.replace('!','?'));
System.out.println(c.substring(1,5));
System.out.println(c.toCharArray());
System.out.println(c.toLowerCase());
System.out.println(c.toUpperCase());
System.out.println(c.trim());
System.out.println(String.valueOf(array));
}
}