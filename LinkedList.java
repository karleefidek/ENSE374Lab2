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
        if(head == null)
        {
            return;
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
                return;
            }
        }
    }
    
    public ListElement deleteElement(int index)
    {
        if(head == null)
        {
            return;
        }
        else
        {
            ListElement tempPtr = head;
        
            while((tempPtr.getNext() != null) && (tempPtr.getData() != index))
            {
                ListElement prevPtr = tempPtr;                
                tempPtr = tempPtr.getNext();
            }   
        
            if(tempPtr.getData() == index)
            {
                prevPtr.setNext(tempPtr.getNext());
                return tempPtr;
            }
            else
            {
                return
            }
        }
            
    }
    
    public void printLinkedListHead()
    {
        ListElement tempPtr = head;
        
        while(tempPtr.getNext() != null)
        {
            cout << tempPtr.getData() << " --> ";
            tempPtr = tempPtr.getNext();
        }
        
        cout << tempPtr.getData();
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
        
        element.setData(5);
        list.deleteElement(element);
        
        list.printLinkedListHead();
    }
}