package elecDB;

public interface DatabaseOperations 
{

	public boolean add (Item e);
	public void clear ();
	public boolean contains (Item e);
	public boolean isEmpty ();
	public Iterator<Item> iterator ();
	public boolean remove (Item e);
	public int size ();

}