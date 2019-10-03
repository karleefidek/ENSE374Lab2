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
        ListElement tempPtr = head;
        
        if(head == null)
        {
            return null;
        }
        else
        {
            if(head.getData() == index)
            {
                head = head.getNext();
                return tempPtr;
            }
            else
            {
                tempPtr = head.getNext();
                ListElement prevPtr = head;
        
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
    }
    
    public void printLinkedListHead()
    {
        if(head != null)
        {
            ListElement tempPtr = head;
        
            while(tempPtr.getNext() != null)
            {
                System.out.print(tempPtr.getData() + " --> ");
                tempPtr = tempPtr.getNext();
            } 
            
            System.out.print(tempPtr.getData());
        }
        else
        {
            System.out.print("No list to print.");
        }
        
        System.out.println();
    }
    
    public static void main (String[] args)
    {
        LinkedList list = new LinkedList();
        ListElement e1 = new ListElement();
        ListElement e2 = new ListElement();
        ListElement e3 = new ListElement();
        ListElement e4 = new ListElement();
        ListElement e5 = new ListElement();
        
        e1.setData(5);
        list.addElement(e1);
        
        e2.setData(2);
        list.addElement(e2);
        
        e3.setData(9);
        list.addElement(e3);
        
        list.printLinkedListHead();
        
        list.deleteElement(5);
        
        list.printLinkedListHead();
        
        e4.setData(15);
        list.addElement(e4);
        
        e5.setData(4);
        list.addElement(e5);
        
        list.printLinkedListHead();
        
        list.deleteElement(15);
        
        list.printLinkedListHead();
    }
}