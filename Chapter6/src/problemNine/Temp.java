/**
Jacob Haig
Chapter 6 
problem 9
part 2 of 2
 */
package problemNine;

public class Temp {
	public double ftemp;
	
	Temp(double temp){
		ftemp = temp;
	}
	
	public void setFahrenheit(double temp){	ftemp = temp;	}
	public double getFahrenheit()		{	return ftemp;	}
	public double getCelsius()		{	return ((5.0 / 9.0) * (ftemp - 32.0));	}
	public double getKelvin()		{	return getCelsius() + 273.0;	}
	
}
