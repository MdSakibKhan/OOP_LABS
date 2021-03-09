public class CheckingAccount extends Account{
  static int numberOfAccount=0;
  public CheckingAccount(){
    super(0.0);
    numberOfAccount++;
  }
  public CheckingAccount(double s){
    super(s);
    numberOfAccount++;
  }
}