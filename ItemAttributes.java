// Interface for an Item Object

package elecDB;


interface ItemAttributes
{

	// Getter methods
	public String getName ();
	public String getDescription ();
	public float  getPrice ();
	public int    getQuantity ();

	// Setter methods
	public void setName (String setName);
	public void setDescription (String setDesc);
	public void setPrice (float setPrice);
	public void setQuantity (int setQuant);

}