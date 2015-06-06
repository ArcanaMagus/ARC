public Object get(Object key)
// pre: key is non-null Object
// post: returns value associated with key, or non-null
{
	int hash = locate(key);
	Association z = data[hash];
	if ( z == null || z == reserved) return null;
	return data[hash].value();
}