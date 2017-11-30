/**
Jacob Haig
Chapter 6 
Class Circle
part 2 of 2
 */
package Classes;

public class circle {
	circle(){
		radius = 0;
	}
	circle(double r){
		radius = r;
	}
	
	private double radius;
	private double PI = Math.PI;
	
	public void 	setRadius(double r)	{	radius = r;			}
	public double 	getRadius()			{	return radius;		}
	public double 	getDiameter()		{	return 2 * radius;	}
	public double 	getPI() 			{	return PI;			}
	public double 	getArea()			{	return Math.pow(radius, 2) * Math.PI;	}
	public double   getCircumference()	{	return 2 * Math.PI * radius;	}
}
