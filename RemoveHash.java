public Object remove(Object key)
// pre: key is non-null Object
// post: removes key-value pair associated with key
{
	int hash = locate(key);
	Association z = data[hash];
	if ( z == null || z == reserved) {
		return null;
	}
	count--;
	Object oldValue = a.value();
	data[hash] = reserved; // in case anyone depends on us
	return oldValue;
}