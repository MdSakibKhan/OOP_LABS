public class Vehicle{
  int x,y;
  public String toString(){
    return ("("+x+","+y+")");
  }
  void moveUp(){
    ++y;
  }
  void moveLeft(){
    --x;
  }
  void moveDown(){
    --y;
}
  void moveRight(){
    x=0;
    y=0;
}
}

