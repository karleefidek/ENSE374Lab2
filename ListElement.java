/*
Karlee Fidek
200386366

ENSE 374 Lab
Assignment 2
October 3, 2019

class adapted from douglatr
 */
 
public class ListElement {
	
	//list element to link to another element, data to hold a value
	private ListElement next;
	private int data;
	
	//initial constructor	
	public ListElement()
	{
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
	
	//sets link to given element
	public void setNext(ListElement next)
	{
		this.next = next;
	}
	
	//gets linked element
	public ListElement getNext()
	{
		return this.next;
	}
}