package elecDB;

import java.util.HashSet;

// Wrapper class for the database
public class Database implements DatabaseOperations
{

	private HashSet<Item> db = new HashSet<Item>();

	public boolean add (Item e)
	{
		return db.add(e);
	}






	public void clear ()
	{
		db.clear();
	}






	public boolean contains (Item e)
	{
		return db.contains(e);
	}






	public boolean isEmpty ()
	{
		return db.isEmpty();
	}






	public Iterator<Item> iterator ()
	{
		return db.iterator();
	}






	public boolean remove (Item e)
	{
		return db.remove();
	}






	public int size ()
	{
		return db.size();
	}


}