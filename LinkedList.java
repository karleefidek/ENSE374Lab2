/*
Karlee Fidek
200386366

ENSE 374 Lab
Assignment 2
October 3, 2019
*/

public class LinkedList{
    
    ListElement head = new ListElement();
    
    public LinkedList()
    {
        head = null;
    }
    
    public void addElement(ListElement le)
    {
        if(head == null)
        {
            head = le;
        }
        
        else
        {
            ListElement currPtr = head;
            
            while(currPtr.getNext() != null)
            {
                currPtr = currPtr.getNext();
            }
            
            currPtr.setNext(le);
        }
    }
    
    public ListElement getElement(int index)
    {
        if(head == null)
        {
            return null;
        }
        else
        {
            ListElement tempPtr = head;
            
            while((tempPtr.getNext() != null) && (tempPtr.getData() != index))
            {
                tempPtr = tempPtr.getNext();
            }
            
            if(tempPtr.getData() == index)
            {
                return tempPtr;
            }
            else
            {
                return null;
            }
        }
    }
    
    public ListElement deleteElement(int index)
    {
        if(head == null)
        {
            return null;
        }
        else
        {
            ListElement tempPtr = head;
            ListElement prevPtr = null;
        
            while((tempPtr.getNext() != null) && (tempPtr.getData() != index))
            {
                prevPtr = tempPtr;                
                tempPtr = tempPtr.getNext();
            }   
        
            if(tempPtr.getData() == index)
            {
                prevPtr.setNext(tempPtr.getNext());
                return tempPtr;
            }
            else
            {
                return null;
            }
        }
            
    }
    
    public void printLinkedListHead()
    {
        if(head != null)
        {
            ListElement tempPtr = head;
        
            while(tempPtr != null)
            {
                System.out.print(tempPtr.getData() + " --> ");
                tempPtr = tempPtr.getNext();
            }   
        }
    }
    
    public static void main (String[] args)
    {
        LinkedList list = new LinkedList();
        ListElement element = new ListElement();
        
        element.setData(5);
        list.addElement(element);
        
        element.setData(2);
        list.addElement(element);
        
        element.setData(9);
        list.addElement(element);
        
        list.printLinkedListHead();
        
        list.deleteElement(5);
        
        list.printLinkedListHead();
    }
}