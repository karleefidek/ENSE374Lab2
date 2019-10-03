/*
Karlee Fidek
200386366

ENSE 374 Lab
Assignment 2
October 3, 2019

class adapted from douglatr
 */
 
public class ListElement {
	
	//list elements to link to next and previous elements
	//data to hold a value
	private ListElement previous;
	private ListElement next;
	private int data;
	
	//initial constructor
	public ListElement()
	{
		this.previous = null;
		this.next = null;
		this.data = 0;
	}
	
	//sets data to given value
	public void setData(int data)
	{
		this.data = data;
	}
	
	//gets value from element
	public int getData()
	{
		return this.data;
	}
	
	//sets next to given element
	public void setNext(ListElement next)
	{
		this.next = next;
	}
	
	//gets element linked as the next element
	public ListElement getNext()
	{
		return this.next;
	}
	
	//sets previous to given element
	public void setPrevious(ListElement prev)
	{
		this.previous = prev;
	}
	
	//gets element linked as the previous element
	public ListElement getPrevious()
	{
		return this.previous;
	}
}