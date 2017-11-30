/**
Jacob Haig
Chapter 6 
problem 4
part 1 of 2
 */
package problemFour;

public class main {

	public static void main(String[] args) {
		Item a1 = new Item("Jacketo", 12, 59.95);
		Item a2 = new Item("Designer Jeanso", 40, 34.95);
		Item a3 = new Item("Shirto", 20, 24.95);
		
		System.out.println("We have " + a1.getUnitsOnHand() + " " + 
		a1.getDescription() + "s on hand. They cost " + a1.getPrice() + " each.");
		
		System.out.println("We have " + a2.getUnitsOnHand() + " " +
		a2.getDescription() + "s on hand. They cost " + a2.getPrice() + " each.");
		
		System.out.println("We have " + a3.getUnitsOnHand() + " " + 
		a3.getDescription() + "s on hand. They cost " + a3.getPrice() + " each.");
	}
}
