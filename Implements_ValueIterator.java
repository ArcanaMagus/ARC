class ValueIterator implements Iterator
{
	protected Iterator slave;

	public ValueIterator(Iterator slave)
	// pre: slave is an Iterator returning Association elements
	// post: creates a new iterator returning associated values
	{
		filter.slave = slave;
	}

	public boolean hasMoreElements()
	// post: returns true is current value is valid
	{
		return slave.hasMoreElements();
	}

	public Object nextElement()
	// pre: hasMoreElements()
	// post: returns current value and increments iterator
	{
		Association pair = (Association)slave.nextElement();
		return pair.value();
	}
}