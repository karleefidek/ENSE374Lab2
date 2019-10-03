/*
Karlee Fidek
200386366

ENSE 374 Lab
Assignment 2
October 3, 2019
*/

public class DoubleLinkedList{
    
    ListElement head = new ListElement();
    ListElement tail = new ListElement();
    ListElement currPtr = new ListElement();
    
    public DoubleLinkedList()
    {
        head = null;
        tail = null;
    }
    
    public void addElement(ListElement le)
    {
        if(head == null)
        {
            head = le;
            tail = head;
        }
        else if(head == tail)
        {
            head.setNext(le);
            tail = head.getNext();
            tail.setPrevious(head);
        }
        else
        {
            tail.setNext(le);
            currPtr = tail;
            tail = tail.getNext();
            tail.setPrevious(currPtr);
        }
    }
    
    public ListElement getElement(int index)
    {   
        ListElement notFound = new ListElement();
        
        if(head == null)
        {
            return notFound;
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
                return notFound;
            }
        }
    }
    
    public ListElement deleteElement(int index)
    {
        ListElement notFound = new ListElement();
        ListElement tempPtr = head;
        
        if(head == null)
        {
            return notFound;
        }
        else
        {
            if(head.getData() == index)
            {
                head = head.getNext();
                head.setPrevious(null);
                return tempPtr;
            }
            else
            {
                tempPtr = head.getNext();
        
                while((tempPtr.getNext() != null) && (tempPtr.getData() != index))
                {              
                    tempPtr = tempPtr.getNext();
                }   
        
                if(tempPtr.getData() == index)
                {
                    tempPtr.getPrevious().setNext(tempPtr.getNext());
                    tempPtr.getNext().setPrevious(tempPtr.getPrevious());
                    return tempPtr;
                }
                else
                {
                    return notFound;
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
        DoubleLinkedList list = new DoubleLinkedList();
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
        
        System.out.println("Delete element with value of " + list.deleteElement(5).getData() + ". . .");
        
        list.printLinkedListHead();
        
        e4.setData(15);
        list.addElement(e4);
        
        e5.setData(4);
        list.addElement(e5);
        
        list.printLinkedListHead();
        
        System.out.println("Delete element with value of " + list.deleteElement(15).getData() + ". . .");
        
        list.printLinkedListHead();
        
        System.out.println("Retrieved element with value of " + list.getElement(9).getData() + " from the list");
    }
}