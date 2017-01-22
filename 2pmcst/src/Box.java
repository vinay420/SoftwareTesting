
public class Box 
{
	
private double length,breadth,height;

public void setLength(double l)
{
	length=l;
	
}
public void setBreadth(double b)
{
	breadth=b;
	
}
public void setHeight(double h)
{
	height=h;
}
public double volume()
{
	return length*breadth*height;
}
public static void main(String[] args) {
	Box b=new Box();
	b.setLength(10);
	b.setBreadth(20);
	b.setHeight(30);
	System.out.println("volume of the box"+ b.volume());
}
}
