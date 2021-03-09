public class spehere extends Point
{
  double volume;
  spehere(double r){
    super(r);
  }
  double space ( ){
    volume=(4/3)*Math.PI*getRadius()*getRadius()*getRadius();
    return volume;
  }
}