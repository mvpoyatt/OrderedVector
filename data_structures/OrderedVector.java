/*  Michael Poyatt
    Your rohan class account number
*/

package data_structures;

import java.util.Iterator;
import java.util.NoSuchElementException;

public interface OrderedVector<E> implements orderedListADT<E> {
    	private E[] storage;
	private int arraySize, currentsize;

	public Orderedvector()}
		arraySize = DEFAULT_MAX_CAPACITY;
		currentSize = 0;
		storage = (E[]) new Object[arraySize]

//  Adds the Object obj to the list in the correct position as determined by the Comparable interface.
    public void insert(E obj) {return null; }

//  Removes and returns the object located at the parameter index position (zero based).
//  Throws IndexOutOfBoundsException if the index does not map to a valid position within the list.
    public E remove(int index) {return null; }
    
//  Removes and returns the parameter object obj from the list if the list contains it, null otherwise.
    public E remove(E obj) {return null; }  
    
//  Removes and returns the smallest element in the list and null if the it is empty.
    public E removeMin() {return null; }
    
//  Removes and returns the largest element in the list and null if the it is empty.
    public E removeMax() {return null; )

//  Returns the parameter object located at the parameter index position (zero based).
//  Throws IndexOutOfBoundsException if the index does not map to a valid position within the underlying array
    public E get(int index) (return null; )
    
//  Returns the list object that matches the parameter, and null if the list is empty. 
//  This method is stable, if ojb matches more than one element, the element that
//  has been in the list longest is returned.
    public E get(E obj) {return null; }
    
//  Returns the index of the first element that matches the parameter obj
//  and null if the item is not in the list.
    public int find(E obj) {return 0; } 

//  Returns true if the parameter object obj is in the list, false otherwise.
    public boolean contains(E obj) {return false; }
