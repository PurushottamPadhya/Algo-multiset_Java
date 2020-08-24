package implementation;

import java.util.ArrayList;
import java.util.List;

/**
 * Array implementation of a multiset.  See comments in RmitMultiset to
 * understand what each overriden method is meant to do.
 *
 * @author Jeffrey Chan & Yongli Ren, RMIT 2020
 */
public class ArrayMultiset extends RmitMultiset
{

	// This is a dyanmic array with ArrayMultiset
	private String[] dynamicArray;

	// current Size of the array
	int size;

	//total capacity of the array
	int capacity;

	public ArrayMultiset() {

		dynamicArray = new String[1];
		size = 0;
		capacity = 1;
	}

    @Override
	public void add(String elem) {
        // Implement me!
    	// check if size if full or not if full then increase size by one on every addition
    	if (size == capacity) {
    		this.increaseSize(capacity);
    	}
    	dynamicArray[size] = elem;
    	size++;


    } // end of add()


    @Override
	public int search(String elem) {
        // Implement me!
    	int countInstances = 0;
    	for (String item : dynamicArray) {
    		if (item.equals(elem)) {
    			countInstances ++;
    		}
    	}

    	if (countInstances > 0 )
    		return countInstances;
        // Placeholder, please update.
        return searchFailed;
    } // end of search()


    @Override
    public List<String> searchByInstance(int instanceCount) {

    	List<String> searchInstances = new ArrayList<String>();

    	ArrayMultiset tempKeys = new ArrayMultiset();
    	ArrayMultiset tempValues = new ArrayMultiset();


    	for(int i = 0 ; i < size ; i++) {
    		String key = dynamicArray[0];
    		if(tempKeys.contains(key)) {
    			int previousInstance = Integer.parseInt(tempValues.dynamicArray[i]);
    			tempValues.dynamicArray[i] = String.valueOf(previousInstance + 1)  ;
    		}
    		else {
    			tempKeys.add(key);
    			tempValues.add("1");
    		}

    	}

    	// check if there is a value of instances matched with the presented number of instances of the key
    	for(String value: tempValues.dynamicArray) {

    		if (Integer.parseInt(value) == instanceCount) {
    			searchInstances.add(value);
    		}
    	}


    	if (searchInstances.size() > 0 ) return searchInstances;



        // Placeholder, please update.
        return null;
    } // end of searchByInstance


    @Override
	public boolean contains(String elem) {
        // Implement me!
    	for(String key : dynamicArray) {
    		if (key.equals(elem)) {
    			return true;
    		}
    	}

        // Placeholder, please update.
        return false;
    } // end of contains()


    @Override
	public void removeOne(String elem) {
        // Implement me!
    	if (this.contains(elem)) {
    		String [] tempArray = new String[--this.size];
    		boolean found = false;
    		for(int i = 0; i < size; i ++) {
        		if (dynamicArray[i].equals(elem) && !found) {
        			found = true;
        		}
        		else {
        			tempArray[i] = dynamicArray[i];
        		}

        	}
    		dynamicArray = tempArray;
    		this.size -=1;
    		this.capacity -=1;
    	}

    } // end of removeOne()


    @Override
	public String print() {

        // Placeholder, please update.
        return new String();
    } // end of OrderedPrint


    @Override
	public String printRange(String lower, String upper) {

        // Placeholder, please update.
        return new String();
    } // end of printRange()


    @Override
	public RmitMultiset union(RmitMultiset other) {

        // Placeholder, please update.
        return null;
    } // end of union()


    @Override
	public RmitMultiset intersect(RmitMultiset other) {

        // Placeholder, please update.
        return null;
    } // end of intersect()


    @Override
	public RmitMultiset difference(RmitMultiset other) {

        // Placeholder, please update.
        return null;
    } // end of difference()


    /*increasing size of the array
     * First create tempArray with the size increment by 1
     * transfer all the data from the dynamic Array to temp Array
     * Finally store tempArray on dynamic Array with remaining one empty size at the end
     * increase the capacity of the dynamic array by 1 each time
     */

    public void increaseSize(int currentCapacity) {
    	String[] tempArray = new String[++currentCapacity];
    	for (int i = 0 ; i < currentCapacity; i++) {

    		tempArray[i] = dynamicArray[i];
    	}

    	dynamicArray = tempArray;
    	capacity = currentCapacity++;
    	System.out.println("new size of the array is : " + capacity);
    }


    // these are the getter and setter for the attributes I have created
	public String[] getDynamicArray() {
		return dynamicArray;
	}

	public void setDynamicArray(String[] dynamicArray) {
		this.dynamicArray = dynamicArray;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	// two aditional method to get index value and set value for the index
	public String getIndexValue(int index) {
		return this.dynamicArray[index];
	}
	public void  setValueIndex(String value, int index) {
		 this.dynamicArray[index] = value;
	}



} // end of class ArrayMultiset
