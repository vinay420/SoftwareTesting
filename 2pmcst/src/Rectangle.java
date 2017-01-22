
public class Rectangle {
	private double length,width;
	
		public void setlength(double l)
		{
		length=l;
		
		}
	public void setwidth(double w)
	{
		width=w;
		
	}
public double area()
{
	return length*width;
	
}
public static void main(String[] args) {
	Rectangle R=new Rectangle();
	R.setlength(5);
	R.setwidth(10);
	System.out.println("area of Rectangle"+R.area());
	
}
}
