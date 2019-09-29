/*
Karlee Fidek
200386366

ENSE 374 Lab
Assignment 2
October 3, 2019
*/

public class LinkedList(){
    
    ListElement head = new ListElement();
    ListElement currentPointer = new ListElement();
    
    public LinkedList()
    {
        head = null;
        currentPointer = null;
    }
    
    public void addElement(ListElement le)
    {
        if(head == null)
        {
            head == le;
            currentPointer = head;
        }
        
        else
        {
            currentPointer.setNext(le);
            currentPointer = currentPointer.getNext();
        }
    }
    
    public ListElement getElement(int index)
    {
        
    }
    
    public ListElement deleteElement(int index)
    {
        
    }
    
    public void printLinkedListHead()
    {
        
    }
}