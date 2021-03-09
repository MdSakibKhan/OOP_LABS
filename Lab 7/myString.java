
public class myString {
	 String s;
	  char []x1;
	  int l=0;
	  char []x2;
	  boolean st;
	  char [] first; 
	  char [] all;
	  char [] last;
	  char [] lower;
	  char [] upper;
	  char [] equalOne;
	  char [] equalTwo;
	  char [] com1;
	  char [] com2;
	  int code;
	  int case1;
	  int case2;
	  int shomanNa;
	  int shongkha;
	  public myString(String b1){
	    this.s=b1;
	    x1=s.toCharArray();
	  }
	  
	  public void len(){
	    for(int i=0;i<x1.length;i++){
	      l++;
	    }
	    System.out.println("Length of the input is = "+l);
	  }
	  
	  public void position(int p){
	    System.out.println("Character in the given index = "+x1[p-1]);
	  }
	  
	  public void start(String b2){
	    this.x2= b2.toCharArray();
	    for(int i=0;i<x1.length; i++){
	      if(x1[i]!=x2[i]){
	        st=false;
	        break;
	      }
	      else{
	        this.st=true;
	      }
	    }
	    System.out.println("startsWith result = "+st);
	  }
	  
	  
	  public void end(){
	    if(x1[x1.length-1]!=x2[x2.length-1]){
	      this.st=false;
	      System.out.println("endsWith result = "+st);
	    }
	    else{
	      st=true;
	      System.out.println("endsWith result = "+st);
	    }
	  }
	  public void change1st(char oldChar, char newChar,String s1){
	    first=s1.toCharArray();
	    for(int i=0;i<first.length; i++){
	      if(first[i]==oldChar){
	        first[i]=newChar;
	        break;
	      }
	    }
	    System.out.print("Replaced 1st matching char for string 1 = ");
	    for(int i=0;i<first.length; i++){
	      System.out.print(first[i]);
	    }
	    System.out.println(); 
	  }
	  
	  
	  public void changeAll(char oldChar, char newChar, String s1){
	    all= s1.toCharArray();
	    for(int i=0;i<all.length; i++){
	      if(all[i]==oldChar){
	        all[i]=newChar;
	      }
	    }
	    System.out.print("Replaced All matching char for string 1 = ");
	    for(int i=0;i<all.length; i++){
	      System.out.print(all[i]);
	    }
	    System.out.println(); 
	  }
	  
	  
	  public void changeLast(char oldChar, char newChar, String s1){
	    last = s1.toCharArray(); 
	    for(int i=last.length-1; i>=0; i--){
	      if(last[i]==oldChar){
	        last[i]=newChar;
	        break;
	      }
	    }
	    System.out.print("Replaced last matching char for string 1 = ");
	    for(int i=0;i<last.length; i++){
	      System.out.print(last[i]);
	    }
	    System.out.println(); 
	  }
	  
	  public void chotoWord(String u1){
	    lower = u1.toCharArray();
	    for(int i=0; i<lower.length; i++){
	      code= u1.codePointAt(i);
	      lower[i]=(char)(code+32);
	    }
	    System.out.print("Entered String in Lower case = ");
	    for(int i=0; i<lower.length; i++){
	      System.out.print(lower[i]);
	    }
	    System.out.println();
	  }
	  
	  public void boroWord(String u2){
	    upper = u2.toCharArray();
	    for(int i=0; i<upper.length; i++){
	      code= u2.codePointAt(i);
	      upper[i]=(char)(code-32);
	    }
	    System.out.print("Entered String in upper case = ");
	    for(int i=0; i<upper.length; i++){
	      System.out.print(upper[i]);
	    }
	    System.out.println();
	  }
	  
	  public void shoman(String e1, String e2){
	    equalOne= e1.toCharArray();
	    equalTwo= e2.toCharArray();
	    for(int i=0; i< equalOne.length; i++){
	      if(equalOne[i]!=equalTwo[i]){
	        st=false;
	        break;
	      }
	      else{
	        st=true;
	      }
	    }
	    
	    System.out.println("Equality for 2 inputs = "+st);
	  }
	  
	  public void caseChara(String e1, String e2){
	    for(int i=0; i< equalOne.length; i++){
	      case1=e1.codePointAt(i);
	      case2=e2.codePointAt(i);
	      if((case1==case2) || ((case1-32)==case2) || (case1==(case2-32)) || ((case1+32)==case2) || (case1==(case2+32))){
	        st=true;
	      }
	      else{
	        st= false;
	        break;
	      } 
	    }
	    System.out.println("IgnoreCase Equality for 2 inputs = "+st);
	  }
	  
	  
	  public void tulona(String e4, String e5){
	    com1=e4.toCharArray();
	    com2=e5.toCharArray();
	    shomanNa=0;
	    if(com1.length==com2.length){
	      for(int i=0; i< com1.length; i++){
	        if(com1[i]!=com2[i]){
	          shomanNa++;
	        }
	        
	      }
	      System.out.println("Compared result = "+shomanNa);
	    }
	    else if(com1.length!=com2.length){
	      if(com1.length>com2.length){
	        shongkha=  com1.length-com2.length;
	      }
	      if(com1.length<com2.length){
	        shongkha=  com2.length-com1.length;
	      }
	      for(int i=0; i< com1.length; i++){
	        if(com1[i]!=com2[i]){
	          shomanNa++;
	        }
	      }
	      System.out.println("Compared result = "+shomanNa+shongkha);
	    }
	  }

}
