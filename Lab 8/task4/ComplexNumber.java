public class ComplexNumber extends RealNumber{
  double Unknown=1.0;
  ComplexNumber(){
    super(1);
  } 
  public String toString(){
    System.out.println(super.toString());
    return "ImaginaryPart: "+Unknown;
  }
  ComplexNumber(double d, double d1){
    super(d);
    Unknown=d1;
  }
  void check(){
    System.out.println("I am in complex class");
    ping();
    System.out.println("Checking ended");
  }
}