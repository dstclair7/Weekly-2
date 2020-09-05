
public interface BagInterface<T> {
	
	// gets the current number of items in the bag 
	public int getCurrentSize();

	// checks if the bag is empty
	public boolean isEmpty();
	
	// adds an item to the bag
	public boolean add(T anEntry);
	
	// removes a specific entry from the bag
	public boolean remove(T anEntry);
	
	// clears the bag
	public void clear();
	
	// retrieves all entries from the bag
	public T[] toArray();
	
	
}
