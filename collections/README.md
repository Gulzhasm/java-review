# java-collections

1. Array use static memory allocation, int[] intArray = new int[1000]; is not effective for the memory allocation
2. Dynamic Array use dynamic memory allocation → **ArrayList and Vector**
3. ArrayList  is not Synchronized, Re-sizable array implementation of List, it allows duplicate values, it is an ordered collection, you cannot create an ArrayList of primitive types of int, float and char;
4. ArrayList methods in java include: 
**add, remove, size, get, set, clear, contains, indexOf, lastIndexOf, toArray, isEmpty, subList, iterator, and listIterator.**
5. Vector is Synchronized - **Thread Safe** - it will come with the cost, multithreaded environment can be slow, it will decrease the performance

