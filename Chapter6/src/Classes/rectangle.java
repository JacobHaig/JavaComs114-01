/**
Jacob Haig
Chapter 6 
Class Rect
part 2 of 2
 */
package Classes;

public class rectangle{
	rectangle(){
		wid = 0;
		len = 0;
	}
	rectangle(double l, double w){
		wid = w;
		len = l;
	}
	
	private double len;
	private double wid;
	
	public void 	setWid(double a){	wid = a;	}
	public double 	getWid()		{	return wid;	}
	public void 	setLen(double a){	len = a;	}
	public double	getLen()		{	return len;	}
	public double 	getArea()		{	return wid * len;	}
	public double   getHypot()		{	return Math.hypot(wid, len);	}
}