public class circle extends Point
{
  double area;
  circle(double r)
  {
    super(r);
  }
  double space ( ) 
  {
    area=3.1416*getRadius()*getRadius();
    return area;
  }
}