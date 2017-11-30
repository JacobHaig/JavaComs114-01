/**
Jacob Haig
Chapter 6 
problem 4
part 2 of 2
 */
package problemFour;

public class Item {
	private String description;
	private int unitsOnHand;
	private double price;

	Item(String descript, int items, double cost){
		description = descript;
		unitsOnHand = items;
		price = cost;
	}
	
	public String getDescription()	{	return description;	}
	public int getUnitsOnHand()		{	return unitsOnHand;	}
	public double getPrice() 		{	return price;		}

	public void setDescription(String in)	{	description = in;	}
	public void setUnitsOnHand(int in) 		{	unitsOnHand = in;	}
	public void setPrice(double in) 		{	price = in;			}
}
