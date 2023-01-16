// Generic Item Object. Will be used as a parent class for components and other stuff
// An Item has a name, description, price, quantity, and image

package elecDB;

public class Item implements ItemAttributes
{

	private String name;
	private String description;
	private float  price;
	private int    quantity;
	//private OBJECT image; TODO: Learn how to store images


	// Default Constructor
	public Item (String setName, String setDesc, float setPrice, int setQuant)
	{

		name        = setName;
		description = setDesc;
		price       = setPrice;
		quantity    = setQuant;

	}


	// Getter methods
	public String getName ()        { return this.name; }
	public String getDescription () { return this.description; }
	public float  getPrice ()       { return this.price; }
	public int    getQuantity ()    { return this.quantity; }


	// Setter methods
	public void setName (String setName)        { this.name = setName; }
	public void setDescription (String setDesc) { this.description = setDesc; }
	public void setPrice (float setPrice)       { this.price = setPrice; }
	public void setQuantity (int setQuant)      { this.quantity = setQuant; }
	
}