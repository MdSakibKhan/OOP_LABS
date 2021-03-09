public class Vehicle2010{
  int x;
  int y;
  public String toString(){
    return "("+x+","+y+")";
  }
  public String moveLowerLeft() {
    x=-1;
    y=-1;
    return "("+x+","+y+")";
  }
  public String moveLeft(){
    x=0;
    y=0;
    return "("+x+","+y+")";
  }
  public String moveDown(){
    x=-1;
    y=-1;
    return "("+x+","+y+")";
  }
}