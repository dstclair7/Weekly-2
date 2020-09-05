
public final class Bag<T> implements BagInterface<T> 
{
	
	private T[] bag;
	private int numberOfEntries;
	private boolean integrityCheck = false;
	
	public void ArrayBag(int bagCapacity)
	{
		T[] tempBag = (T[])new Object[bagCapacity];
		bag = tempBag;
		numberOfEntries = 0;
		integrityCheck = true;
	}
	
	
	// adds a new entry to the bag
	// @param anEntry The object to be added to the bag
	// @return True if the add works, false if not
	public boolean add(T anEntry)
	{
		checkIntegrity();
		boolean result = true;
		if (isArrayFull())
		{
			result = false;
		}
		else
		{
			bag[numberOfEntries] = anEntry;
			numberOfEntries++;
		}
		return result;
	}
	
	public T[] toArray()
	{
		checkIntegrity();
		
		T[] result = (T[])new Object[numberOfEntries];
		
		for (int index=0;index<numberOfEntries;index++)
		{
			result[index] = bag[index];
		}
		return result;
	}
	
	public boolean isEmpty()
	{
		return numberOfEntries == 0;
	}
	
	public int getCurrentSize()
	{
		return numberOfEntries;
	}
	
	public boolean remove(T anEntry)
	{
		checkIntegrity();
		int index = getIndexOf(anEntry);
		T result = removeEntry(index);
		return anEntry.equals(result);
	}
	
	private boolean isArrayFull()
	{
		return numberOfEntries >= bag.length;
	}
	
	public void clear() 
	{
      while (!isEmpty())
         remove(null);
	} // end clear
	
	private int getIndexOf(T anEntry)
	{
		int where = -1;
		boolean found = false;
		int index = 0;
		
		while (!found && (index<numberOfEntries))
		{
			if (anEntry.equals(bag[index]))
			{
				found = true;
				where = index;
			}
			index++;
		}
		return where;
	}
	
	
	private T removeEntry(int givenIndex)
	{
		T result = null;
		
		if (!isEmpty() && (givenIndex>=0))
		{
			result = bag[givenIndex];
			int lastIndex = numberOfEntries - 1;
			bag[givenIndex] = bag[lastIndex];
			bag[lastIndex] = null;
			numberOfEntries--;
		}
		return result;
	}
	private void checkIntegrity()
	{
		if(!integrityCheck)
			throw new SecurityException("Bag object is corrupt");
	}

}
	


