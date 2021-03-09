public class Car{
  static int count=0;
  int year;
  static int getObjectCount(){
    return count;
  }
  public Car(int year){
    this.year=year;
    count++;
  }
  int getYear(){
    return year;
  }
}