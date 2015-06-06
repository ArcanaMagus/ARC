public boolean contains(Object value)
// pre: value is non-null Object
// post: returns true if hash table contains value
{
	Iterator i = elements();
	for (;i.hasMoreElements();i.nextElement())
	{
		// the value we seek?
		if (i.value() != null &&
			i.value().equals(value)) return true; // yes!
	}
	// no value found
	return false;
}

public boolean containsKey(Object key)\
// pre: key is a non-null Object
// post: returns true if key exists within hash table
{
	int hash = locate(key);
	return data[hash] != null && data[hash] != reserved;
}