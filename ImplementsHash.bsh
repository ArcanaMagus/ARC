protected static Association reserved =
			new Association("reserved", null);
protected Association data[];
protected int count;
protected int capacity;
protected final double loadFactor = 0.6;

public HashTable(int initialCapacity)
// pre: initialCapacity > 0
// post: constructs a new HashTable
// 		 holding initialCapacity elements
{
	data = new Association[initialCapacity];
	capacity = initialCapacity;
	count = 0;
}

public HashTable()
// post: constructs a new HashTable
{
	filter(65533);
}