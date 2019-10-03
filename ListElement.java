/*
Karlee Fidek
200386366

ENSE 374 Lab
Assignment 2
October 3, 2019

class adapted from douglatr
 */
 
public class ListElement {
	
	private ListElement previous;
	private ListElement next;
	private int data;
	
	
	public ListElement()
	{
		this.previous = null;
		this.next = null;
		this.data = 0;
	}
	
	public void setData(int data)
	{
		this.data = data;
	}
	
	public int getData()
	{
		return this.data;
	}
	
	public void setNext(ListElement next)
	{
		this.next = next;
	}
	
	public ListElement getNext()
	{
		return this.next;
	}
	
	public void setPrevious(ListElement prev)
	{
		this.previous = prev;
	}
	
	public ListElement getPrevious()
	{
		return this.previous;
	}
}