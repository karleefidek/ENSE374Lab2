/*
Karlee Fidek
200386366

ENSE 374 Lab
Assignment 2
October 3, 2019
*/

public class LinkedList{
    //list element at beginning of list
    ListElement head = new ListElement();
    
    //initial constructor
    public LinkedList()
    {
        head = null;
    }
    
    //adds given element to list
    public void addElement(ListElement le)
    {
        if(head == null)
        {
            //no elements, adds element at beginning
            head = le;
        }
        
        else
        {
            ListElement currPtr = head;
            
            while(currPtr.getNext() != null)
            {
                //loops to the last element in the list
                currPtr = currPtr.getNext();
            }
            
            //links new element to the last element in the list
            currPtr.setNext(le);
        }
    }
    
    public ListElement getElement(int index)
    {   
        //dummy element used if wanted element DNE
        ListElement notFound = new ListElement();
        
        if(head == null)
        {
            //no elements, return dummy element
            return notFound;
        }
        else
        {
            ListElement tempPtr = head;
            
            //searches till end of list to find element with given value
            while((tempPtr.getNext() != null) && (tempPtr.getData() != index))
            {
                tempPtr = tempPtr.getNext();
            }
            
            if(tempPtr.getData() == index)
            {
                //if element exists in list, return it
                return tempPtr;
            }
            else
            {
                //element DNE in list, return dummy element
                return notFound;
            }
        }
    }
    
    public ListElement deleteElement(int index)
    {
        //dummy element to be used if element DNE
        ListElement notFound = new ListElement();
        ListElement tempPtr = head;
        
        if(head == null)
        {
            //no elements, return dummy element
            return notFound;
        }
        else
        {
            if(head.getData() == index)
            {
                //return head if it is the same as given value
                head = head.getNext();
                return tempPtr;
            }
            else
            {
                //if element is not in head, look through rest of list
                tempPtr = head.getNext();
                ListElement prevPtr = head;
        
                while((tempPtr.getNext() != null) && (tempPtr.getData() != index))
                {
                    //searches rest of list for element with given value
                    prevPtr = tempPtr;                
                    tempPtr = tempPtr.getNext();
                }   
        
                if(tempPtr.getData() == index)
                {
                    //if element was found, link the previous element
                    //to the next element after the one you want to delete
                    //which removes the element from the list
                    prevPtr.setNext(tempPtr.getNext());
                    //return deleted element
                    return tempPtr;
                }
                else
                {
                    //not found, return dummy element
                    return notFound;
                }   
            }
        }    
    }
    
    public void printLinkedListHead()
    {
        if(head != null)
        {
            //starts at beginning of list - head
            ListElement tempPtr = head;
        
            while(tempPtr.getNext() != null)
            {
                //outputs value of each element and then progresses
                //to next element
                System.out.print(tempPtr.getData() + " --> ");
                tempPtr = tempPtr.getNext();
            } 
            
            System.out.print(tempPtr.getData());
        }
        else
        {
            //no elements in list, print default statement
            System.out.print("No list to print.");
        }
        
        System.out.println();
    }
    
    public static void main (String[] args)
    {
        //creates instance of linked lists and multiple list elements
        LinkedList list = new LinkedList();
        ListElement e1 = new ListElement();
        ListElement e2 = new ListElement();
        ListElement e3 = new ListElement();
        ListElement e4 = new ListElement();
        ListElement e5 = new ListElement();
        
        //sets value of element and adds it to the linked list
        e1.setData(5);
        list.addElement(e1);
        
        //sets value of element and adds it to the linked list
        e2.setData(2);
        list.addElement(e2);
        
        //sets value of element and adds it to the linked list
        e3.setData(9);
        list.addElement(e3);
        
        //prints linked list from head
        list.printLinkedListHead();
        
        //deletes element from list
        System.out.println("Delete element with value of " + list.deleteElement(5).getData() + ". . .");
        
        //prints linked list from head
        list.printLinkedListHead();
        
        //sets value of element and adds it to the linked list
        e4.setData(15);
        list.addElement(e4);
        
        //sets value of element and adds it to the linked list
        e5.setData(4);
        list.addElement(e5);
        
        //prints linked list from head
        list.printLinkedListHead();
        
        //deletes element from list
        System.out.println("Delete element with value of " + list.deleteElement(15).getData() + ". . .");
        
        //prints linked list from head
        list.printLinkedListHead();
        
        //retrieves element from list
        System.out.println("Retrieved element with value of " + list.getElement(9).getData() + " from the list");
    }
}