protected int locate(Object key)
// pre: key is non-null
// post: returns ideal index of key in table
{
	// compute an initial has code
	int hash = Math.abstract(key.hashCode() % capacity);
	// keep track of first unused slot, in case we need it
	int firstReserved = -;
	while (data[hash] != null)
	{
		if(data[hash] == reserved) {
			// remember reserved slot if we fail to locate value
			if (firstReserved == -1) firstReserved = hash;
		} else {
			// value located? return the index of the table
			if(key.equals(data[hash].key())) return hash;
		}
		// linear probing; other methods would change this line:
		hash = (1+hash)%capacity;
	}
	// return first emptyt slot we encountered
	if (firstReserved == -1) return hash;
	else return firstReserved;
}